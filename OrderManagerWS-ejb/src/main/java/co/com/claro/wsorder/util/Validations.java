package co.com.claro.wsorder.util;

import co.com.claro.wsorder.exceptions.BusinessExceptionFault;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * Clase encargada de realizar validaciones sobre los campos de entrada de un
 * servicio web.
 *
 * Creado el 10/01/2014
 *
 * @author Jairo Andr�s Tabares M <tabaresj@globalhitss.com>
 * @version 1.0
 */
public class Validations {

    /**
     * M�todo encargado de validar recursivamente si un campo de entrada es
     * requerido o no en un servicio web que este anotado con
     *
     * @XMLElement(required = true).
     *
     * @param object objeto a ser validado.
     * @return mensaje de exito o de error.
     * @throws BusinessExceptionFault
     */
    @SuppressWarnings("unused")
    public static <T> String requiredValidate(T object) throws BusinessExceptionFault {
        Class<? extends Object> clazz = object.getClass();
        Field[] declaredFields = clazz.getDeclaredFields();
        try {
            for (Field field : declaredFields) {
                XmlElement annotation = field.getAnnotation(XmlElement.class);
                String name = field.getName();
                if (!name.equals("serialVersionUID")) {
                    Object value = getMethodValue(object, clazz, name);
                    if (annotation != null && annotation.required()) {
                        if (value == null) {
                            throw new BusinessExceptionFault("MGW_4", "Required Value", "El valor del atributo " + name
                                    + " es requerido");
                        } else if (value instanceof String) {
                            if (((String) value).isEmpty()) {
                                throw new BusinessExceptionFault("MGW_4", "Required Value", "El valor del atributo " + name
                                        + " es requerido");
                            }
                        } else if (value instanceof Integer) {
                            try {
                                Integer entero = ((Integer) value);
                            } catch (NumberFormatException e) {
                                throw new BusinessExceptionFault("MGW_4", "Required Value", "El valor del atributo " + name
                                        + " es requerido");
                            } catch (ClassCastException e) {
                                throw new BusinessExceptionFault("MGW_4", "Required Value", "El valor del atributo " + name
                                        + " es requerido");
                            }
                        }
                    }
                    /*else if (value instanceof String) {
						if(value != null && ((String) value).isEmpty()){
							setMethodValue(object, clazz, name);
						}else if (value == null) {
							setMethodValue(object, clazz, name);
						}	
					}*/

                    Class<?> clazz2 = field.getType();
                    Annotation[] annotations = clazz2.getAnnotations();
                    for (Annotation annot : annotations) {
                        if (annot.annotationType().equals(XmlAccessorType.class)) {
                            try {
                                String response = requiredValidate(getMethodValue(
                                        object, clazz, field.getName()));
                                if (!response.equals("Ok")) {
                                    return response;
                                }
                            } catch (NoSuchMethodException e) {
                                e.printStackTrace();
                            } catch (IllegalAccessException e) {
                                e.printStackTrace();
                            } catch (InvocationTargetException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                }
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return "Ok";
    }

    /**
     * M�todo encargado de obtener el valor de un metodo en base a su nombre.
     *
     * @param object objeto del cual se quiere ejecutar un m�todo.
     * @param clazz clase del objeto.
     * @param name nombre del atributo.
     * @return valor obtenido.
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    private static <T> Object getMethodValue(T object, Class<? extends Object> clazz,
            String name) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {
        String firstChar = name.substring(0, 1).toUpperCase();
        Method method = clazz.getMethod("get" + firstChar + name.substring(1));
        Object value = method.invoke(object);
        return value;
    }

    /**
     * M�todo encargado de setear el valor de un metodo en base a su nombre.
     *
     * @param object objeto del cual se quiere ejecutar un m�todo.
     * @param clazz clase del objeto.
     * @param name nombre del atributo.
     * @throws NoSuchMethodException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     */
    @SuppressWarnings("unused")
    private static <T> void setMethodValue(T object, Class<? extends Object> clazz,
            String name) throws NoSuchMethodException, IllegalAccessException,
            InvocationTargetException {
        String firstChar = name.substring(0, 1).toUpperCase();
        Method method = clazz.getMethod("set" + firstChar + name.substring(1));
        method.invoke(object, "-");
    }

}
