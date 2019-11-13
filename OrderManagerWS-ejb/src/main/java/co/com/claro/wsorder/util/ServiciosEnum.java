package co.com.claro.wsorder.util;

/**
 * El enum serviciosEnum tiene como funcion de contener los nombres de los
 * servicios de los Web services
 *
 * Creado el 19/02/2014
 *
 * @author Julian David Martinez M <s_martinezj@globalhitss.com>
 * @version 1.0
 */
public enum ServiciosEnum {
    ACTIVITY_MANAGER("Activity Manager WS"),
    GET_CAPACITY("Get Capacity WS"),
    MESSAGE_MANAGER("Message Manager"),
    MESSAGE_STATUS("Message Status"),
    ORDER_MANAGER("Order Manager"),
    SCHEDULE_VALIDATIONS("Schedule Validations"),
    FIN_DE_DIA("Fin de dia");

    private final String descripcion;

    ServiciosEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
