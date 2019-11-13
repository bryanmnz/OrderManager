/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.wsorder.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public final class HashUtil {

    // Instancianci�n del logger 
    private static Logger logger = LogManager.getLogger(
            Constantes.LOGGER_PRINCIPAL.getValue());


    public static String getMD5(String text) {
        String md5 = null;
        MessageDigest md;

        try {
            md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(text.getBytes());
            md5 = StringUtil.encodeHex(digest);
        } catch (NoSuchAlgorithmException ex) {
            logger.error("Error", ex);
        }


        return md5;
    }

    /**
     * Crea llave una llave a partir de 2 parametros que recibe
     * convirtiendolos en "SHA-256" y luego en hexadecimal
     */
    public static String generaKey(String key, String cadenaCaracteres) {
        String result = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            String base = (key != null ? key : "") + (cadenaCaracteres != null ? cadenaCaracteres : "");
            byte[] bytes = base.getBytes();
            md.update(bytes);
            byte[] mdbytes = md.digest();

            StringBuilder hexString = new StringBuilder();
            for (int i = 0; i < mdbytes.length; i++) {
                hexString.append(Integer.toHexString(0xFF & mdbytes[i]));
            }
            result = hexString.toString();

        } catch (NoSuchAlgorithmException ex) {
            logger.error("Error", ex);
        }
        return result;
    }
}
