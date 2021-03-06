/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.wsorder.util;

/**
 *
 * @author rodriguezjavr
 */
public enum Constantes {
    //Configuración inicial de la aplicacion
    RUTA_ARCHIVO_PROPIEDADES("/applications/config/Oper/CO_Claro_FulFillOper_EAP_Domain_PR/WSOrderManager/WSOrderManager.properties"),
    APLICACION("WSOrderManager"),
    LOGGER_PRINCIPAL("WSOrderManagerLog"),

    
    // Bases de datos
    BD_GESTION("app.conexion.GESTION"),
    TIPO_CON_GESTION("app.tipo.conexion.GESTION"),

    // Consultas base de datos
    TIME_OUT("app.sql.time.out"),
    SQL_UNO("app.sql.pl1"),
    SQL_DOS("app.sql.pl2"),
    CONSULTA_UNO("app.sql.SQL1"),

    // Consultas servicios web
    TIME_OUT_WS1("app.timeout.ws.ws1"),

    // Excepciones
    EXCEPTION("app.exception."),
    _000("000"),
    _100("100"),
    _101("101"),
    _102("102"),
    

    //CONSTANTES
    ETADIRECT_PASS("ETADIRECT_PASS"),
    ETADIRECT_COMPANY("ETADIRECT_COMPANY"),
    ETADIRECT_LOGIN("ETADIRECT_LOGIN"),
    MODULO_MGW("MGW"),
    INBOUND_URL_CREAR_ORDEN("INBOUND_URL_CREAR_ORDEN"),
    INBOUND_URL_ACTUALIZAR_ORDEN("INBOUND_URL_ACTUALIZAR_ORDEN"),
    INBOUND_URL_REAGENDAR("INBOUND_URL_REAGENDAR"),
    INBOUND_URL_CANCELAR_ORDEN("INBOUND_URL_CANCELAR_ORDEN"),
    INBOUND_URL_ACTUALIZAR_ESTADO("INBOUND_URL_ACTUALIZAR_ESTADO"),
    INBOUND_URL_ACTUALIZAR_ACTIVIDADES("INBOUND_URL_ACTUALIZAR_ACTIVIDADES"),
    GESTION_DE_ORDENES("GESTION DE ORDENES"),
    URL_GESTION_DE_ORDENES("WOSERVICES"),
    CAPACITY_URL("CAPACITY_URL"),
    OUTBOUND_URL("OUTBOUND_URL"),
    CANCELAR_ORDEN_FUNCION_ID("CANCELAR_ORDEN_FUNCION_ID"),
    ACTUALIZAR_ACTIVIDADES_FUNCION_ID("ACTUALIZAR_ACTIVIDADES_FUNC_ID"),
    ESTADO_MENSAJES_ENVIADOS_ID("ESTADO_MENSAJES_ENVIADOS_ID"),
    ACTUALIZAR_ORDEN_FUNCION_ID("ACTUALIZAR_ORDEN_FUNCION_ID"),
    CODIGO_RESULTADO_ESTADO_ACTIVO("CODIGO_RESULTADO_ESTADO_ACTIVO"),
    AGENDA_ESTADO_AGENDADO("AGENDA_ESTADO_AGENDADO"),
    AGENDA_ESTADO_SUSPENDIDO("AGENDA_ESTADO_SUSPENDIDO"),
    AGENDA_ESTADO_SUSPENDIDO_NUEVO("AGENDA_ESTADO_SUSPENDIDO_NUEVO"),
    AGENDA_ESTADO_REPROGRAMADA("AGENDA_ESTADO_REPROGRAMADA"),
    AGENDA_ESTADO_SOFTCLOSE("AGENDA_ESTADO_SOFTCLOSE"),
    AGENDA_ESTADO_NO_REALIZADO("AGENDA_ESTADO_NO_REALIZADO"),
    AGENDA_ESTADO_COMPLETADO("AGENDA_ESTADO_COMPLETADO"),
    AGENDA_ESTADO_COMPLETADO_SIN_RR("AGENDA_ESTADO_COMPLETADO_NO_RR"),
    REAGENDAR_FUNCION_ID("REAGENDAR_FUNCION_ID"),
    URL_FTP_ETA("URL_FTP_ETA"),
    USER_FTP_ETA("USER_FTP_ETA"),
    PASS_FTP_ETA("PASS_FTP_ETA"),
    RUTA_ALMACENAMIENTO_ARCHIVO("RUTA_ALMACENAMIENTO_ARCHIVO"),
    TIPO_DATAFILE_MGW_ID("TIPO_DATAFILE_MGW_ID"),
    PORCENTAJE_VAL_HERRAMIENTA("PORCENTAJE_VAL_HERRAMIENTA"),
    DEFAULT_CAPACITY("DEFAULT_CAPACITY"),
    DEFAULT_COD_RESULTADO("DEFAULT_COD_RESULTADO"),

    REAGENDAR_ACCION_NOMBRE("REAGENDAR_ACCION_NOMBRE"),
    CREAR_ORDEN_ACCION_NOMBRE("CREAR_ORDEN_ACCION_NOMBRE"),
    ACTUALIZAR_ORDEN_ACCION_NOMBRE("ACTUALIZAR_ORDEN_ACCION_NOMBRE"),
    CANCELAR_ORDEN_ACCION_NOMBRE("CANCELAR_ORDEN_ACCION_NOMBRE"),
    ASIGNAR_RECURSO_ACCION_NOMBRE("ASIGNAR_RECURSO_ACCION_NOMBRE"),
    COMENZAR_ORDEN_ACCION_NOMBRE("COMENZAR_ORDEN_ACCION_NOMBRE"),
    COMPLETAR_ORDEN_ACCION_NOMBRE("COMPLETAR_ORDEN_ACCION_NOMBRE"),
    COMPLETAR_ORDEN_FIN_ACCION_NOMBRE("COMPLETAR_ORDEN_FIN_ACCION_NOMBRE"),
    SOFTCLOSE_ACCION_NOMBRE("SOFTCLOSE_ACCION_NOMBRE"),
    NO_REALIZADA_ACCION_NOMBRE("NO_REALIZADA_ACCION_NOMBRE"),
    SUSPENDER_ACCION_NOMBRE("SUSPENDER_ACCION_NOMBRE"),
    ACTUALIZAR_ACTI_ACCION_NOMBRE("ACTUALIZAR_ACTI_ACCION_NOMBRE"),
    COMPLETAR_ORDEN_RR("COMPLETAR_ORDEN_RR"),
    CIERRE_LLS_MGW("CIERRE_LLS_MGW"),
    LOG_COMPLETAR_ORDEN_RR("LOG_COMPLETAR_ORDEN_RR"),
    VALIDAR_COMPLETADO_RR("VALIDAR_COMPLETADO_RR"),
    NOTAS_ALLOWED_CHARACTERES("NOTAS_ALLOWED_CHARACTERES"),
    NOTAS_SPECIAL_CHARACTERES("NOTAS_SPECIAL_CHARACTERES"),
    NOTAS_REPLACEMENT_CHARACTERES("NOTAS_REPLACEMENT_CHARACTERES"),
    ERROR_RR_COMPLETADO_WOR0063("ERROR_RR_COMPLETADO_WOR0063"),
    ERROR_RR_COMPLETADO_WOR0073("ERROR_RR_COMPLETADO_WOR0073"),
    MAX_SIZE_NOTE_F7("MAX_SIZE_NOTE_F7"),
    SESSION_USER_ID("SESSION_USER_ID"),
    MGW_LEVEL_L4J_OM_WS_COMPLETAR("MGW_LEVEL_L4J_OM_WS_COMPLETAR"),
    MGW_PATH_L4J_OM_WS_COMPLETAR("MGW_PATH_L4J_OM_WS_COMPLETAR"),

    MGW_LEVEL_L4J_OM_WS_CREAR("MGW_LEVEL_L4J_OM_WS_CREAR"),
    MGW_PATH_L4J_OM_WS_CREAR("MGW_PATH_L4J_OM_WS_CREAR"),
    MGW_LEVEL_L4J_OM_WS_UPD("MGW_LEVEL_L4J_OM_WS_UPD"),
    MGW_PATH_L4J_OM_WS_UPD("MGW_PATH_L4J_OM_WS_UPD"),
    MGW_LEVEL_L4J_OM_WS_CANC("MGW_LEVEL_L4J_OM_WS_CANC"),
    MGW_PATH_L4J_OM_WS_CANC("MGW_PATH_L4J_OM_WS_CANC"),
    MGW_LEVEL_L4J_OM_WS_RESQ("MGW_LEVEL_L4J_OM_WS_RESQ"),
    MGW_PATH_L4J_OM_WS_RESQ("MGW_PATH_L4J_OM_WS_RESQ"),
    MGW_LEVEL_L4J_OM_WS_SOFTC("MGW_LEVEL_L4J_OM_WS_SOFTC"),
    MGW_PATH_L4J_OM_WS_SOFTC("MGW_PATH_L4J_OM_WS_SOFTC"),
    MGW_LEVEL_L4J_OM_WS_STA("MGW_LEVEL_L4J_OM_WS_STA"),
    MGW_PATH_L4J_OM_WS_STA("MGW_PATH_L4J_OM_WS_STA"),
    MGW_LEVEL_L4J_OM_WS_ASSG("MGW_LEVEL_L4J_OM_WS_ASSG"),
    MGW_PATH_L4J_OM_WS_ASSG("MGW_PATH_L4J_OM_WS_ASSG"),
    MGW_PATH_L4J_OM_WS_ACT("MGW_PATH_L4J_OM_WS_ACT"),
    MGW_LEVEL_L4J_OM_WS_ACT("MGW_LEVEL_L4J_OM_WS_ACT"),
    MGW_PATH_L4J_OM_WS_S_A("MGW_PATH_L4J_OM_WS_S_A"),
    MGW_LEVEL_L4J_OM_WS_S_A("MGW_LEVEL_L4J_OM_WS_S_A"),
    MGW_PATH_L4J_OM_WS_MSJ("MGW_PATH_L4J_OM_WS_MSJ"),
    MGW_LEVEL_L4J_OM_WS_MSJ("MGW_LEVEL_L4J_OM_WS_MSJ"),
    MGW_TIMEOUT_CALL_RR("MGW_TIMEOUT_CALL_RR"),
    MGW_SAVE_RR_FAILED("MGW_SAVE_RR_FAILED"),
    MGW_LOG_BD_DETALLE("MGW_LOG_BD_DETALLE"),
    MGW_LOG("MGW_BD_DETALLE"),
    MGW_TIPO_ACTIVIDAD("C"),
    MGW_ACTIVIDAD_COSTO("RECAPEX"),
    MGW_ACTIVIDAD_GASTO("REOPEX"),
    TIPO_PROGRAMACION_SEGMENTO("RES"),
    OPS_ACT_ORDEN_USER("OPS_ACT_ORDEN_USER"),
    OPS_ACT_ORDEN_USER_DEFAULT("WFMUSER"),

    PCML_SERVICES("PCML_SERVICES"),
    PCML_SERVICESCALL("PCML_SERVICESCALL"),

    // Constantes de fin de d�a Plantilla de creaci�n de equipo
    FINDEDIA_IDINVENTARIO("FINDEDIA_IDINVENTARIO"),
    FINDEDIA_IDFAMILIA("FINDEDIA_IDFAMILIA"),
    FINDEDIA_IDMARCA("FINDEDIA_IDMARCA"),
    FINDEDIA_IDREFERENCIA("FINDEDIA_IDREFERENCIA"),
    FINDEDIA_SERIAL1("FINDEDIA_SERIAL1"),
    FINDEDIA_IDESTADO("FINDEDIA_IDESTADO"),
    FINDEDIA_IDUSUARIO("FINDEDIA_IDUSUARIO"),
    FINDEDIA_TX("FINDEDIA_TX"),
    FINDEDIA_RX("FINDEDIA_RX"),
    FINDEDIA_SNRDOWN("FINDEDIA_SNRDOWN"),
    FINDEDIA_SNRUP("FINDEDIA_SNRUP"),
    FINDEDIA_INTGET("FINDEDIA_INTGET"),
    FINDEDIA_INTPUT("FINDEDIA_INTPUT"),
    FINDEDIA_LOCALGET("FINDEDIA_LOCALGET"),
    FINDEDIA_LOCALPUT("FINDEDIA_LOCALPUT"),
    FINDEDIA_ANTIGUEDAD("FINDEDIA_ANTIGUEDAD"),
    FINDEDIA_INSTALADO("FINDEDIA_INSTALADO"),
    FINDEDIA_IDDIVISION("FINDEDIA_IDDIVISION"),
    FINDEDIA_FACTURAPROVEEDOR("FINDEDIA_FACTURAPROVEEDOR"),
    FINDEDIA_DIRECCION("FINDEDIA_DIRECCION"),
    FINDEDIA_IDUBICACION("FINDEDIA_IDUBICACION"),
    FINDEDIA_CODIGOSAP("FINDEDIA_CODIGOSAP"),
    FINDEDIA_PROVEEDOR("FINDEDIA_PROVEEDOR"),
    FINDEDIA_ESTADOHOMOLOGACION("FINDEDIA_ESTADOHOMOLOGACION"),
    FINDEDIA_RESPONSABLEHOMOLOGACION("FINDEDIA_RESPONSABLEHOMOLOGACION"),
    FINDEDIA_DESCRIPCION("FINDEDIA_DESCRIPCION"),
    FINDEDIA_IDNIVEL("FINDEDIA_IDNIVEL"),
    FINDEDIA_NUEVO("FINDEDIA_NUEVO"),
    FINDEDIA_IDFABRICANTE("FINDEDIA_IDFABRICANTE"),
    FINDEDIA_DNS("FINDEDIA_DNS"),
    FINDEDIA_GATEWAY("FINDEDIA_GATEWAY"),
    FINDEDIA_IDTIPOEQUIPO("FINDEDIA_IDTIPOEQUIPO"),
    FINDEDIA_IDHUB("FINDEDIA_IDHUB"),
    FINDEDIA_IDNG("FINDEDIA_IDNG"),
    FINDEDIA_CODIGOCIUDAD("FINDEDIA_CODIGOCIUDAD"),
    FINDEDIA_IDPROVEEDOR("FINDEDIA_IDPROVEEDOR"),
    FINDEDIA_CHIPID("FINDEDIA_CHIPID"),
    FINDEDIA_SETUPBOX("FINDEDIA_SETUPBOX"),
    FINDEDIA_UNITADDRESS("FINDEDIA_UNITADDRESS"),
    FINDEDIA_COMENTARIO_DEVOLUCION("FINDEDIA_COMENTARIO_DEVOLUCION"),

    FINDEDIA_USERREQUEST_NOW("FINDEDIA_USERREQUEST_NOW"),
    FINDEDIA_USERREQUEST_LOGIN("FINDEDIA_USERREQUEST_LOGIN"),
    FINDEDIA_USERREQUEST_COMPANY("FINDEDIA_USERREQUEST_COMPANY"),
    FINDEDIA_USERREQUEST_AUTH_STRING("FINDEDIA_USERREQUEST_AUTH_STRING"),
    FINDEDIA_SENDMAILREQUEST_DESTINO("FINDEDIA_SENDMAILREQUEST_DESTINO"),
    FINDEDIA_SENDMAILREQUEST_SUBJECT_VALIDO("FINDEDIA_SENDMAILREQUEST_SUBJECT_VALIDO"),
    FINDEDIA_SENDMAILREQUEST_SUBJECT_INVALIDO("FINDEDIA_SENDMAILREQUEST_SUBJECT_INVALIDO"),
    FINDEDIA_SENDMAILREQUEST_MENSAJE_VALIDO("FINDEDIA_SENDMAILREQUEST_MENSAJE_VALIDO"),
    FINDEDIA_SENDMAILREQUEST_MENSAJE_INVALIDO("FINDEDIA_SENDMAILREQUEST_MENSAJE_INVALIDO"),
    FINDEDIA_SENDMAILREQUEST_PLANTILLA("FINDEDIA_SENDMAILREQUEST_PLANTILLA"),

    FINDEDIA_ASIGNACION_CUENTA("FINDEDIA_ASIGNACION_CUENTA"),
    FINDEDIA_ASIGNACION_IDBODEGA("FINDEDIA_ASIGNACION_IDBODEGA"),
    FINDEDIA_ASIGNACION_IDUBICACION("FINDEDIA_ASIGNACION_IDUBICACION"),
    FINDEDIA_ASIGNACION_CODUBICACION("FINDEDIA_ASIGNACION_CODUBICACION"),
    FINDEDIA_ASIGNACION_ACTIVOTOA("FINDEDIA_ASIGNACION_ACTIVOTOA"),
    FINDEDIA_ASIGNACION_OBSERVACIONRECHAZO("FINDEDIA_ASIGNACION_OBSERVACIONRECHAZO"),

    FINDEDIA_ENVIOMAIL("FINDEDIA_ENVIOMAIL"),
    FINDEDIA_IDTIPODEVOLUCION("FINDEDIA_IDTIPODEVOLUCION"),
    FINDEDIA_ENVIOMAIL_PROXY("FINDEDIA_ENVIOMAIL_PROXY"),

    FINDEDIA_MOVIMIENTO_FUNCIONALIDAD("FINDEDIA_MOVIMIENTO_FUNCIONALIDAD"),
    FINDEDIA_MOVIMIENTO_TIPODOCUMENTO("FINDEDIA_MOVIMIENTO_TIPODOCUMENTO"),
    FINDEDIA_MOVIMIENTO_OBSERVACION("FINDEDIA_MOVIMIENTO_OBSERVACION"), 
    
    SQL_CON_WEBSERVICE("app.sql.con.webservice"), 
    SQL_CON_ESTADOAGENDA("app.sql.con.estadoagenda"), 
    SQL_CON_AGENDA("app.sql.con.agenda"), 
    SQL_CON_CARACTERISTICAS("app.sql.con.caracteristicas"), 

    
    
    ;
    
    private final String value;

    Constantes(String value) {
	this.value = value;
    }
	
    public String getValue() {
            return this.value;
    }
}
