package co.com.claro.wsorder.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase con m�todos utilitarios para transformar respuestas en XML o HTML a
 * objetos. Creado el 23/01/2014
 *
 * @author Jairo Andr�s Tabares M <tabaresj@globalhitss.com>
 * @version 1.0
 */
public class ResponseUtil {

    /**
     * M�todo encargado de asignar datos a un objeto sin importar el tipo.
     *
     * @param response Objeto al que se le setearan los datos.
     * @param values datos a ser seteados al objeto.
     * @param params arreglo con los nombres de los atributos del objeto a ser
     * seteados.
     * @return Objeto con los datos seteados.
     * @throws Exception por si ocurre una excepcion.
     */
    public static <T> T asignResponseValues(T response, List<String> values,
            String... params) throws Exception {
        Class<? extends Object> clazz = response.getClass();
        for (int i = 0; i < values.size(); i++) {
            Method method;
            String nameMethod = getNameMethodSetByField(params[i]);
            System.out.println("39: ResponseUtil: asignResponseValues: param: " + params[i]);
            System.out.println("40: ResponseUtil: asignResponseValues: nameMethod: " + nameMethod);
            try {
                method = clazz.getMethod(nameMethod, String.class);
                System.out.println("42: ResponseUtil: asignResponseValues: " + method);
                method.invoke(response, (values.get(i)));
                System.out.println("43: ResponseUtil: asignResponseValues: method TRY : " + method + " values: " + values.get(i));
            } catch (NoSuchMethodException e) {
                try {
                    method = clazz.getMethod(nameMethod, Integer.class);
                    method.invoke(response, (Integer.parseInt(values.get(i))));
                    System.out.println("49: ResponseUtil: asignResponseValues: method CATCH TRY : " + method + " error: " + e.getMessage());
                } catch (NoSuchMethodException ex) {
                    method = clazz.getMethod(nameMethod, Boolean.class);
                    System.out.println("52: ResponseUtil: asignResponseValues: method CATCH TRY  CATCH: values:" + values.get(i) + " error: " + ex.getMessage());
                    method.invoke(response,
                            (Boolean.parseBoolean(values.get(i))));
                    System.out.println("55: ResponseUtil: asignResponseValues: method CATCH TRY  CATCH: " + method + " error: " + ex.getMessage());
                }
            }

        }
        return response;
    }

    /**
     * M�todo encargado de dividir una cadena de caracteres en base a una
     * expresion regular.
     *
     * @param responseTemp cadena a ser dividida.
     * @param regex expresion regular.
     * @return lista con los substrings.
     */
    public static List<String> divideStringByRegex(String responseTemp,
            String regex) {
        String[] tokensTemp = responseTemp.trim().split(regex);
        List<String> tokens = new java.util.ArrayList<String>();
        for (int i = 0; i < tokensTemp.length; i++) {
            String token = tokensTemp[i];
            if (!token.isEmpty()) {
                tokens.add(token);
            }
        }
        return tokens;
    }

    /**
     * M�todo encargado de obtener los datos dentro de una etiqueta html o xml.
     *
     * @param contin boolean que indica si se continua buscando la etiqueta mas
     * de una vez.
     * @param cad cadena de caracteres con el xml o html.
     * @param subStrings coincidencias a encontrar o etiquetas.
     * @return lista con el contenido de cada etiqueta enviada.
     */
    public static List<String> divideResponseStringByTags(Boolean contin,
            String cad, String... subStrings) {
        Pattern p;
        Matcher m;
        List<Integer> positions = new ArrayList<>();
        List<Integer> usedPositions = new ArrayList<>();
        int position = 0;
        for (int i = 0; i < subStrings.length; i++) {
            p = Pattern.compile(subStrings[i]);
            m = p.matcher(cad);
            while (m.find()) {
                positions.add(m.start());
                positions.add(m.end());
                if (contin) {
                    usedPositions.add(++position);
                    usedPositions.add(++position);
                    position += 2;
                }
            }
            if (!contin) {
                usedPositions.add(++position);
                usedPositions.add(++position);
                position += 2;
            }
        }
        List<String> values = new ArrayList<>();
        for (int i = 0; i < usedPositions.size(); i++) {
            try {
                values.add(cad.substring(positions.get(usedPositions.get(i)),
                        positions.get(usedPositions.get(++i))).trim());
            } catch (IndexOutOfBoundsException e) {

            }
        }
        return values;
    }

    /**
     * M�todo encargado de obtener el nombre de un m�todo set en base al nombre
     * del atributo, el metodo debe estar creado con el estandar de buenas
     * practicas de java.
     *
     * @param field nombre de la propiedad.
     * @return nombre del metodo construido.
     */
    public static <T> String getNameMethodSetByField(String field) {
        String nameMethod = new String(field);
        nameMethod = new String("set").concat((nameMethod.substring(0, 1))
                .toUpperCase().concat(
                        nameMethod.substring(1, nameMethod.length())));
        return nameMethod;
    }

    /**
     * M�todo encargado de dividir una cadena en base a un caracter.
     *
     * @param text cadena a dividir.
     * @param character caracter de separacion.
     * @return lista de elementos.
     */
    public static List<String> divideResponseXSeparatorCharacter(String text,
            String character) {
        List<String> values = new ArrayList<>();

        String[] split = text.split(character);
        for (String value : split) {
            value = value.trim();
            if (!value.isEmpty()) {
                values.add(value);
            }
        }

        return values;
    }

    /**
     * M�todo recursivo encargado de obtener las posiciones de unos substrings
     * de una cadena.
     *
     * @param positions lista de posiciones a devolver.
     * @param position posicion en la que se va a iniciar a buscar en la cadena.
     * @param cad cadena en la que se va a realizar la busqueda.
     * @param subStrings sub cadenas a buscar para obtenes sus posiciones.
     * @return lista de posiciones obtenida.
     */
    public static List<Integer> getSubStringPositions(List<Integer> positions,
            int position, String cad, String... subStrings) {

        Pattern p;
        Matcher m;
        int count = 0;
        boolean find = false;
        for (int i = 0; i < subStrings.length; i++) {
            p = Pattern.compile(subStrings[i]);
            if (find) {
                m = p.matcher(cad.substring(position));
            } else {
                m = p.matcher(cad);
            }
            while (m.find()) {
                find = true;
                if (count == 0) {
                    positions.add(m.end() + position);
                    position = m.end() + position;
                } else {
                    positions.add(m.start() + position);
                    position = m.end() + position;
                }
                count++;
                break;
            }
            if (!find) {
                break;
            }
        }
        if (position < cad.length()) {
            return getSubStringPositions(positions, position, cad, subStrings);
        }
        return positions;
    }

    /**
     * M�todo encargado de obtener las posiciones de una subcadena.
     *
     * @param position posicion de inicio de la busqueda.
     * @param add boolean encargado de indicar si se debe sumar la posicion
     * final obtenida o no.
     * @param repeat boolean que indica si se debe buscar mas de una vez la
     * coincidencia.
     * @param start boolean que indica si se obtiene la posicion inicial o final
     * de la coincidencia.
     * @param cad cadena de caracteres en el cual realizar la busqueda.
     * @param subString cadena a buscar.
     * @return lista de posiciones obtenida.
     */
    public static List<Integer> getSubStringPositions(int position,
            boolean add, boolean repeat, boolean start, String cad,
            String subString) {

        List<Integer> positions = new ArrayList<>();
        Pattern p;
        Matcher m = null;
        p = Pattern.compile(subString);
        m = p.matcher(cad.substring(position));
        while (m.find()) {
            if (!start) {
                positions.add(add ? m.end() + position : m.end());
                position = add ? m.end() + position : m.end();
            } else {
                positions.add(add ? m.start() + position : m.start());
                position = add ? m.start() + position : m.start();
            }
            if (!repeat) {
                break;
            }
        }
        return positions;
    }

}
