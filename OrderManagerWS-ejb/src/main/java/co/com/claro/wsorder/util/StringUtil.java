/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.claro.wsorder.util;


import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.telmex.pcml.service.StringUtilException;

/**
 *
 * @author John Arevalo
 */
public final class StringUtil {

    static final byte[] HEX_CHAR_TABLE = {
        (byte) '0', (byte) '1', (byte) '2', (byte) '3',
        (byte) '4', (byte) '5', (byte) '6', (byte) '7',
        (byte) '8', (byte) '9', (byte) 'a', (byte) 'b',
        (byte) 'c', (byte) 'd', (byte) 'e', (byte) 'f'
    };

    /**
     * <p>Une elementos de una colección mediante una cadena.
     *
     * @param array
     * @param delim
     * @return Devuelve una cadena que contiene una representación de todos los
     *  elementos de la colección en el mismo orden,
     *  pero con la cadena <code>delim</code> en medio de los mismos.
     */
    public static String implode(Collection<String> array, String delim) {
        String out = "";
        int i = 0;
        for (String s : array) {
            if (i != 0) {
                out += delim;
            }
            out += s;
            i++;
        }
        return out;
    }

    public static String implodeObject(Collection<Object> array, String delim) {
        String out = "";
        int i = 0;
        for (Object s : array) {
            if (i != 0) {
                out += delim;
            }
            out += s;
            i++;
        }
        return out;
    }

    public static String repeat(String src, int repeat) {
        StringBuilder buf = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            buf.append(src);
        }
        return buf.toString();
    }

    /**
     * <p>Completa una Cadena con el caracter dado hasta la longitud especificada. El
     * caracter se agrega antes de la cadena.
     * si <code>length</code> es menor que la longitud de <code>string</code> 
     * la cadena se devolvera sin cambios</p>
     * @param string La cadena a completar
     * @param complete el caracter que llenara los espacios vacios
     * @param length la longitud que tendrá la nueva cadena
     * @return la cadena modificada
     */
    public static String completeWith(String string, String complete, int length) {
        if (string != null && string.length() < length) {
            return repeat(complete, length - string.length()) + string;
        } else {
            return string;
        }
    }

    /**
     * <p>Devuelve la cantidad de palabras de una cadena</p>
     * <p><code>String text = StringUtil.getWords("this is an example",2);</code></p>
     * <code>text</code> tendra el valor "this is"
     * @param text La cadena a analizar
     * @param count La cantidad de palabras a extraer
     * @return el resultado de la busqueda, o <code>text</code> sin cambios si no encuentra resultados
     */
    public static String getWords(String text, int count) {
        if (count < 1) {
            throw new IllegalArgumentException("count:'" + count + "' valor invalido");
        }
        String patron = "[^\\s]*(\\s[^\\s]*){" + (count - 1) + "}";
        Pattern pattern = Pattern.compile(patron);
        Matcher m = pattern.matcher(text);
        return m.find() ? m.group() : text;
    }

    public static String encodeHex(byte[] raw) {
        byte[] hex = new byte[2 * raw.length];
        int index = 0;

        for (byte b : raw) {
            int v = b & 0xFF;
            hex[index++] = HEX_CHAR_TABLE[v >>> 4];
            hex[index++] = HEX_CHAR_TABLE[v & 0xF];
        }
        try {
            return new String(hex, "ASCII");
        } catch (UnsupportedEncodingException exc) {
            return null;
        }
    }

    /**
     * Genera una cadena hexadecimal aleatoria con la longitud espeficada
     * @param length la longitud de la cadena
     * @return cadena aleatoria
     */
    public static String randomizeHex(int length) {
        byte[] hex = new byte[length];
        for (int i = 0; i < hex.length; i++) {
            hex[i] = (byte) Math.floor(Math.random() * 255);
        }
        return HashUtil.getMD5(new String(hex)).substring(0, length);
    }

    public static String toCamelCase(String value) {
        if (value == null) {
            return null;
        }
        StringBuilder camelCased = new StringBuilder("");
        String[] words = value.split(" ");
        for (String word : words) {
            String firstChar = word.substring(0, 1);
            camelCased.append(word.replaceFirst(".", firstChar.toUpperCase()));
        }

        return camelCased.toString();

    }

    /**
     * valida si una cadena es nula o si está vacia
     * @return
     */
    public static boolean isEmpty(String string) {
        return string == null || string.trim().isEmpty();
    }

    public static Object[] explode(String string, String delim) throws StringUtilException {
        LinkedList<String> lista = new LinkedList<>();
        int indice = 0;
        if (delim == null) {
            throw new StringUtilException("No existe un delimitador");
        }
        if (string != null && !string.equals("")) {
            parteCadena:
            while (indice < string.length()) {
                try{
                lista.add((String) string.substring(indice, string.indexOf(delim)));
                string = string.substring(string.indexOf(delim) + 1);
                if(string.indexOf(delim) == -1){
                    lista.add(string);
                    break parteCadena;
                }
                }
                catch(StringIndexOutOfBoundsException e){
                    break parteCadena;
                }
                
            }
        }

        return lista.toArray();
    }

    public static int coutChar(String string, char c){
        int cuenta = 0;
        for(int i=0; i<string.length(); i++){
            if(string.charAt(i) == c)
                cuenta++;
        }
        return cuenta;
    }
}
