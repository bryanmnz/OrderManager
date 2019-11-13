package co.com.claro.wsorder.util;

/**
 * Enumeracion con los estados usados por ETA Direct.
 *
 *
 */
public enum EstadosEtaDirectEnum {

    SENDING("sending", "Recibido por el Legado"), 
    DELIVERED("delivered", "OK"), 
    FAILED("failed", "KO");

    private String nombre;
    private String descripcion;

    EstadosEtaDirectEnum(String nombre, String descripcion) {
        this.descripcion = descripcion;
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

}
