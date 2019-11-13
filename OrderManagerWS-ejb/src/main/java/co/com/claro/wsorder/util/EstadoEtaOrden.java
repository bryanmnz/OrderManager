package co.com.claro.wsorder.util;

public enum EstadoEtaOrden {

    ASIGNAR_RECURSO("pending"),
    SOFT_CLOSE("started"),
    COMPLETAR_ORDEN("complete"),
    INICIAR_ORDEN("started"),
    SUSPENDER_ACTIVIDAD("suspended"),
    CAMBIAR_ACTIVIDAD_NO_REALIZADA("notdone");

    private String descripcion;

    EstadoEtaOrden(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
