package co.com.claro.ws.bean;

import co.com.claro.wsorder.vo.ScheduleValidationsRequest;
import co.com.claro.wsorder.vo.ScheduleValidationsResp;
import javax.ejb.Local;

/**
 * Interface local con los metodos a ser implementados por el EJB de
 * validaciones de agendamiento. Creado el 1/08/2014
 *
 * @author Jairo Andr�s Tabares M <tabaresj@globalhitss.com>
 * @version 1.0
 */
@Local
public interface ScheduleValidationsBeanLocal {

    /**
     * M�todo encargado de ejecutar las validaciones parametrizadas para el
     * modulo de agendamiento.
     *
     * @param request solicitud enviada.
     * @return respuesta del componente.
     */
    public ScheduleValidationsResp scheduleValidations(ScheduleValidationsRequest request);

}
