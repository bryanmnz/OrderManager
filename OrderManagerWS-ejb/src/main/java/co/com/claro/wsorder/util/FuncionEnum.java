package co.com.claro.wsorder.util;

public enum FuncionEnum {

    ASIGNAR_RECURSO("Asignar Recurso"),
    SOFT_CLOSE("Soft Close"),
    COMPLETAR_ORDEN("Completar Orden"),
    INICIAR_ORDEN("Iniciar Orden"),
    SUSPENDER_ACTIVIDAD("Suspender Actividad"),
    CAMBIAR_ACTIVIDAD_NO_REALIZADA("Cambiar Actividad No Realizada"),
    ACTUALIZAR_ESTADO_MENSAJE("Actualizar Estado Mensaje"),
    CREAR_ORDEN("Crear Orden"),
    SET_MESSAGE_STATUS("Set Message Status"),
    UPDATE_ORDER("Update Order"),
    CANCEL_ORDER("Cancel Order"),
    RESCHEDULE("Reschedule"),
    FIN_DE_DIA("Validaciones de Fin de Dia");

    private final String descripcion;

    FuncionEnum(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
