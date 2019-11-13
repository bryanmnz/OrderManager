/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.wsorder.vo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase utilitaria encargada de generar autenticacion para los servicios de ETA
 * Direct.
 *
 * @author admin
 */
public class ClientUtils {

    public static String lpad(String valor, int tamano, String caracter) {
        String retorno = valor;
        while (retorno.length() < tamano) {
            retorno = caracter + retorno;
        }
        return retorno;
    }

    private static String obtenerClave(UserElement userElement, String password) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz");
        df.setTimeZone(TimeZone.getTimeZone("GMT-5"));
        userElement.setNow(df.format(new Date()).replaceAll("GMT", ""));
        String resultado = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            String primeraEncripcion = new BigInteger(1, md.digest())
                    .toString(16);
            primeraEncripcion = lpad(primeraEncripcion, 32, "0");
            md.update((userElement.getNow() + primeraEncripcion).getBytes());
            resultado = new BigInteger(1, md.digest()).toString(16);
            resultado = lpad(resultado, 32, "0");
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ClientUtils.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return resultado;
    }

    public static UserElement getUserElement(String login, String company,
            String password) {
        UserElement userElement;
        userElement = new UserElement();
        userElement.setCompany(company);
        userElement.setLogin(login);
        userElement.setAuthString(obtenerClave(userElement, password));
        return userElement;
    }

    public static String cipher(String password) {

        String resultado = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            resultado = new BigInteger(1, md.digest()).toString(16);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ClientUtils.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        return resultado;
    }

}
