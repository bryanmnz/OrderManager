package co.com.claro.wsorder.exceptions;

import co.com.claro.wsorder.util.Constantes;
import co.com.globalhitss.util.configuracion.Propiedades;


/**
 * <b>Nombre: </b> BusinessException </br>
 * <b>Descripci�n:</b> Excepci�n propia de negocio que permite la
 * parametrizaci�n de mensajes en propiedades de la aplicaci�n </br>
 * <b>Fecha Creaci�n:</b> 02/07/2019 </br>
 * <b>Autor:</b> HITSS Nombre Ingeniero </br>
 * <b>Fecha de �ltima Modificaci�n: 02/07/2019</b></br>
 * <b>Modificado por: Nombre Ingeniero</b></br>
 * <b>Brief: XXXX</b></br>
 */
public class BusinessException extends Exception {

	private static final long serialVersionUID = 1L;
	private static Propiedades prop = Propiedades.getInstance();

	/**
	 * <b>Nombre: </b> BusinessException </br>
	 * <b>Descripci�n:</b> Constructor de la clase, basado en c�digos de excepci�n
	 * parametrizados en las propiedades y la excepci�n generada por la aplicaci�n
	 * </br>
	 * <b>Fecha Creaci�n:</b> 02/07/2019 </br>
	 * <b>Autor:</b> HITSS Nombre Ingeniero </br>
	 * <b>Fecha de �ltima Modificaci�n: 02/07/2019</b></br>
	 * <b>Modificado por: Nombre Ingeniero</b></br>
	 * <b>Brief: XXXX</b></br>
	 * 
	 * @param cod C�digo de la excepci�n parametrizada en las propiedades
	 * @param e   Excepci�n generada por la aplicaci�n, con el fin de mantener la
	 *            traza de la excepci�n
	 */
	public BusinessException(String cod, Throwable e) {
		super("[ERROR_APP_" + cod + " " + prop.obtenerPropiedad(Constantes.EXCEPTION.getValue() + cod) + "]", e);
	}

	/**
	 * <b>Nombre: </b> BusinessException </br>
	 * <b>Descripci�n:</b> Constructor de la clase, basado en c�digos de excepci�n
	 * parametrizados en las propiedades </br>
	 * <b>Fecha Creaci�n:</b> 02/07/2019 </br>
	 * <b>Autor:</b> HITSS Nombre Ingeniero </br>
	 * <b>Fecha de �ltima Modificaci�n: 02/07/2019</b></br>
	 * <b>Modificado por: Nombre Ingeniero</b></br>
	 * <b>Brief: XXXX</b></br>
	 * 
	 * @param cod C�digo de la excepci�n parametrizada en las propiedades
	 */
	public BusinessException(String cod) {
		super("[ERROR_APP_" + cod + " " + prop.obtenerPropiedad(Constantes.EXCEPTION.getValue() + cod) + "]");
	}
}
