/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.globalhitss.ordermanager.ws;

import WS_SIEC_CancelarOrdenMGWInbound.TypeInboundInterfaceElement;
import WS_SIEC_CancelarOrdenMGWInbound.WS_SIEC_CancelarOrdenMGWInboundInterface;
import co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound.TypemessageT;
import co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound.TypemessagesT;
import co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound.TypesetMessageStatusRequestData;
import co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound.TypesetMessageStatusResponseData;
import co.com.amx.siec.etadirect.ws_siec_actualizarestadodemensajesinbound.TypeuserT;
import co.com.claro.bd.MgcDatosMovil;
import co.com.claro.bd.MgcDatosMovilFacade;
import co.com.claro.bd.MgcDatosMovilFacadeLocal;
import co.com.claro.bd.MgfPreActividad;
import co.com.claro.bd.MgfPreActividadFacade;
import co.com.claro.bd.MgfPreActividadFacadeLocal;
import co.com.claro.bd.MgfPreFactura;
import co.com.claro.bd.MgfPreFacturaFacade;
import co.com.claro.bd.MgfPreFacturaFacadeLocal;
import co.com.claro.bd.MgfPreItem;
import co.com.claro.bd.MgfPreItemFacade;
import co.com.claro.bd.MgfPreItemFacadeLocal;
import co.com.claro.bd.MgwAcciones;
import co.com.claro.bd.MgwAccionesFacade;
import co.com.claro.bd.MgwAccionesFacadeLocal;
import co.com.claro.bd.MgwAgenda;
import co.com.claro.bd.MgwAgendaEstados;
import co.com.claro.bd.MgwAgendaEstadosFacade;
import co.com.claro.bd.MgwAgendaEstadosFacadeLocal;
import co.com.claro.bd.MgwAgendaFacade;
import co.com.claro.bd.MgwAgendaFacadeLocal;
import co.com.claro.bd.MgwCaracteristicasAg;
import co.com.claro.bd.MgwCaracteristicasAgFacade;
import co.com.claro.bd.MgwCaracteristicasAgFacadeLocal;
import co.com.claro.bd.MgwCodResultado;
import co.com.claro.bd.MgwCodResultadoFacade;
import co.com.claro.bd.MgwCodResultadoFacadeLocal;
import co.com.claro.bd.MgwConciliacion;
import co.com.claro.bd.MgwConciliacionErrores;
import co.com.claro.bd.MgwConciliacionErroresFacade;
import co.com.claro.bd.MgwConciliacionErroresFacadeLocal;
import co.com.claro.bd.MgwConciliacionFacade;
import co.com.claro.bd.MgwConciliacionFacadeLocal;
import co.com.claro.bd.MgwConciliacionProcesos;
import co.com.claro.bd.MgwConciliacionProcesosFacade;
import co.com.claro.bd.MgwConciliacionProcesosFacadeLocal;
import co.com.claro.bd.MgwConfigValidacion;
import co.com.claro.bd.MgwConstantes;
import co.com.claro.bd.MgwConstantesFacade;
import co.com.claro.bd.MgwConstantesFacadeLocal;
import co.com.claro.bd.MgwDatafile;
import co.com.claro.bd.MgwDatafileFacade;
import co.com.claro.bd.MgwDatafileFacadeLocal;
import co.com.claro.bd.MgwDatafileTipo;
import co.com.claro.bd.MgwDatafileTipoFacade;
import co.com.claro.bd.MgwDatafileTipoFacadeLocal;
import co.com.claro.bd.MgwEstadoAgenda;
import co.com.claro.bd.MgwEstadoAgendaFacade;
import co.com.claro.bd.MgwEstadoAgendaFacadeLocal;
import co.com.claro.bd.MgwLogAuditoria;
import co.com.claro.bd.MgwLogAuditoriaFacade;
import co.com.claro.bd.MgwLogAuditoriaFacadeLocal;
import co.com.claro.bd.MgwOrden;
import co.com.claro.bd.MgwOrdenFacade;
import co.com.claro.bd.MgwOrdenFacadeLocal;
import co.com.claro.bd.MgwOrigen;
import co.com.claro.bd.MgwOrigenFacade;
import co.com.claro.bd.MgwOrigenFacadeLocal;
import co.com.claro.bd.MgwPreagenda;
import co.com.claro.bd.MgwProcesoOrdenes;
import co.com.claro.bd.MgwProcesoOrdenesFacade;
import co.com.claro.bd.MgwProcesoOrdenesFacadeLocal;
import co.com.claro.bd.Webservices;
import co.com.claro.bd.WebservicesFacade;
import co.com.claro.bd.WebservicesFacadeLocal;
import co.com.claro.wsorder.exceptions.BusinessExceptionFault;
import co.com.claro.wsorder.util.Constantes;
import co.com.claro.wsorder.util.DateUtil;
import co.com.claro.wsorder.util.EstadoEtaOrden;
import co.com.claro.wsorder.util.EstadosEtaDirectEnum;
import co.com.claro.wsorder.util.FuncionAsyncEnum;
import co.com.claro.wsorder.util.FuncionEnum;
import co.com.claro.wsorder.util.HashUtil;
import co.com.claro.wsorder.util.Operations;
import co.com.claro.wsorder.util.ServiciosEnum;
import co.com.claro.wsorder.util.Validations;
import co.com.claro.wsorder.vo.AssignResourceRequest;
import co.com.claro.wsorder.vo.BillingActivity;
import co.com.claro.wsorder.vo.CancelOrderRequest;
import co.com.claro.wsorder.vo.ClientUtils;
import co.com.claro.wsorder.vo.Material;
import co.com.claro.wsorder.vo.Response;
import co.com.claro.wsorder.vo.ScheduleValidationsRequest;
import co.com.claro.wsorder.vo.ScheduleValidationsResp;
import co.com.claro.wsorder.vo.SoftCloseRequest;
import co.com.claro.wsorder.vo.StatusMessageRequest;
import co.com.claro.wsorder.vo.TypeInboundInterfaceResponseElement;
import co.com.claro.wsorder.vo.UserElement;
import co.com.claro.wsorder.vo.UserOutBound;
import co.com.claro.wsorder.vo.UserT;
import co.com.globalhitss.util.configuracion.Configurador;
import co.com.globalhitss.util.configuracion.ParametrosIniciales;
import co.com.globalhitss.util.configuracion.Propiedades;
import com.oracle.xmlns.inbound.ws_siec_actualizarestadodemensajesinbound.WSSIECActualizarEstadoDeMensajesInboundClientEp;
import com.oracle.xmlns.inbound.ws_siec_actualizarestadodemensajesinbound.WSSIECActualizarEstadoDeMensajesInboundInterface;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ejb.Stateless;
import net.telmex.pcml.service.PcmlService;
import net.telmex.pcml.service.PcmlServiceProxy;
import net.telmex.pcml.service.WorkOrderInformation;
import net.telmex.ws.Management;
import net.telmex.ws.ManagementProxy;
import net.telmex.ws.QueryServiceCallRequest;
import net.telmex.ws.QueryServiceCallResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 *
 * @author rodriguezjavr
 */
@Stateless
public class OrderBean implements OrderBeanLocal {

    // Instancianci�n de las propiedades 
    private static Propiedades prop = Propiedades.getInstance();
    // Instancianci�n del logger 
    private static Logger logger = LogManager.getLogger(
            Constantes.LOGGER_PRINCIPAL.getValue());

    MgwEstadoAgendaFacadeLocal mgwEstadoAgendaFacadeLocal;

    MgwOrdenFacadeLocal mgwOrdenFacadeLocal;

    MgwCaracteristicasAgFacadeLocal caracteristicasAgFacadeLocal;

    MgfPreFacturaFacadeLocal mgfPreFacturaFacadeLocal;

    MgfPreActividadFacadeLocal mgfPreActividadFacadeLocal;

    MgwAgendaFacadeLocal mgwAgendaFacadeLocal;

    WebservicesFacadeLocal webservicesFacadeLocal;

    MgwConstantesFacadeLocal mgwConstantesFacadeLocal;

    MgwOrigenFacadeLocal mgwOrigenFacadeLocal;

    MgcDatosMovilFacadeLocal mgcDatosMovilFacadeLocal;

    MgwLogAuditoriaFacadeLocal mgwLogAuditoriaFacadeLocal;

    MgfPreItemFacadeLocal mgfPreItemFacadeLocal;

    MgwAgendaEstadosFacadeLocal mgwAgendaEstadosFacadeLocal;

    MgwCodResultadoFacadeLocal mgwCodResultadoFacadeLocal;

    MgwDatafileTipoFacadeLocal mgwDatafileTipoFacadeLocal;

    MgwDatafileFacadeLocal mgwDatafileFacadeLocal;

    MgwConciliacionErroresFacadeLocal mgwConciliacionErroresFacadeLocal;

    MgwAccionesFacadeLocal mgwAccionesFacadeLocal;

    MgwConciliacionProcesosFacadeLocal mgwConciliacionProcesosFacadeLocal;

    MgwConciliacionFacadeLocal mgwConciliacionFacadeLocal;

    MgwProcesoOrdenesFacadeLocal mgwProcesoOrdenesFacadeLocal;

    private int levelBDLog = 0;

    /**
     * Variable que encapsula BDlogSB
     */
    private StringBuilder BDlogSB;

    static {
        Configurador.configurar(
                Constantes.RUTA_ARCHIVO_PROPIEDADES.getValue(),
                Constantes.LOGGER_PRINCIPAL.getValue(),
                Constantes.APLICACION.getValue());
    }

    public OrderBean() {
        mgwConstantesFacadeLocal = new MgwConstantesFacade();
        webservicesFacadeLocal = new WebservicesFacade();
        mgwOrdenFacadeLocal = new MgwOrdenFacade();
        mgwEstadoAgendaFacadeLocal = new MgwEstadoAgendaFacade();
        mgwAgendaFacadeLocal = new MgwAgendaFacade();
        mgwOrigenFacadeLocal = new MgwOrigenFacade();
        mgcDatosMovilFacadeLocal = new MgcDatosMovilFacade();
        mgfPreFacturaFacadeLocal = new MgfPreFacturaFacade();
        mgfPreActividadFacadeLocal = new MgfPreActividadFacade();
        caracteristicasAgFacadeLocal = new MgwCaracteristicasAgFacade();
        mgwLogAuditoriaFacadeLocal = new MgwLogAuditoriaFacade();
        mgfPreItemFacadeLocal = new MgfPreItemFacade();
        mgwAgendaEstadosFacadeLocal = new MgwAgendaEstadosFacade();
        mgwCodResultadoFacadeLocal = new MgwCodResultadoFacade();
        mgwDatafileTipoFacadeLocal = new MgwDatafileTipoFacade();
        mgwDatafileFacadeLocal = new MgwDatafileFacade();
        mgwAccionesFacadeLocal = new MgwAccionesFacade();
        mgwConciliacionErroresFacadeLocal = new MgwConciliacionErroresFacade();
        mgwConciliacionProcesosFacadeLocal = new MgwConciliacionProcesosFacade();
        mgwConciliacionFacadeLocal = new MgwConciliacionFacade();
        mgwProcesoOrdenesFacadeLocal = new MgwProcesoOrdenesFacade();
    }


    @Override
    public Response softClose(SoftCloseRequest request) throws Exception {
        ParametrosIniciales ini = Configurador.iniciarTransaccion();
        Response response = new Response();
        logger.info(request);
        String[] ordenSplit = request.getAppt_number().split("_");
        if (ordenSplit.length <= 2) {
            throw new Exception("El formato de la orden " + request.getAppt_number()
                    + " no es valido");
        }
        try {
            BigDecimal nOrden = new BigDecimal(ordenSplit[0]);
        } catch (NumberFormatException e) {
            logger.error("Ha ocurrido un error ", e);
            throw new Exception("El formato de la orden " + ordenSplit[0]
                    + " no es valido");
        }

        String tipoOt = ordenSplit[1];
        String numOt = ordenSplit[0];

        Response resultado = new Response();

        String estadoETA = EstadoEtaOrden.SOFT_CLOSE.getDescripcion();
        String estadoRR = new String();
        String proceso = "SCL";
        Date llegadaMensaje = new Date();
        Date procesoMensaje = null;
        Map<String, Object> param = new HashMap<>();
        param.put("ORDEN", Long.parseLong(ordenSplit[0]));
        List<MgwOrden> listOrden = mgwOrdenFacadeLocal.findList("Select i From MgwOrden i where i.orden = :ORDEN", param);
        
        if (listOrden.isEmpty()) {
            throw new Exception("La orden " + ordenSplit[0]
                    + " no existe en la tabla MGW_ORDEN");
        }
                

        logger.info(FuncionEnum.SOFT_CLOSE.getDescripcion());

        if (tipoOt.equalsIgnoreCase("O")) {
            String urlPcml = getUrlWebService(Constantes.PCML_SERVICES.getValue());
            PcmlService pcmlService = new PcmlServiceProxy(urlPcml);
            Long lOrden = Long.getLong(ordenSplit[0]);
            WorkOrderInformation workOrderInformation = pcmlService.getWorkOrderInformation(lOrden);
            estadoRR = workOrderInformation.getWorkOrder().getEstadoOT();
        } else if (tipoOt.equalsIgnoreCase("L")) {
            String urlServiceCall = getUrlWebService(Constantes.PCML_SERVICESCALL.getValue());

            Management managementServiceCall = new ManagementProxy(urlServiceCall);
            QueryServiceCallRequest requestQuery = new QueryServiceCallRequest();
            requestQuery.setAplicacion("MGW");
            requestQuery.setProceso(FuncionEnum.SOFT_CLOSE.getDescripcion());
            requestQuery.setRolUsuario("OPERACIONES");
            requestQuery.setServiceCallNumber(ordenSplit[0]);
            requestQuery.setUsuario(request.getUser().getLogin());
            String verificacion = HashUtil.generaKey(
                    DateUtil.getCurrentDateAsString(), "queryServiceCallOp");
            QueryServiceCallResponse responseServiceCall = managementServiceCall
                    .queryServiceCallOp(requestQuery, verificacion);
            estadoRR = responseServiceCall.getStatDispatch();

        }

        try {
            List<MgwAgenda> agendas = getAgenda(request.getAppt_number());

            MgwOrigen origen = getOrigen(request.getOrigenId());
            if (!agendas.isEmpty() && origen != null) {
                MgwAgenda agenda = agendas.get(0);
                MgwEstadoAgenda estadoAgenda = getEstadoAgenda(Constantes.AGENDA_ESTADO_SOFTCLOSE.getValue());
                MgcDatosMovil tecnico = getTecnico(request.getTecnicoId());
                agenda.setIdtecnico(tecnico.getIdDatoMovil());
                agenda.setIdaliado(tecnico.getIdaliado() != null ? tecnico
                        .getIdaliado().longValue() : null);// 11-02-2015
                // Se mapea la entidad ALIADO
                agenda.setIdOrigen(origen);
                agenda.setNumticket(request.getIm());
                agenda.setIdCodresultado(getCodResultado(request.getRazon()));
                agenda.setObservacion(request.getObservacion());
                agenda.setIdEstadoAgenda(estadoAgenda);
                agenda.setEstadoCrm(estadoRR.charAt(0));

                MgwCaracteristicasAg caracteristicasAg = null;
                List<MgwCaracteristicasAg> listaMgwCaracteristicasAg
                        = (List<MgwCaracteristicasAg>) agenda.getMgwCaracteristicasAgCollection();
                if (!listaMgwCaracteristicasAg.isEmpty()) {
                    caracteristicasAg = listaMgwCaracteristicasAg.get(0);
                    caracteristicasAg.setFechaAct(new Date());
                    caracteristicasAg.setIims1(request.getIims1());
                    caracteristicasAg.setIims2(request.getIims2());
                    caracteristicasAg.setIims3(request.getIims3());
                    caracteristicasAg.setIdAgenda(agenda);
                    caracteristicasAg.setRespuestaEncuesta(request
                            .getRespuestaEncuesta());
                    caracteristicasAgFacadeLocal.edit(caracteristicasAg);
                } else {
                    caracteristicasAg = new MgwCaracteristicasAg();
                    caracteristicasAg.setFechaAct(new Date());
                    caracteristicasAg.setIims1(request.getIims1());
                    caracteristicasAg.setIims2(request.getIims2());
                    caracteristicasAg.setIims3(request.getIims3());
                    caracteristicasAg.setIdAgenda(agenda);
                    caracteristicasAg.setRespuestaEncuesta(request
                            .getRespuestaEncuesta());
                    caracteristicasAgFacadeLocal.create(caracteristicasAg);
                }

                if (logger.isTraceEnabled()) {
                    logger.trace("softClose, MgwAgenda: " + agenda.toString());
                    logger.trace("softClose, MgwCaracteristicasAg: "
                            + caracteristicasAg.toString());
                    logger.trace("softClose, MgcDatosMovil: "
                            + tecnico.toString());
                }

                String actividades = request.getActividades();

                if (actividades != null && !actividades.isEmpty()) {
                    try {
                        if (logger.isInfoEnabled()) {
                            logger.info("Ini transaction Activities");
                        }
                        // this.transaction.begin();
                        MgfPreFactura factura = new MgfPreFactura();
                        Map<String, Object> params = new HashMap<>();
                        params.put("ID_AGENDA", agenda.getIdAgenda());
                        List<MgfPreFactura> prefacturas = mgfPreFacturaFacadeLocal
                                .findWithfilters("Select p From MgfPreFactura p where p.idAgenda = :ID_AGENDA", params);
                        if (!prefacturas.isEmpty()) {
                            factura = prefacturas.get(0);
                        } else {
                            factura.setIdAgenda(agenda.getIdAgenda());
                            factura.setEstado(Short.valueOf("1"));
                            factura.setReal(Short.valueOf("0"));
                            factura.setFecRegistro(new Date());
                            mgfPreFacturaFacadeLocal.create(factura);
                        }
                        if (logger.isTraceEnabled()) {
                            logger.trace("softClose, MgfPreFactura: "
                                    + factura.toString());
                        }
                        params = new HashMap<>();
                        params.put("ID_FACTURA", factura);

                        List<MgfPreActividad> preactividades = mgfPreActividadFacadeLocal.findList("Select p From MgfPreActividad p where p.idFactura = :ID_FACTURA", params);
                        if (preactividades.isEmpty()) {
                            int flag = 0;
                            registrarActividades(actividades, preactividades, factura, request, flag);
                            String cambios = request.getCambios();
                            flag = 1;
                            registrarActividades(cambios, preactividades,
                                    factura, request, flag);
                            try {
                                preactividades = mgfPreActividadFacadeLocal.findList("Select p From MgfPreActividad p where p.idFactura = :ID_FACTURA and p.estado = true", params);

                                persistencePreItem(actividades, preactividades,
                                        request, listOrden, proceso,
                                        ordenSplit, llegadaMensaje,
                                        procesoMensaje, estadoETA);
                            } catch (Exception e) {
                                logger.error(e);
                            }
                        }

                        if (logger.isInfoEnabled()) {
                            logger.info("Commit transaction Activities");
                        }
                    } catch (Exception e) {
                        StringWriter sw = new StringWriter();
                        PrintWriter pw = new PrintWriter(sw);
                        e.printStackTrace(pw);
                        logger.error(" softClose, Rollback transaction TRAZA Detalle: "
                                + sw.toString());
                        throw new Exception(
                                "Ocurrio un error registrando la prefactura para la orden MSJ:"
                                + e.getMessage()
                                + request.getAppt_number());
                    }
                }

                mgwAgendaFacadeLocal.edit(agenda);
                persistAgendaEstado(agenda, estadoAgenda, null, null);
                procesoMensaje = new Date();
                // gestionManager.flush();

                updateMessageStatus(request.getIdMensaje().toString(),
                        request.getUser(),
                        EstadosEtaDirectEnum.DELIVERED.getNombre(),
                        EstadosEtaDirectEnum.DELIVERED.getDescripcion());
            } else {
                logger.error(" softClose, No existe una agenda para la orden  ");
                throw new Exception(
                        agendas.isEmpty() ? "No existe una agenda para la orden "
                        + request.getAppt_number()
                        : "El Origen " + request.getOrigenId()
                        + " enviado no existe en el sistema");
            }

            param = new HashMap<>();
            param.put("ID_AGENDA", agendas.get(0).getIdAgenda());

            List<MgfPreFactura> preFactura = mgfPreFacturaFacadeLocal.findWithfilters(
                    "SELECT pf "
                    + "FROM MgfPreFactura pf "
                    + "JOIN MgfPreActividad pa "
                    + "WHERE pf.idAgenda = :ID_AGENDA",
                    param);
            if (preFactura.isEmpty()) {
                throw new Exception(
                        "Error: no creo la preFactura y la preActividad ");

            }
            if (levelBDLog >= 2) {
                long tiempoFin = System.currentTimeMillis();
                logger.info("Time-Final en OK: ");
                logger.info(tiempoFin);

                saveLog(ServiciosEnum.ORDER_MANAGER.getDescripcion(),
                        FuncionEnum.SOFT_CLOSE.getDescripcion(),
                        request.toString(),
                        logger.toString(), null, request
                        .getUser().getLogin());
            }
        } catch (BusinessExceptionFault e) {
            return getResponse(e.getErrorCode(), request.getIdMensaje(),
                    EstadosEtaDirectEnum.FAILED, e.getMessage());
        } catch (Exception e) {
            MgwConciliacionErrores errorConciliacion = new MgwConciliacionErrores();
            try {
                String mensaje = this.obtenerDescripcionError(ordenSplit[0],
                        e.getMessage());
                errorConciliacion = getMgwConciliacionError(mensaje, proceso);
                if (errorConciliacion.getDescripcion() == null) {
                    grabarErrorConciliacion(mensaje, request.getUser()
                            .getLogin(), errorConciliacion.getCodigoError(),
                            "MGW");
                    errorConciliacion = getMgwConciliacionError(mensaje,
                            proceso);
                }

            } catch (Exception err2) {
                logger.error("error guardando informacion en la base de datos", err2);
            }
            logger.error(" softClose, TRAZA Detalle: ", e);

            if (levelBDLog >= 1) {
                long tiempoFin = System.currentTimeMillis();
                logger.info(" Time-Final en Excepcion: ");
                logger.info(tiempoFin);
            }

            MgwLogAuditoria logAuditoria = saveLog(
                    ServiciosEnum.ORDER_MANAGER.getDescripcion(),
                    FuncionEnum.SOFT_CLOSE.getDescripcion(),
                    request.toString(), logger.toString(), e.getMessage(),
                    request.getUser().getLogin());
            updateMessageStatus(
                    request.getIdMensaje().toString(),
                    request.getUser(),
                    EstadosEtaDirectEnum.FAILED.getNombre(),
                    EstadosEtaDirectEnum.FAILED.getDescripcion() + "["
                    + e.getMessage() + "]");
            if (listOrden.get(0) != null) {

                grabarMgwconciliacion(listOrden.get(0),
                        errorConciliacion.getIdConciliacionError(), request
                        .getUser().getLogin(), llegadaMensaje,
                        procesoMensaje, proceso, "E", logAuditoria, estadoETA);
            }

        }

        Configurador.cerrarTransaccion(ini, logger);
        
        response = getResponse("MGW_1", request.getIdMensaje(),
                EstadosEtaDirectEnum.SENDING, null);
        return response;

    }

    /**
     * Método encargado de obtener el respnse a ser devuelto por el servicio con
     * los datos de autenticación contra ETA Direct.
     *
     * @param codigo Codigo a ser registrado.
     * @param idMensaje identificador del mensaje.
     * @param status Estado de la operación.
     * @param description Descripción del resultado de la operación.
     *
     * @return objeto de respuesta del servicio.
     */
    private Response getResponse(String codigo, Integer idMensaje,
            EstadosEtaDirectEnum status, String description) {
        if (logger.isDebugEnabled()) {
            logger.debug("getResponse, [ codigo=" + codigo + ", idMensaje="
                    + idMensaje + " EstadosEtaDirectEnum= " + status
                    + " description=" + description + " ]");
        }
        Response response = new Response();
        try {
            response.setCodigo(codigo);
            response.setDescription(description != null ? description : status
                    .getDescripcion());
            response.setMessage_id(idMensaje);
            response.setStatus(status.getNombre());
            UserElement userElement = getUserElement();

            UserT userT = new UserT();
            userT.setAuthString(userElement.getAuthString());
            userT.setCompany(userElement.getCompany());
            userT.setLogin(userElement.getLogin());
            userT.setNow(userElement.getNow());
            if (logger.isDebugEnabled()) {
                logger.debug("getResponse, userT:" + userT);
            }
            response.setUser(userT);
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            logger.error("getResponse - Error desconocido:" + e.getMessage());
            logger.error("getResponse - Error desconocido - TRAZA Detalle:"
                    + sw.toString());
            response.setDescription(e.getMessage());
        }

        return response;
    }

    /**
     * Método encargado de persistir una agenda estado.
     *
     * @param agenda Agenda a ser gurdado su estado.
     * @param estadoAgenda Estado de la agenda.
     * @throws Exception por si ocurre un error al ejecutar la operacion.
     */
    private void persistAgendaEstado(MgwAgenda agenda,
            MgwEstadoAgenda estadoAgenda, String observacion, String error)
            throws Exception {
        MgwAgendaEstados agendaEstado = new MgwAgendaEstados();
        agendaEstado.setDiaagenda(agenda.getDiaagenda());
        agendaEstado.setIdAgenda(agenda);
        agendaEstado.setIdaliado(agenda.getIdaliado());
        agendaEstado.setIdCapacidad(agenda.getIdCapacidad().getIdCapacidad());
        agendaEstado.setIdCodresultado(error != null ? new Long(0) : agenda
                .getIdCodresultado());
        agendaEstado.setIdEstadoAgenda(estadoAgenda);
        agendaEstado.setIdtecnico(agenda.getIdtecnico());
        agendaEstado.setIdTt(agenda.getIdTt());
        agendaEstado.setIdusuario(agenda.getIdusuario());
        agendaEstado.setObservacion(agenda.getObservacion());
        agendaEstado.setIdCodresultado(agenda.getIdCodresultado());
        agendaEstado.setHoraLlegada(agenda.getHoraLlegada());
        agendaEstado.setHoraSalida(agenda.getHoraSalida());
        agendaEstado.setObservacion(observacion != null
                && !observacion.equals("") ? observacion : null);
        agendaEstado.setFechaCreacion(new Date());
        if (logger.isTraceEnabled()) {
            logger.debug("persistAgendaEstado, MgwAgendaEstado: "
                    + agendaEstado.toString());
        }
        mgwAgendaEstadosFacadeLocal.create(agendaEstado);
    }

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

    private List<MgwAgenda> getAgenda(String idOT) throws Exception {
        List<MgwAgenda> agendas = new ArrayList<>();
        MgwOrden orden = getOrden(idOT);
        if (orden == null) {
            return agendas;
        }

        MgwEstadoAgenda estadoAgendaAgendado = getEstadoAgenda(Constantes.AGENDA_ESTADO_AGENDADO.getValue());
        MgwEstadoAgenda estadoAgendaReprogramada = getEstadoAgenda(Constantes.AGENDA_ESTADO_REPROGRAMADA.getValue());
        MgwEstadoAgenda estadoAgendaSuspendidoNuevo = getEstadoAgenda(Constantes.AGENDA_ESTADO_SUSPENDIDO_NUEVO.getValue());
        MgwEstadoAgenda estadoAgendaSoftClose = getEstadoAgenda(Constantes.AGENDA_ESTADO_SOFTCLOSE.getValue());

        Map<String, Object> params = new HashMap<>();
        params.put("ID_OT", orden);
        params.put("ESTADO_AGENDADO", estadoAgendaAgendado);
        params.put("ESTADO_REPROGRAMADA", estadoAgendaReprogramada);
        params.put("ESTADO_SUSPENDIDO_NUEVO", estadoAgendaSuspendidoNuevo);
        params.put("ESTADO_SOFTCLOSE", estadoAgendaSoftClose);
        agendas = mgwAgendaFacadeLocal.findWithfilters(
                "Select a From MgwAgenda a where a.idOrden = :ID_OT "
                + "and (a.idEstadoAgenda = :ESTADO_AGENDADO "
                + "or a.idEstadoAgenda = :ESTADO_REPROGRAMADA "
                + "or a.idEstadoAgenda = :ESTADO_SUSPENDIDO_NUEVO "
                + "or a.idEstadoAgenda = :ESTADO_SOFTCLOSE ) ",
                params);

        return agendas;
    }

    private MgwOrden getOrden(String idOT) throws Exception {

        try {
            List<MgwOrden> ordenes = null;
            String[] ordenSplit = idOT.split("_");

            if (ordenSplit.length > 2) {

                Map<String, Object> params = new HashMap<>();

                params.put("ID_OT", new BigDecimal(ordenSplit[0]));
                params.put("ID_TIPO", ordenSplit[1]);
                ordenes = mgwOrdenFacadeLocal.findList("Select o From MgwOrden o where o.orden = :ID_OT and o.idTipoOrden = :ID_TIPO",
                        params);
                return ordenes.isEmpty() ? null : ordenes.get(0);
            } else {
                throw new Exception("El formato de la orden " + idOT
                        + " no es valido");
            }
        } catch (NumberFormatException e) {
            throw new Exception("El formato de la orden " + idOT
                    + " no es valido");
        }

    }

    private MgwOrigen getOrigen(String origenId) {
        Map<String, Object> params = new HashMap<>();
        Long idOrigen = Long.valueOf(origenId);
        params.put("ID", idOrigen);
        List<MgwOrigen> origenes = mgwOrigenFacadeLocal.findWithfilters(
                "Select o from MgwOrigen o where o.idOrigen = :ID", params);
        if (!origenes.isEmpty()) {
            return origenes.get(0);
        }
        return null;
    }

    private MgwEstadoAgenda getEstadoAgenda(String nombreEstado) throws BusinessExceptionFault, Exception {
        Map<String, Object> params = new HashMap<>();
        String param = getParam(nombreEstado);
        params.put("ID", Long.valueOf(param));
        List<MgwEstadoAgenda> estados = mgwEstadoAgendaFacadeLocal.findList(
                "Select ea from MgwEstadoAgenda ea where ea.idEstadoAgenda = :ID",
                params);
        if (estados.isEmpty()) {
            throw new Exception("No existe un estado de agenda con el ID "
                    + param);
        }
        return estados.get(0);
    }

    private MgcDatosMovil getTecnico(String tecnicoId) throws Exception {
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("CEDULA", new BigDecimal(tecnicoId));
            List<MgcDatosMovil> tecnicos = mgcDatosMovilFacadeLocal.findWithfilters(
                    "Select dm from MgcDatosMovil dm where dm.cedula = :CEDULA",
                    params);
            if (!tecnicos.isEmpty()) {
                return tecnicos.get(0);
            } else {
                throw new Exception("El identificador del tecnico " + tecnicoId
                        + " no existe en el sistema");
            }

        } catch (NumberFormatException e) {
            logger.error(e);
            throw new Exception("El identificador del tecnico " + tecnicoId
                    + " no es valido");
        }
    }

    /**
     * Método encargado de llamar al setMessageStatus de ETA Direct.
     *
     * @param idMessage identificador del mensaje.
     * @param user datos del usuario.
     * @param status estado de la operación.
     */
    private void updateMessageStatus(String idMessage, UserOutBound user,
            String status, String description) {
        StatusMessageRequest messageRequest = new StatusMessageRequest();
        messageRequest.setEstado(status);
        messageRequest.setDescripcion(description);
        messageRequest.setId(idMessage);
        messageRequest.setUser(user);
        try {
            statusMessages(messageRequest);
        } catch (BusinessExceptionFault e1) {
            logger.error(e1);
        }
    }

    public TypesetMessageStatusResponseData statusMessages(
            StatusMessageRequest request) throws BusinessExceptionFault {
        TypesetMessageStatusRequestData requestData = null;
        try {
            /*
            * En la instancia de ToaOutboundInterface envia como parametro la
            * URLpara conectarse con el servicio de ETAdirect
             */
            String sLevelBDLog = getParam(Constantes.MGW_LOG_BD_DETALLE.getValue());
            if (sLevelBDLog != null && sLevelBDLog.length() > 0) {
                levelBDLog = Integer.parseInt(sLevelBDLog);
            }

            if (levelBDLog >= 2) {
                long tiempoIni = System.currentTimeMillis();
                saveLog(ServiciosEnum.MESSAGE_MANAGER.getDescripcion(),
                        FuncionEnum.ACTUALIZAR_ESTADO_MENSAJE
                                .getDescripcion(), request.toString(),
                        "Inicio llamado ETA Tiempo: " + tiempoIni,
                        null, request.getUser().getLogin());
            }

            String urls = getUrlWebService(Constantes.INBOUND_URL_ACTUALIZAR_ESTADO.getValue());
            WSSIECActualizarEstadoDeMensajesInboundClientEp service = new WSSIECActualizarEstadoDeMensajesInboundClientEp(
                    new URL(urls));
            /*
            * Realiza un llamado a la clase UserElement y obtiene el valor de
            * las propiedades como el login, company y el password
             */
            UserElement userElement = getUserElement();

            TypeuserT usert = new TypeuserT();
            TypemessageT messaget = new TypemessageT();

            /*
            * Se obtiene el valor de la clase ToaOutboundInterface y es
            * asignada a taoPortType
             */
            WSSIECActualizarEstadoDeMensajesInboundInterface port = service
                    .getWSSIECActualizarEstadoDeMensajesInboundPt();

            requestData = new TypesetMessageStatusRequestData();

            TypemessagesT messagesT = new TypemessagesT();
            List<TypemessageT> messages = new ArrayList<>();
            /*
	    * Asignar valores a los metodos setters de la clase UserT
             */
            usert.setCompany(userElement.getCompany());
            usert.setLogin(userElement.getLogin());
            usert.setAuthString(userElement.getAuthString());
            usert.setNow(userElement.getNow());
            /*
            * Asignar valores a los metodos setters de la clase MessageT
             */
            messaget.setStatus(request.getEstado());
            messaget.setMessageId(Long.parseLong(request.getId()));
            messaget.setDescription(request.getDescripcion());
            /*
            * Agrega los valores a la lista messages y asigna valores a la
            * clase MessagesT el arrayList
             */
            messages.add(messaget);
            messagesT.getMessage().addAll(messages);
            requestData.setMessages(messagesT);
            requestData.setUser(usert);
            TypesetMessageStatusResponseData responseData = port
                    .actualizarEstadoDeMensajes(requestData);
            /*
			 * retorna la lista de la clase MessageResponseT
             */
            if (levelBDLog >= 2) {
                long tiempoIni = System.currentTimeMillis();
                saveLog(
                        ServiciosEnum.MESSAGE_MANAGER.getDescripcion(),
                        FuncionEnum.ACTUALIZAR_ESTADO_MENSAJE.getDescripcion(),
                        request.toString(), "Fin llamado ETA Tiempo: "
                        + tiempoIni + " " + responseData.toString(),
                        null, request.getUser().getLogin());
            }

            return responseData;

        } catch (MalformedURLException e) {
            try {
                long tiempoFin = System.currentTimeMillis();
                saveLog(
                        ServiciosEnum.MESSAGE_MANAGER.getDescripcion(),
                        FuncionEnum.ACTUALIZAR_ESTADO_MENSAJE.getDescripcion(),
                        request.toString(),
                        "Fin llamado ETA Tiempo Excepcion: " + tiempoFin,
                        e.toString(), request.getUser().getLogin());
            } catch (Exception e1) {
                throw new BusinessExceptionFault("MGW_3", "Error Inesperado",
                        e1.getMessage());
            }
            throw new BusinessExceptionFault("MGW_1", "MalformedURLException",
                    "La URL del WSDL del servicio outbound No es valida");
        } catch (Exception e) {

            try {
                long tiempoFin = System.currentTimeMillis();
                saveLog(
                        ServiciosEnum.MESSAGE_MANAGER.getDescripcion(),
                        FuncionEnum.ACTUALIZAR_ESTADO_MENSAJE.getDescripcion(),
                        request.toString(),
                        "Fin llamado ETA Tiempo Excepcion: " + tiempoFin,
                        e.toString(), request.getUser().getLogin());
            } catch (Exception e1) {
                throw new BusinessExceptionFault("MGW_3", "Error Inesperado",
                        e1.getMessage());
            }
            throw new BusinessExceptionFault("MGW_3", "Error Inesperado",
                    e.getMessage());
        }
    }

    /**
     * Método encargado de obtener un objeto con los datos de autenticacion a
     * ETA Direct.
     *
     * @return Objeto construido.
     */
    private UserElement getUserElement() {
        UserElement userElement = null;
        try {
            userElement = ClientUtils.getUserElement(
                    getParam(Constantes.ETADIRECT_LOGIN.getValue()),
                    getParam(Constantes.ETADIRECT_COMPANY.getValue()),
                    getParam(Constantes.ETADIRECT_PASS.getValue()));
        } catch (Exception e) {
            logger.error(e);
        }
        return userElement;
    }

    private Long getCodResultado(String codigo) {
        Map<String, Object> params = new HashMap<>();
        params.put("CODIGO", codigo);
        List<MgwCodResultado> codResultados = mgwCodResultadoFacadeLocal.findWithfilters(
                "Select cr from MgwCodResultado cr where cr.codigo = :CODIGO",
                params);
        if (codResultados.isEmpty()) {
            return null;
        }

        return codResultados.get(0).getIdCodRes();
    }

    private void registrarActividades(String actividades, List<MgfPreActividad> preactividades,
            MgfPreFactura factura, SoftCloseRequest request, int flag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String getParam(String param) throws BusinessExceptionFault {
        String resultado = null;
        Map<String, Object> params = new HashMap<>();
        params.put("NOMBRE", param);
        List<MgwConstantes> paramm = mgwConstantesFacadeLocal.findWithfilters(
                "Select c from MgwConstantes c where c.nombre = :NOMBRE",
                params);
        if (paramm == null || paramm.isEmpty()) {
            throw new BusinessExceptionFault("MGW_3",
                    "Error de parametro no encontrado",
                    "El parametro del sistema " + param + " no existe");
        } else {
            resultado = paramm.get(0).getValor();
        }

        return resultado;
    }

    private void persistencePreItem(String actividades, List<MgfPreActividad> preActividades,
            SoftCloseRequest request, List<MgwOrden> listOrden, String proceso, String[] ordenSplit,
            Date llegadaMensaje, Date procesoMensaje, String estadoETA) throws Exception {

        MgwLogAuditoria logAuditoria = new MgwLogAuditoria();
        List<BillingActivity> activities = null;
        try {
            activities = Operations.getXmlMateriales(actividades);
        } catch (BusinessExceptionFault e) {
            logger.error("registrarActividades, Error Obteniendo actividades de XM: "
                    + e.getMessage());
            throw new Exception("Error Obteniendo actividades de XML "
                    + e.getMessage());
        }
        for (BillingActivity billingActivity : activities) {

            if (billingActivity.getExecuted() == true) {

                Map<String, Object> params = new HashMap<>();
                params.put("COD", billingActivity.getActivity_code());
                for (MgfPreActividad preActividad : preActividades) {
                    if (Long.getLong(billingActivity.getActivity_code()).longValue() == preActividad.getIdTtactividad()) {

                        List<Material> materiales = billingActivity
                                .getMaterials();
                        if (materiales.size() > 0) {
                            for (Material material : materiales) {
                                MgfPreItem preItem = new MgfPreItem();
                                preItem.setCantidad(Long.getLong(material
                                        .getReal()));
                                preItem.setIdMomtr(Long.getLong(material
                                        .getCode()));
                                preItem.setIdActividad(preActividad);
                                preItem.setReal(Short.MAX_VALUE);
                                preItem.setTipo("MT");
                                try {
                                    mgfPreItemFacadeLocal.create(preItem);
                                } catch (Exception e) {
                                    StringWriter sw = new StringWriter();
                                    PrintWriter pw = new PrintWriter(sw);
                                    e.printStackTrace(pw);
                                    String error = "Error persistiendo MgfPreItem: Mensaje: "
                                            + e.getMessage();
                                    logger.error("registrarActividades, TRAZA Detalle "
                                            + sw.toString());
                                    logAuditoria = saveLog(
                                            ServiciosEnum.ORDER_MANAGER
                                                    .getDescripcion(),
                                            FuncionEnum.SOFT_CLOSE
                                                    .getDescripcion(), request
                                                    .toString(), BDlogSB
                                                    .toString(), error, request
                                                    .getUser().getLogin());

                                    MgwConciliacionErrores errorConciliacion = new MgwConciliacionErrores();
                                    try {
                                        String mensaje = this.obtenerDescripcionError(
                                                ordenSplit[0],
                                                e.getMessage());
                                        errorConciliacion = getMgwConciliacionError(
                                                mensaje, proceso);
                                        if (errorConciliacion.getDescripcion() == null) {
                                            grabarErrorConciliacion(mensaje,
                                                    request.getUser()
                                                            .getLogin(),
                                                    errorConciliacion
                                                            .getCodigoError(),
                                                    "MGW");
                                            errorConciliacion = getMgwConciliacionError(
                                                    mensaje, proceso);
                                        }

                                    } catch (Exception err2) {
                                        logger.error("error guardando informacion en la base de datos");
                                    }
                                    if (!listOrden.isEmpty()) {
                                        grabarMgwconciliacion(
                                                listOrden.get(0),
                                                errorConciliacion
                                                        .getIdConciliacionError(),
                                                request.getUser().getLogin(),
                                                llegadaMensaje, procesoMensaje,
                                                proceso, "E", logAuditoria,
                                                estadoETA);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    private MgwLogAuditoria saveLog(String nombreServicio, String funcion,
            String request, String response, String error, String usuario)
            throws BusinessExceptionFault {
        MgwLogAuditoria logAuditoria = new MgwLogAuditoria();
        logAuditoria.setEstado(Short.MAX_VALUE);
        logAuditoria.setNombreServicio(nombreServicio);
        logAuditoria.setFechaGrabacion(new Date());
        logAuditoria.setFuncion(funcion);
        logAuditoria.setRequest(persistDataFile(request).getIdDatafile());
        if (response != null) {
            logAuditoria.setResponse(persistDataFile(response).getIdDatafile());
        }
        logAuditoria.setError(error);
        logAuditoria.setUsuario(usuario);
        mgwLogAuditoriaFacadeLocal.create(logAuditoria);

        return logAuditoria;
    }

    private String obtenerDescripcionError(String ot, String descripcion) {
        String mensaje = "";
        if (descripcion.length() >= 145) {
            descripcion = descripcion.substring(0, 145);
        }
        String[] datos = descripcion.split(" ");
        for (String dato : datos) {
            if (dato.contains(ot)) {
                dato = "";
            }
            mensaje = mensaje + " " + dato;
            mensaje = mensaje.trim();
        }
        return mensaje;
    }

    private MgwConciliacionErrores getMgwConciliacionError(String mensaje, String proceso) throws Exception {
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("descripcion", mensaje);
            List<MgwConciliacionErrores> errorConciliacion = mgwConciliacionErroresFacadeLocal.findWithfilters(
                    "SELECT m FROM MgwConciliacionErrores m WHERE m.descripcion = :descripcion",
                    params);
            if (!errorConciliacion.isEmpty()) {
                return errorConciliacion.get(0);
            } else {
                Map<String, Object> param = new HashMap<>();
                param.put("Plataforma", "MGW");
                List<MgwConciliacionErrores> valor = mgwConciliacionErroresFacadeLocal.findWithfilters("Select mgconErr from MgwConciliacionErrores mgconErr where mgconErr.idConciliacionError "
                        + "= (select max(mgwConErr.idConciliacionError) from MgwConciliacionErrores mgwConErr) "
                        + "and mgconErr.plataformas = :Plataforma", param);
                long aa = valor.get(0).getIdConciliacionError() + 1;
                String codigoError = proceso + "_" + Long.toString(aa);
                errorConciliacion.add(valor.get(0));
                errorConciliacion.get(0).setCodigoError(codigoError);
                errorConciliacion.get(0).setDescripcion(null);
                return errorConciliacion.get(0);
            }

        } catch (Exception err) {
            logger.error("No se puede realizar consulta en la tabla MgwConciliacionErrores", err);
            throw new Exception(
                    "No se puede realizar consulta en la tabla MgwConciliacionErrores");
        }
    }

    /**
     *
     * metodo encargado de guardar un codigo de error,
     *
     * @param descripcion
     * @param idUsuario
     * @param codigoError el numero del codigo de error que hay en el codigo
     * @param plataformas MGW, RR. ETA separadas por ","
     * @throws Exception
     */
    private void grabarErrorConciliacion(String mensaje, String idUsuario,
            String codigoError, String plataformas) throws Exception {
        MgwConciliacionErrores conciliacionErrores = new MgwConciliacionErrores();
        try {

            conciliacionErrores.setDescripcion(mensaje);
            conciliacionErrores.setIdUsuario(idUsuario);
            conciliacionErrores.setCodigoError(codigoError);
            conciliacionErrores.setFechaGrabacion(new Date());
            conciliacionErrores.setPlataformas(plataformas);
            conciliacionErrores.setEstado("A");

            mgwConciliacionErroresFacadeLocal.create(conciliacionErrores);

        } catch (Exception err) {
            logger.error("error intentado guardar la entidad", err);
        }

    }

    /**
     * @param idOT
     * @param idConciliacionError
     * @param idUsuario
     * @param llegadaMensaje
     * @param procesoMensaje
     * @param proceso
     * @param estadoConciliacion
     * @param logAuditoria
     * @param estadoETA
     * @throws Exception
     */
    private void grabarMgwconciliacion(MgwOrden idOT, long idConciliacionError,
            String idUsuario, Date llegadaMensaje, Date procesoMensaje,
            String proceso, String estadoConciliacion,
            MgwLogAuditoria logAuditoria, String estadoETA) throws Exception {
        MgwConciliacion procesoConciliacion = new MgwConciliacion();
        try {
            MgwConciliacionErrores conciliacionErrores = new MgwConciliacionErrores(idConciliacionError);
            conciliacionErrores = mgwConciliacionErroresFacadeLocal.find(conciliacionErrores);
            procesoConciliacion.setIdConciliacionError(conciliacionErrores);
            procesoConciliacion.setIdUsuario(idUsuario);
            procesoConciliacion.setFechaGrabacion(new Date());
            procesoConciliacion.setIdAccion(getIdAccion());
            procesoConciliacion.setIdOrden(idOT);
            procesoConciliacion.setFechaLlegadaMensaje(llegadaMensaje);
            procesoConciliacion.setFechaProcesoMensaje(procesoMensaje);
            MgwConciliacionProcesos mgwConciliacionProcesos = new MgwConciliacionProcesos();
            mgwConciliacionProcesos.setProceso(proceso);
            mgwConciliacionProcesos = mgwConciliacionProcesosFacadeLocal.find(mgwConciliacionProcesos);

            procesoConciliacion.setProceso(mgwConciliacionProcesos);
            procesoConciliacion.setEstadoConciliacion(estadoConciliacion.charAt(0));
            procesoConciliacion.setEstadoEta(estadoETA);

            if (logAuditoria.getFechaGrabacion() != null) {
                procesoConciliacion.setIdMgwLogAuditoria(logAuditoria.getIdMgwLogAuditoria());
            } else {
                procesoConciliacion.setIdMgwLogAuditoria(null);
            }
            mgwConciliacionFacadeLocal.create(procesoConciliacion);
        } catch (Exception err) {
            logger.error("error intentando persistir la entidad ", err);
        }

    }

    private MgwDatafile persistDataFile(String valor) throws BusinessExceptionFault {

        MgwDatafile datafile = new MgwDatafile();
        datafile.setEstado(Short.MAX_VALUE);
        Date fecha = new Date();
        datafile.setFecha(fecha);
        datafile.setIdDatafileTipo(Long
                .getLong(getParam(Constantes.TIPO_DATAFILE_MGW_ID.getValue())));
        datafile.setDatafile(valor);
        mgwDatafileFacadeLocal.create(datafile);
        return datafile;
    }

    /**
     * Metodo encargado de obtener el IdAccion
     *
     * @return idAccion
     * @throws Exception
     */
    private MgwAcciones getIdAccion() throws Exception {

        Map<String, Object> params = new HashMap<>();
        params.put("NOMBRE", "SIN_ACCION");
        List<MgwAcciones> listAccion = mgwAccionesFacadeLocal.findWithfilters(
                "Select i From MgwAccione i where i.nombre = :NOMBRE", params);
        if (listAccion.isEmpty()) {
            return null;
        }
        return listAccion.get(0);
    }

    /**
     * Método encargado de validar el código de error después de la
     * autenticacion por medio del interceptor
     *
     * @param now now que puede ser modificado por interceptor.
     * @throws BusinessExceptionFault por si ocurre algún error de autenticación
     */
    private void validateUser(String now) throws BusinessExceptionFault {
        String[] split = now.split(";");
        if (split.length > 1) {
            now = split[1];
            if (now.equals("0")) {
                throw new BusinessExceptionFault("MGW_4",
                        "Error de credenciales",
                        "login y/o auth_string no son válidos");
            } else if (now.equals("1")) {
                throw new BusinessExceptionFault("MGW_5", "Error de origen",
                        "company no se encuentra");
            } else if (now.equals("2")) {
                throw new BusinessExceptionFault("MGW_6", "Error de now",
                        "el formato de la fecha no es el de la ISO 8601");
            } else if (now.equals("3")) {
                throw new BusinessExceptionFault("MGW_7",
                        "Error persona inactiva", "El usuario no está activo");
            } else if (now.equals("4")) {
                throw new BusinessExceptionFault("MGW_8", "Error contraseña",
                        "la contraseña en base datos está inactiva o no existe");
            } else if (now.equals("5")) {
                throw new BusinessExceptionFault("MGW_9", "Datos vacíos",
                        "Uno o varios atributos de User es vacío");
            }
        }
    }

    /**
     * Método encargado de asignar un recurso a una orden.
     *
     * @param request datos de entrada.
     * @throws Exception por si ocurre una excepción.
     */
    public void assignResource(AssignResourceRequest request) throws Exception {
        logger.info(FuncionEnum.ASIGNAR_RECURSO);
        String proceso = "ATC";
        String estadoETA = EstadoEtaOrden.ASIGNAR_RECURSO.getDescripcion();
        String estadoRR = new String();
        Date llegadaMensaje = new Date();
        Date procesoMensaje = null;
        String[] ordenSplit = request.getIdOT().split("_");
        MgwLogAuditoria logAuditoria = new MgwLogAuditoria();

        Map<String, Object> param = new HashMap<>();
        param.put("ORDEN", Long.parseLong(ordenSplit[0]));
        List<MgwOrden> listOrden = mgwOrdenFacadeLocal.findList(
                "Select i From MgwOrden i where i.orden = :ORDEN", param);

        if (logger.isDebugEnabled()) {
            logger.debug("[ - - - - - - - - - - - - DEBUG "
                    + FuncionEnum.ASIGNAR_RECURSO.getDescripcion()
                    + " PROCESAMIENTO COLA - - - - - - - - - - - - ]");
            logger.debug(" assignResource, AssignResourceRequest"
                    + request.toString());
        }

        if (ordenSplit[1].equalsIgnoreCase("O")) {
            String urlPcml = getUrlWebService(Constantes.PCML_SERVICES.getValue());
            PcmlService pcmlService = new PcmlServiceProxy(urlPcml);
            Long lOrden = Long.getLong(ordenSplit[0]);
            WorkOrderInformation workOrderInformation = pcmlService.getWorkOrderInformation(lOrden);
            estadoRR = workOrderInformation.getWorkOrder().getEstadoOT();
        } else if (ordenSplit[1].equalsIgnoreCase("L")) {
            String urlServiceCall = getUrlWebService(Constantes.PCML_SERVICESCALL.getValue());

            Management managementServiceCall = new ManagementProxy(urlServiceCall);
            QueryServiceCallRequest requestQuery = new QueryServiceCallRequest();
            requestQuery.setAplicacion("MGW");
            requestQuery.setProceso(FuncionEnum.SOFT_CLOSE.getDescripcion());
            requestQuery.setRolUsuario("OPERACIONES");
            requestQuery.setServiceCallNumber(ordenSplit[0]);
            requestQuery.setUsuario(request.getUser().getLogin());
            String verificacion = HashUtil.generaKey(
                    DateUtil.getCurrentDateAsString(), "queryServiceCallOp");
            QueryServiceCallResponse responseServiceCall = managementServiceCall
                    .queryServiceCallOp(requestQuery, verificacion);
            estadoRR = responseServiceCall.getStatDispatch();
        }

        try {
            List<MgwAgenda> agendas = getAgenda(request.getIdOT());
            MgwOrigen origen = getOrigen(request.getOrigen());

            if (!agendas.isEmpty() && origen != null) {
                MgwAgenda agenda = agendas.get(0);
                MgcDatosMovil tecnico = getTecnico(request.getIdTecnico());
                agenda.setIdtecnico(tecnico.getIdDatoMovil());
                agenda.setIdaliado(tecnico.getIdaliado() != null ? tecnico
                        .getIdaliado().longValue() : null);
                agenda.setIdOrigen(origen);
                agenda.setOrdenToa(request.getIdOrdenEta());
                agenda.setEstadoCrm(estadoRR.charAt(0));
                MgwCaracteristicasAg mgwCaracteristicasAg = null;
                List<MgwCaracteristicasAg> caracteristicas = (List<MgwCaracteristicasAg>) agenda.getMgwCaracteristicasAgCollection();
                if (!caracteristicas.isEmpty()) {
                    mgwCaracteristicasAg = caracteristicas.get(0);
                    mgwCaracteristicasAg.setIdBucket(request.getIdBucket());
                    mgwCaracteristicasAg.setFechaAct(new Date());
                    caracteristicasAgFacadeLocal.edit(mgwCaracteristicasAg);
                } else {
                    mgwCaracteristicasAg = new MgwCaracteristicasAg();
                    mgwCaracteristicasAg.setIdBucket(request.getIdBucket());
                    mgwCaracteristicasAg.setFechaAct(new Date());
                    mgwCaracteristicasAg.setIdAgenda(agenda);
                    caracteristicasAgFacadeLocal.create(mgwCaracteristicasAg);
                }

                if (logger.isTraceEnabled()) {
                    logger.trace("assignResource, MgwAgenda: "
                            + agenda.toString());
                    logger.trace("assignResource, MgwOrigen: "
                            + origen.toString());
                    logger.trace("assignResource, MgwCaracteristicasAg: "
                            + mgwCaracteristicasAg.toString());
                }

                mgwAgendaFacadeLocal.edit(agenda);
                mergeAgendaEstado(agenda);
                procesoMensaje = new Date();

            } else {
                if (logger.isInfoEnabled()) {
                    logger.trace("assignResource, No existe una agenda para la orden: "
                            + request.getIdOT());
                }
                throw new Exception(
                        agendas.isEmpty() ? "No existe una agenda para la orden "
                        + request.getIdOT()
                        : "El Origen " + request.getOrigen()
                        + " enviado no existe en el sistema");
            }
            if (levelBDLog >= 2) {
                long tiempoFin = System.currentTimeMillis();
                BDlogSB.append("Time-Final en OK: ");
                BDlogSB.append(tiempoFin);

                logAuditoria = saveLog(
                        ServiciosEnum.ORDER_MANAGER.getDescripcion(),
                        FuncionEnum.ASIGNAR_RECURSO.getDescripcion(), request
                        .toString(),
                        "Proceso de Asignar Recurso finalizado - Traza: "
                        + BDlogSB.toString(), null, request.getUser()
                        .getLogin());
            }
            // guardando en la tabla de procesoOrdenes 27-08-2015
            int flag = 0;
            saveProcesoOrdenes(listOrden, request.getUser().getLogin(),
                    llegadaMensaje, procesoMensaje, request.getIdOT(), proceso,
                    flag, logAuditoria, estadoETA, estadoRR);

            updateMessageStatus(request.getIdMensaje().toString(),
                    request.getUser(),
                    EstadosEtaDirectEnum.DELIVERED.getNombre(),
                    EstadosEtaDirectEnum.DELIVERED.getDescripcion());

        } catch (Exception e) {
            MgwConciliacionErrores errorConciliacion = new MgwConciliacionErrores();
            String mensaje = this.obtenerDescripcionError(ordenSplit[0],
                    e.getMessage());
            try {
                errorConciliacion = getMgwConciliacionError(mensaje, proceso);
                if (errorConciliacion.getDescripcion() == null) {
                    logger.info("error no existe en la base de datos creando");
                    grabarErrorConciliacion(mensaje, request.getUser()
                            .getLogin(), errorConciliacion.getCodigoError(),
                            "MGW");
                    errorConciliacion = getMgwConciliacionError(mensaje,
                            proceso);
                }
            } catch (Exception err2) {
                logger.error("error guardando informacion en la base de datos", err2);
            }
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            logger.error("assignResource - Error desconocido:" + e.getMessage());
            logger.error("assignResource - Error desconocido - TRAZA Detalle:"
                    + sw.toString());

            if (levelBDLog >= 1) {

                long tiempoFin = System.currentTimeMillis();
                BDlogSB.append("Time-Final Excepcion: ");
                BDlogSB.append(tiempoFin);

                BDlogSB.append(" [assignResource - excepcion Traza: ");
                BDlogSB.append(sw.toString());
                BDlogSB.append(" ] ");
            }

            logAuditoria = saveLog(
                    ServiciosEnum.ORDER_MANAGER.getDescripcion(),
                    FuncionEnum.ASIGNAR_RECURSO.getDescripcion(),
                    request.toString(), BDlogSB.toString(), e.getMessage(),
                    request.getUser().getLogin());

            updateMessageStatus(
                    request.getIdMensaje().toString(),
                    request.getUser(),
                    EstadosEtaDirectEnum.FAILED.getNombre(),
                    EstadosEtaDirectEnum.FAILED.getDescripcion() + "["
                    + e.getMessage() + "]");

            if (!listOrden.isEmpty()) {
                grabarMgwconciliacion(listOrden.get(0),
                        errorConciliacion.getIdConciliacionError(), request
                        .getUser().getLogin(), llegadaMensaje,
                        procesoMensaje, proceso, "E", logAuditoria, estadoETA);
            }
        }

    }

    /**
     * Método encargado de actualizar una agenda estado.
     *
     * @param agenda Agenda a ser actualizado se estado.
     * @throws Exception por si ocurre una excepcion.
     */
    private void mergeAgendaEstado(MgwAgenda agenda) throws Exception {

        MgwAgendaEstados agendaEstado = getAgendaEstado(agenda);
        agendaEstado.setDiaagenda(agenda.getDiaagenda());
        agendaEstado.setIdAgenda(agenda);
        agendaEstado.setIdaliado(agenda.getIdaliado());
        agendaEstado.setIdCapacidad(agenda.getIdCapacidad().getIdCapacidad());
        agendaEstado.setIdtecnico(agenda.getIdtecnico());
        agendaEstado.setIdTt(agenda.getIdTt());
        agendaEstado.setIdusuario(agenda.getIdusuario());
        agendaEstado.setObservacion(agenda.getObservacion());
        agendaEstado.setHoraLlegada(agenda.getHoraLlegada());
        agendaEstado.setHoraSalida(agenda.getHoraSalida());
        mgwAgendaEstadosFacadeLocal.edit(agendaEstado);

    }

    /**
     * Método encargado de consultar una agenda estado.
     *
     * @param agenda Agenda a ser obtenido su agenda estado.
     * @return Agenda estado obtenido.
     * @throws Exception por si ocurre una excepción.
     */
    private MgwAgendaEstados getAgendaEstado(MgwAgenda agenda) throws Exception {
        Map<String, Object> params = new HashMap<>();
        params.put("AGENDA", agenda);
        List<MgwAgendaEstados> estados = mgwAgendaEstadosFacadeLocal.findWithfilters(
                "Select ae from MgwAgendaEstado ae where ae.idAgenda = :AGENDA order by ae.idAgendaEstados desc",
                params);
        if (estados.isEmpty()) {
            throw new Exception(
                    "No existe un Agenda estado con el ID de agenda "
                    + agenda.getIdAgenda());
        }

        return estados.get(0);
    }

    /**
     * Metodo para guardar en Proceso Ordenes
     *
     * @param listOrden
     * @param usuario
     * @param llegadaMensaje
     * @param procesoMensaje
     * @param ot
     * @param proceso
     * @throws Exception
     */
    private void saveProcesoOrdenes(List<MgwOrden> listOrden, String usuario,
            Date llegadaMensaje, Date procesoMensaje, String ot,
            String proceso, int flag, MgwLogAuditoria logAuditoria,
            String estadoETA, String estadoRR) throws Exception {
        MgwProcesoOrdenes procesoOrdenes = null;

        if (listOrden.size() > 0) {
            procesoOrdenes = getProcesoOrden(listOrden.get(0).getIdOrden()
                    .toString());
        }

        Date completadoRR = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");
        String fechaSalida = dateFormat.format(completadoRR);
        if (procesoOrdenes == null && !listOrden.isEmpty()) {
            procesoOrdenes = new MgwProcesoOrdenes();
            // Validacion del proceso al que pertenece la orden 27-08-2015
            if (proceso.equals("ATC")) {
                procesoOrdenes.setAsignarTecnico(new Date());
            } else if (proceso.equals("IOD")) {
                procesoOrdenes.setIniciarOrden(new Date());
            } else if (proceso.equals("SCL")) {
                procesoOrdenes.setSoftClose(new Date());
            } else if (proceso.equals("COO")) {
                procesoOrdenes.setCompletarOrden(new Date());
            } else if (proceso.equals("COORR") && flag == 0) {
                procesoOrdenes.setCompletarRr(fechaSalida);
            } else if (proceso.equals("COORR") && flag == 1) {
                procesoOrdenes.setCompletarRr("CERRADO MANUAL");
            } else if (proceso.equals("ACTRR")) {
                procesoOrdenes.setActualizarRr(new Date());
            } else if (proceso.equals("SOD")) {
                procesoOrdenes.setSuspenderOrden(new Date());
            } else if (proceso.equals("ANR")) {
                procesoOrdenes.setActNoRealizada(new Date());
            }
            procesoOrdenes.setIdOrden(listOrden.get(0).getIdOrden());
            procesoOrdenes.setFechaGrabacion(new Date());
            procesoOrdenes.setFechaModificacion(new Date());
            procesoOrdenes.setUsuario(usuario);
            mgwProcesoOrdenesFacadeLocal.create(procesoOrdenes);
        } else {
            // Validacion del proceso al que pertenece la orden 27-08-2015
            if (proceso.equals("ATC")) {
                procesoOrdenes.setAsignarTecnico(new Date());
            } else if (proceso.equals("IOD")) {
                procesoOrdenes.setIniciarOrden(new Date());
            } else if (proceso.equals("SCL")) {
                procesoOrdenes.setSoftClose(new Date());
            } else if (proceso.equals("COO")) {
                procesoOrdenes.setCompletarOrden(new Date());
            } else if (proceso.equals("COORR") && flag == 0) {
                procesoOrdenes.setCompletarRr(fechaSalida);
            } else if (proceso.equals("COORR") && flag == 1) {
                procesoOrdenes.setCompletarRr("CERRADO MANUAL");
            } else if (proceso.equals("ACTRR")) {
                procesoOrdenes.setActualizarRr(new Date());
            } else if (proceso.equals("SOD")) {
                procesoOrdenes.setSuspenderOrden(new Date());
            } else if (proceso.equals("ANR")) {
                procesoOrdenes.setActNoRealizada(new Date());
            }
            procesoOrdenes.setUsuario(usuario);
            procesoOrdenes.setFechaModificacion(new Date());
            mgwProcesoOrdenesFacadeLocal.edit(procesoOrdenes);
        }
        if (!(proceso.equals("COORR") || proceso.equals("ACTRR"))) {
            String ordenOK = "Orden no presenta errores";
            MgwConciliacionErrores errorConciliacion = getMgwConciliacionError(
                    ordenOK, proceso);
            grabarMgwconciliacion(listOrden.get(0),
                    errorConciliacion.getIdConciliacionError(), usuario,
                    llegadaMensaje, procesoMensaje, proceso, "O", logAuditoria,
                    estadoETA);
        }
    }

    /**
     * Metodo que consulta MgwProcesoOrdenes
     *
     * @param idOT
     * @return
     * @throws Exception
     */
    private MgwProcesoOrdenes getProcesoOrden(String idOT) throws Exception {
        try {
            Map<String, Object> params = new HashMap<>();
            params.put("ORDENTRABAJO", new BigDecimal(idOT));
            List<MgwProcesoOrdenes> ordenProceso = mgwProcesoOrdenesFacadeLocal.findWithfilters("Select mpo from MgwProcesoOrdenes mpo where mpo.idOrden = :ORDENTRABAJO",
                    params);
            if (!ordenProceso.isEmpty()) {
                return ordenProceso.get(0);
            } else {
                return null;
            }
        } catch (NumberFormatException e) {
            logger.error("El identificador de la OT " + idOT
                    + " no es valido", e);
            throw new Exception("El identificador de la OT " + idOT
                    + " no es valido");
        }
    }

    

    

}
