package co.com.claro.wsorder.util;

/**
 * Enumeracion para las funciones de los servicios web que usan procesos
 * asincronos. Creado el 23/01/2014
 * 
 * @author Jairo Andr�s Tabares M <tabaresj@globalhitss.com>
 * @version 1.0
 */
public enum FuncionAsyncEnum {

	ACTUALIZAR_ACTIVIDADES("Actualizar Actividades"), ACTUALIZAR_ORDEN(
			"Actualizar Orden"), CANCELAR_ORDEN("Cancelar Orden"), REAGENDAR_ORDEN(
			"Reagendar Orden"),ACTUALIZAR_ORDEN_NO_COMPLETADA("Actualizar Orden No Completada");

	private String descripcion;

	FuncionAsyncEnum(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

}
