package co.com.claro.ws.bean;

import co.com.claro.bd.MgwConfigCampo;
import co.com.claro.bd.MgwConfigValidacion;
import co.com.claro.bd.MgwConfigValidacionFacade;
import co.com.claro.bd.MgwConfigValidacionFacadeLocal;
import co.com.claro.bd.MgwDatafile;
import co.com.claro.bd.MgwDatafileFacade;
import co.com.claro.bd.MgwDatafileFacadeLocal;
import co.com.claro.bd.MgwMensajesCampos;
import co.com.claro.bd.MgwMensajesCamposFacade;
import co.com.claro.bd.MgwMensajesCamposFacadeLocal;
import co.com.claro.bd.MgwPreagenda;
import co.com.claro.bd.MgwPreagendaFacade;
import co.com.claro.bd.MgwPreagendaFacadeLocal;
import co.com.claro.bd.Webservices;
import co.com.claro.bd.WebservicesFacade;
import co.com.claro.bd.WebservicesFacadeLocal;
import co.com.claro.wsorder.exceptions.BusinessExceptionFault;
import co.com.claro.wsorder.util.Validations;
import co.com.claro.wsorder.vo.ScheduleValidationsRequest;
import co.com.claro.wsorder.vo.ScheduleValidationsResp;
import co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSPortType;
import co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSLocator;
import co.net.cable.Agendamiento.MGW.Servicios.GetWInfoWSPortTypeProxy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ejb.Stateless;
import javax.persistence.Query;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

/**
 * EJB ScheduleValidationsBean encargado realizar las validaciones
 * parametrizadas para el modulo de agendamiento.
 *
 * Creado el 17/07/2014
 *
 * @author
 * @version 1.0
 */
@Stateless(mappedName = "scheduleValidationsBean")
public class ScheduleValidationsBean implements ScheduleValidationsBeanLocal {

    private String validation;

    private String fieldName;
    /**
     *
     */
    private MgwPreagendaFacadeLocal mgwPreagendaFacadeLocal;
    private WebservicesFacadeLocal webservicesFacadeLocal;

    public ScheduleValidationsBean() {
        mgwPreagendaFacadeLocal = new MgwPreagendaFacade();
        webservicesFacadeLocal = new WebservicesFacade();
    }

    /*
	 * (non-Javadoc)
	 * 
	 * @see
	 * co.com.globalhitss.business.ScheduleValidationsBeanRemote#scheduleValidations
	 * (co.com.globalhitss.schedulevalidations.dto.ScheduleValidationsRequest)
     */
    @Override
    public ScheduleValidationsResp scheduleValidations(
            ScheduleValidationsRequest request) {
        try {
            Validations.requiredValidate(request);
            List<MgwConfigValidacion> validations = getValidations(
                    request.getTypeOT(), request.getAction());

            MgwPreagenda preAgenda = getPreAgenda(request.getTypeOT(),
                    request.getNumberOrder());

            for (MgwConfigValidacion mgwConfigValidacion : validations) {
                Method[] methods = this.getClass().getMethods();
                for (Method method : methods) {
                    if (method.getName().equals(
                            mgwConfigValidacion.getIdValidacionAgenda().getNombre())) {
                        method.invoke(this, preAgenda, mgwConfigValidacion);
                        break;
                    }
                }
            }

        } catch (InvocationTargetException e) {
            e.printStackTrace();
            if (e.getCause() instanceof BusinessExceptionFault) {
                BusinessExceptionFault businessExceptionFault = (BusinessExceptionFault) e.getCause();
                ScheduleValidationsResp response = new ScheduleValidationsResp();
                response.setEstado(businessExceptionFault.getErrorCode());
                response.setDescripcion(businessExceptionFault.getErrorMsg());
                String[] tokens = businessExceptionFault.getMessage().split(",");
                response.setValidacion(tokens[0]);
                response.setNombreCampo(tokens[1]);
                return response;
            } else {
                ScheduleValidationsResp response = new ScheduleValidationsResp();
                response.setEstado("failed");
                response.setDescripcion(e.toString());

                return response;
            }

        } catch (Exception e) {
            ScheduleValidationsResp response = new ScheduleValidationsResp();
            response.setEstado("failed");
            response.setDescripcion(e.toString());

            return response;
        }
        ScheduleValidationsResp response = new ScheduleValidationsResp();
        response.setEstado("Success");
        response.setDescripcion("Ha pasado las validaciones exitosamente");
        return response;
    }

    /**
     * M�todo encargado de realizar la validacion de las diferentes operaciones
     * de agendamiento.
     *
     * @param preagenda preagenda consultada.
     * @param configValidacion configuraci�n de validaci�n encontrada para
     * determinada acci�n.
     * @throws Exception por si ocurre un error al ejecutar la operaci�n.
     */
    public void validarAgenda(MgwPreagenda preagenda,
            MgwConfigValidacion configValidacion) throws Exception {
        List<MgwConfigCampo> mgwConfigCampos = (List<MgwConfigCampo>) configValidacion.getMgwConfigCampoCollection();
        for (MgwConfigCampo configCampo : mgwConfigCampos) {
            configCampo.getIdMensajesCampos();
            MgwMensajesCamposFacadeLocal mgwMensajesCamposFacadeLocal = new MgwMensajesCamposFacade();
            MgwMensajesCampos mensajesCampo = new MgwMensajesCampos(configCampo.getIdMensajesCampos());
            mensajesCampo = mgwMensajesCamposFacadeLocal.find(mensajesCampo);
            validation = configValidacion.getNombre();
            fieldName = mensajesCampo.getNombres();
            MgwDatafileFacadeLocal mgwDatafileFacadeLocal = new MgwDatafileFacade();
            MgwDatafile aux = new MgwDatafile(preagenda.getIdDatafile());
            aux = mgwDatafileFacadeLocal.find(aux);
            Object value = getValue(aux.getDatafile(), mensajesCampo.getVariable());
            compareField(value, configCampo.getValor(), configCampo.getOperador());
        }
    }

    /**
     * M�todo encargado de realizar la validacion de si hay cambios en RR.
     *
     * @param preagenda preagenda consultada.
     * @param configValidacion configuraci�n de validaci�n encontrada para
     * determinada acci�n.
     * @throws Exception por si ocurre un error al ejecutar la operaci�n.
     */
    public void validarCambiosRR(MgwPreagenda preagenda,
            MgwConfigValidacion configValidacion) throws Exception {
        List<MgwConfigCampo> mgwConfigCampos = (List<MgwConfigCampo>) configValidacion.getMgwConfigCampoCollection();
        validation = configValidacion.getNombre();
        String urls = getUrlWebService("GUARDA PREAGENDA");
        GetWInfoWSPortType port = new GetWInfoWSPortTypeProxy(urls);
        String response = "";//TODOport. save_w_info(preagenda.getTipoOrden(), preagenda.getOrden());
        if (!response.equalsIgnoreCase("OK")) {
            throw new BusinessExceptionFault("failed",
                    "Error al actualizar la informaci�n de la preagenda",
                    validation + "," + fieldName);
        }
        MgwPreagenda newPreagenda = mgwPreagendaFacadeLocal.find(preagenda);
        for (MgwConfigCampo configCampo : mgwConfigCampos) {
            MgwMensajesCampos mensajesCampo = configCampo.getMgwMensajesCampo();
            fieldName = mensajesCampo.getNombres();
            MgwDatafileFacadeLocal mgwDatafileFacadeLocal = new MgwDatafileFacade();
            MgwDatafile aux = new MgwDatafile(preagenda.getIdDatafile());
            aux = mgwDatafileFacadeLocal.find(aux);
            Object value = getValue(aux.getDatafile(), mensajesCampo.getVariable());
            compareField(value, newPreagenda, configCampo.getOperador());
        }
    }

    /**
     * M�todo encargado de comparar los valores del campo patametrizado y el de
     * la preagenda.
     *
     * @param valuePreagenda valor obtenido de la preagenda.
     * @param valuePreagendaNuevo valor obtenido de la preagenda despues de ser
     * actualizada.
     * @param operador operador de comparaci�n.
     * @throws BusinessExceptionFault por si ocurre un error al ejecutar la
     * operaci�n.
     */
    private void compareField(Object valuePreagenda, Object valuePreagendaNuevo, String operador) throws BusinessExceptionFault {

        if (!operador.equalsIgnoreCase("COMPARAR")) {
            throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para la actual validaci�n", validation + "," + fieldName);
        } else {
            if (valuePreagenda == null) {
                if (valuePreagendaNuevo != null) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else if (valuePreagenda instanceof String) {
                String valueString = (String) valuePreagenda;
                if (!valueString.equals(valuePreagendaNuevo)) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else if (valuePreagenda instanceof List) {
                compareObject(valuePreagenda, valuePreagendaNuevo);
            } else if (valuePreagenda instanceof Integer) {
                Integer valueInt = null;
                Integer valueIntNuevo = null;
                try {
                    valueInt = (Integer) valuePreagenda;
                    valueIntNuevo = (Integer) valuePreagendaNuevo;
                } catch (ClassCastException e) {
                    throw new BusinessExceptionFault("failed", "El valor del campo de la preagenda actualizada no es numerico", validation + "," + fieldName);
                }
                if (!valueInt.equals(valueIntNuevo)) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else {
                compareObject(valuePreagenda, valuePreagendaNuevo);
            }
        }

    }

    /**
     * M�todo encargado de comparar si 2 objetos son o no iguales.
     *
     * @param object1 objeto 1 a comparar.
     * @param object2 objeto 2 a comparar.
     * @throws BusinessExceptionFault por si ocurre un error al ejecutar la
     * operaci�n.
     */
    private <T> void compareObject(T object1, T object2) throws BusinessExceptionFault {

        if ((object1 == null && object2 != null) | (object2 == null && object1 != null)) {
            throw new BusinessExceptionFault("failed", "Hay cambios en la preagenda", validation + "," + fieldName);
        } else if (object1 instanceof List<?>) {
            List<?> list1 = (List<?>) object1;
            List<?> list2 = (List<?>) object2;
            if (list1.size() != list2.size()) {
                throw new BusinessExceptionFault("failed", "Hay cambios en la preagenda", validation + "," + fieldName);
            }
            for (int i = 0; i < list1.size(); i++) {
                compareObject(list1.get(i), list2.get(i));
            }
        } else if (object1 instanceof Map<?, ?>) {
            Map<?, ?> map1 = (Map<?, ?>) object1;
            Map<?, ?> map2 = (Map<?, ?>) object2;
            if (map1.size() != map2.size()) {
                throw new BusinessExceptionFault("failed", "Hay cambios en la preagenda", validation + "," + fieldName);
            }
            Set<?> keySet = map1.keySet();
            for (Object key : keySet) {
                compareObject(map1.get(key), map2.get(key));
            }
        } else if (object1 instanceof String) {
            String string1 = (String) object1;
            String string2 = (String) object2;
            if (!string1.equals(string2)) {
                throw new BusinessExceptionFault("failed", "Hay cambios en la preagenda", validation + "," + fieldName);
            }
        } else if (object1 instanceof Integer) {
            Integer integer1 = (Integer) object1;
            Integer integer2 = (Integer) object2;
            if (!integer1.equals(integer2)) {
                throw new BusinessExceptionFault("failed", "Hay cambios en la preagenda", validation + "," + fieldName);
            }
        }

    }

    /**
     * M�todo encargado de comparar los valores del campo patametrizado y el de
     * la preagenda.
     *
     * @param valuePreagenda valor obtenido de la preagenda.
     * @param valueParam valor patametrizado para el campo.
     * @param operador operador de comparaci�n.
     * @throws BusinessExceptionFault por si ocurre un error al ejecutar la
     * operaci�n.
     */
    private void compareField(Object valuePreagenda, String valueParam, String operador) throws BusinessExceptionFault {

        if (operador.equalsIgnoreCase("IGUAL")) {
            if (valuePreagenda == null) {
                if (valueParam != null && !valueParam.isEmpty()) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else if (valuePreagenda instanceof String) {
                String valueString = (String) valuePreagenda;
                if (!valueString.equals(valueParam)) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else if (valuePreagenda instanceof List) {
                throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para un valor de tipo Lista", validation + "," + fieldName);
            } else if (valuePreagenda instanceof Integer) {
                Integer valueInt = (Integer) valuePreagenda;
                Integer paramInt = null;
                try {
                    paramInt = Integer.parseInt(valueParam);
                } catch (NumberFormatException e) {
                    throw new BusinessExceptionFault("failed", "El valor parametrizado en el campo no es numerico", validation + "," + fieldName);
                }
                if (!valueInt.equals(paramInt)) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else {
                throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para un valor de tipo Objeto", validation + "," + fieldName);
            }
        } else if (operador.equalsIgnoreCase("DIFERENTE")) {
            if (valuePreagenda == null) {
                if (valueParam == null || valueParam.isEmpty()) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else if (valuePreagenda instanceof String) {
                String valueString = (String) valuePreagenda;
                if (valueString.equals(valueParam)) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else if (valuePreagenda instanceof List) {
                throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para un valor de tipo Lista", validation + "," + fieldName);
            } else if (valuePreagenda instanceof Integer) {
                Integer valueInt = (Integer) valuePreagenda;
                Integer paramInt = null;
                try {
                    paramInt = Integer.parseInt(valueParam);
                } catch (NumberFormatException e) {
                    throw new BusinessExceptionFault("failed", "El valor parametrizado en el campo no es numerico", validation + "," + fieldName);
                }
                if (valueInt.equals(paramInt)) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else {
                throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para un valor de tipo Objeto", validation + "," + fieldName);
            }
        } else if (operador.equalsIgnoreCase("MAYOR")) {
            Integer paramInt = null;
            try {
                paramInt = Integer.parseInt(valueParam);
            } catch (NumberFormatException e) {
                throw new BusinessExceptionFault("failed", "El valor parametrizado en el campo no es numerico", validation + "," + fieldName);
            }
            if (valuePreagenda == null) {
                throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para un valor Nulo", validation + "," + fieldName);
            } else if (valuePreagenda instanceof String) {
                throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para un valor alfanumerico", validation + "," + fieldName);
            } else if (valuePreagenda instanceof List) {
                List<?> list = (List<?>) valuePreagenda;
                int size = list.size();
                if (size <= paramInt.intValue()) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else if (valuePreagenda instanceof Integer) {
                Integer valueInt = (Integer) valuePreagenda;
                if (valueInt.intValue() <= paramInt.intValue()) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else {
                throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para un valor de tipo Objeto", validation + "," + fieldName);
            }

        } else if (operador.equalsIgnoreCase("MENOR")) {

            Integer paramInt = null;
            try {
                paramInt = Integer.parseInt(valueParam);
            } catch (NumberFormatException e) {
                throw new BusinessExceptionFault("failed", "El valor parametrizado en el campo no es numerico", validation + "," + fieldName);
            }
            if (valuePreagenda == null) {
                throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para un valor Nulo", validation + "," + fieldName);
            } else if (valuePreagenda instanceof String) {
                throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para un valor alfanumerico", validation + "," + fieldName);
            } else if (valuePreagenda instanceof List) {
                List<?> list = (List<?>) valuePreagenda;
                int size = list.size();
                if (size >= paramInt.intValue()) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else if (valuePreagenda instanceof Integer) {
                Integer valueInt = (Integer) valuePreagenda;
                if (valueInt.intValue() >= paramInt.intValue()) {
                    throw new BusinessExceptionFault("failed", "No pasa la validaci�n", validation + "," + fieldName);
                }
            } else {
                throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para un valor de tipo Objeto", validation + "," + fieldName);
            }

        } else if (operador.equalsIgnoreCase("COMPARAR")) {
            throw new BusinessExceptionFault("failed", "El operador " + operador + " no deberia estar parametrizado para la actual validaci�n", validation + "," + fieldName);
        }

    }

    /**
     * M�todo encargado de obtener el valor de la preagenda en formato JSON
     * seg�n la variable parametrizada.
     *
     * @param json JSON con la informaci�n de la preagenda.
     * @param variable Variable parametrizada para obtener la informacion de un
     * campo.
     * @return valor obtenido del campo de la preagenda.
     * @throws Exception por si ocurre un error al ejecutar la operaci�n.
     */
    private Object getValue(String json, String variable) throws BusinessExceptionFault, Exception {

        ObjectMapper mapper = new ObjectMapper();

        // convert JSON string to Map
        Map<String, Object> map = mapper.readValue(json, new TypeReference<HashMap<String, Object>>() {
        });

        String variableFormato = variable.replaceAll(
                "\\[\"|\"\\]\\[\"|\"\\]\\[|\\[|\\]|\"\\]", "\\.").replaceAll(
                        "\\.\\.", "\\.");

        Object object = leerValorMapa(map, variableFormato);
        return object;

    }

    /**
     * M�todo encargado de obtener el valor de la estructura de datos generada a
     * partir del JSON de la preagenda segun la ruta parametrizada.
     *
     * @param map mapa con la informaci�n de la preagenda.
     * @param ruta ruta parametrizada.
     * @return Objeto con el valor segun la ruta.
     * @throws BusinessExceptionFault por si ocurre un error al ejecutar la
     * operaci�n.
     */
    @SuppressWarnings("unchecked")
    private Object leerValorMapa(Object map, String ruta) throws BusinessExceptionFault {

        Map<String, Object> mapa = null;
        List<?> lista = null;
        try {
            mapa = (Map<String, Object>) map;
        } catch (ClassCastException e) {
            lista = (ArrayList<?>) map;
        }
        String[] niveles = ruta.split("\\.");

        for (String nivel : niveles) {
            if (mapa != null) {
                for (String key : mapa.keySet()) {
                    if (nivel.equals(key)) {
                        ruta = ruta.replaceFirst(nivel + ".", "");
                        Object object = mapa.get(key);
                        if (object == null) {
                            if (!ruta.isEmpty()) {
                                throw new BusinessExceptionFault("failed", "Error en parametrizaci�n del campo, no hay mas niveles en donde buscar el campo", validation + "," + fieldName);
                            }
                            return object;
                        } else if (object instanceof String) {
                            if (!ruta.isEmpty()) {
                                throw new BusinessExceptionFault("failed", "Error en parametrizaci�n del campo, no hay mas niveles en donde buscar el campo", validation + "," + fieldName);
                            }
                            return object;
                        } else if (object instanceof List) {
                            if (ruta.isEmpty()) {
                                return object;
                            }
                            return leerValorMapa(object, ruta);
                        } else if (object instanceof Integer) {
                            if (!ruta.isEmpty()) {
                                throw new BusinessExceptionFault("failed", "Error en parametrizaci�n del campo, no hay mas niveles en donde buscar el campo", validation + "," + fieldName);
                            }
                            return object;
                        } else {
                            if (ruta.isEmpty()) {
                                return object;
                            }
                            return leerValorMapa(object, ruta);
                        }
                    }
                }
            } else {
                Integer posicion = null;
                try {
                    posicion = Integer.parseInt(nivel);
                } catch (NumberFormatException e) {

                }
                for (int i = 0; i < lista.size(); i++) {
                    if (posicion == null || posicion == i) {
                        ruta = ruta.replaceFirst(nivel + ".", "");
                        Object object = lista.get(i);
                        if (object == null) {
                            if (!ruta.isEmpty()) {
                                throw new BusinessExceptionFault("failed", "Error en parametrizaci�n del campo, no hay mas niveles en donde buscar el campo", validation + "," + fieldName);
                            }
                            return object;
                        } else if (object instanceof String) {
                            if (!ruta.isEmpty()) {
                                throw new BusinessExceptionFault("failed", "Error en parametrizaci�n del campo, no hay mas niveles en donde buscar el campo", validation + "," + fieldName);
                            }
                            return object;
                        } else if (object instanceof List) {
                            if (ruta.isEmpty()) {
                                return object;
                            }
                            return leerValorMapa(object, ruta);
                        } else if (object instanceof Integer) {
                            if (!ruta.isEmpty()) {
                                throw new BusinessExceptionFault("failed", "Error en parametrizaci�n del campo, no hay mas niveles en donde buscar el campo", validation + "," + fieldName);
                            }
                            return object;
                        } else {
                            if (ruta.isEmpty()) {
                                return object;
                            }
                            return leerValorMapa(object, ruta);
                        }
                    }
                }
            }

        }
        return null;
    }

    /**
     * M�todo encargado de obtener la preagenda.
     *
     * @param typeOT tipo de orden
     * @param numberOrder n�mero de la orden.
     * @return preagenda encontrada.
     * @throws BusinessExceptionFault por si ocurre un error al ejecutar la
     * operaci�n.
     */
    @SuppressWarnings("unchecked")
    private MgwPreagenda getPreAgenda(String typeOT, Long numberOrder) throws BusinessExceptionFault {

        Map<String, Object> params = new HashMap<>();
        params.put("TIPO_OT", typeOT);
        params.put("NUMERO_ORDEN", numberOrder);
        params.put("ESTADO", true);
        List<MgwPreagenda> preagendas = mgwPreagendaFacadeLocal.findWithfilters("Select p from MgwPreagenda p where p.tipoOrden = :TIPO_OT "
                + "and p.orden = :NUMERO_ORDEN and p.estado = :ESTADO", params);

        if (preagendas.isEmpty()) {
            throw new BusinessExceptionFault("failed", "No existe preagenda para la orden n�mero " + numberOrder + " y tipo " + typeOT, validation + "," + fieldName);
        }

        return preagendas.get(0);

    }

    /**
     * M�todo encargado de obtener las validaciones a ser aplicadas seg�n la
     * accion solicitada.
     *
     * @param typeOT tipo de orden.
     * @param action accion a ser consultadas sus validaciones.
     * @return lista de validaciones.
     */
    @SuppressWarnings("unchecked")
    private List<MgwConfigValidacion> getValidations(String typeOT, String action) {
        MgwConfigValidacionFacadeLocal mgwConfigValidacionFacadeLocal = new MgwConfigValidacionFacade();
        Map<String, Object> params = new HashMap<>();
        params.put("TIPO_OT", typeOT);
        params.put("ACCION", action);
        params.put("ESTADO", true);

        List<MgwConfigValidacion> validations = mgwConfigValidacionFacadeLocal.findWithfilters(
                "Select cv from MgwConfigValidacion cv where cv.tipoOrden = :TIPO_OT "
                + "and cv.mgwAccione.nombre = :ACCION and cv.estado = :ESTADO", params);

        return validations;

    }

    /**
     * M�todo encargado de obtener la URL de los servicios web.
     *
     * @param param nombre del servicio web
     * @return lista de webservices encontrados.
     * @throws Exception por si ocurre un error al ejecutar la operaci�n.
     */
    @SuppressWarnings("unchecked")
    private String getUrlWebService(String param) throws BusinessExceptionFault {
        String resultado = null;
        Map<String, Object> params = new HashMap<>();
        params.put("NOMBRE", param);
        List<Webservices> urls = webservicesFacadeLocal.findList(
                "Select w From Webservices w where w.descripcion = :NOMBRE",
                params);
        if (urls.isEmpty()) {
            throw new BusinessExceptionFault("MGW_3",
                    "Error de parametro no encontrado",
                    "El parametro del sistema " + param + " no existe");
        } else {
            resultado = urls.get(0).getUrl();
        }

        return resultado;
    }

}
