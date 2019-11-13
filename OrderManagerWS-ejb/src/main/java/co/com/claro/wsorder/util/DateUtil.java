    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.wsorder.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author John Arevalo
 */
public final class DateUtil {

    /**
     * <p>crea una instacia de <code>java.util.Date</code> a partir de los 
     * parametros enviados</p>
     * @param century siglo
     * @param year
     * @param month el mes empezando en 1
     * @param day
     * @return la fecha o <code>null</code> si los parametros son erroneos
     */
    public static Date createDate(Integer century, Integer year, Integer month, Integer day) {
        Date date = null;
        if (century != null && year != null && month != null && day != null &&
                century > 0 && year > 0 && month > 0 && day > 0) {
            date = (new GregorianCalendar(century * 100 + year,
                    month - 1,
                    day)).getTime();
        }
        return date;
    }

    /**
     * Crea una fecha a partir de un string en formato yyyyMMdd, con el mes
     * iniciando en 1
     * @param fecha el String con el formato especificado
     * @return
     */
    public static Date createDate(String fecha) {
        Date date = null;
        try {
            Integer anyo = Integer.parseInt(fecha.substring(0, 4));
            Integer mes = Integer.parseInt(fecha.substring(4, 6));
            Integer dia = Integer.parseInt(fecha.substring(6));
            date = new GregorianCalendar(anyo, mes - 1, dia).getTime();
        } catch (Exception exc) {
        }
        return date;
    }

    /**
     * Crea una fecha apartir de un formato predefinido
     * @param fecha la fecha en formato String
     * @param format el formato en que se ingresa la fecha
     * @return la fecha creada, o null si ocurrio un error
     */
    public static Date createDate(String fecha, String format) {
        Date date = null;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            date = formatter.parse(fecha);
        } catch (Exception exc) {
        }
        return date;
    }

    public static String format(Date date, String format) {
        try {
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            return formatter.format(date);
        } catch (Exception exc) {
            return null;
        }
    }

    public static String getCurrentDateAsString() {
        return getCurrentDateAsString("yyyy/MM/dd");
    }

    public static String getCurrentDateAsString(String format) {
        Calendar c = new GregorianCalendar();
        SimpleDateFormat formatter = new SimpleDateFormat();
        formatter.applyPattern(format);
        String fecha = formatter.format(c.getTime());
        return fecha;
    }

    /**
     * Devuelve el mes actual, Enero es el mes 1.
     * @return
     */
    public static int getCurrentMonth() {
        return new GregorianCalendar().get(Calendar.MONTH) + 1;
    }
}
