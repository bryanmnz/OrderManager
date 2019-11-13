package co.com.claro.wsorder.util;


import co.com.claro.wsorder.exceptions.BusinessExceptionFault;
import co.com.claro.wsorder.vo.BillingActivity;
import co.com.claro.wsorder.vo.Material;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase usada para realizar operaciones propias de cada m�todo del servicio web
 * Order Manager.
 *
 * Creado el 10/01/2014
 *
 * @author Jairo Andr�s Tabares M <tabaresj@globalhitss.com>
 * @version 1.0
 */
public class Operations {

    /**
     * M�todo encargado de obtener las actividades que llegan en XML.
     *
     * @param xml XML con la informacion de los materiales.
     * @return lista de actividades obtenidas.
     * @throws BusinessExceptionFault por si ocurre una excepcion.
     */
    public static List<BillingActivity> getXmlActivities(String xml)
            throws BusinessExceptionFault {
        try {
            xml = xml.replace("&lt;", "<");
            xml = xml.replace("&gt;", ">");
            xml = xml.replace("&#039;", "\"");
            List<String> response = ResponseUtil.divideResponseStringByTags(
                    true, xml, "</?BillingActivities>");
            List<BillingActivity> billingActivities = new ArrayList<>();
            for (String string : response) {
                List<Integer> positions = ResponseUtil.getSubStringPositions(0,
                        false, true, false, string, "<BillingActivity");
                List<Integer> positions2 = new ArrayList<>();
                for (Integer pos : positions) {
                    List<Integer> subStringPositions = ResponseUtil
                            .getSubStringPositions(pos, true, false, true,
                                    string, ">");
                    positions2.add(pos);
                    if (!subStringPositions.isEmpty()) {
                        positions2.add(subStringPositions.get(0));
                    }
                }
                for (int i = 0, j = 1; j < positions2.size(); i = i + 2, j = j + 2) {
                    String substring = string.substring(positions2.get(i),
                            positions2.get(j));
                    xml = xml.replaceFirst(substring, "");
                    List<String> responseStrs = ResponseUtil
                            .divideResponseStringByTags(true, substring, "\"", "'");
                    BillingActivity billingActivity = ResponseUtil
                            .asignResponseValues(new BillingActivity(),
                                    responseStrs, "name", "must_be_executed",
                                    "executed", "material_required",
                                    "activity_code", "exchange");
                    billingActivities.add(billingActivity);
                }

            }
            return billingActivities;

        } catch (Exception e) {
            throw new BusinessExceptionFault("MGW_3", "Error en el formato del XML",
                    e.getMessage());
        }
    }

    /**
     * Método encargado de obtener las actividades y materiales que llegan en
     * XML.
     *
     * @param xml XML con la informacion de las actividades y materiales.
     * @return lista de actividades obtenidas.
     * @throws BusinessExceptionFault por si ocurre una excepcion.
     */
    public static List<BillingActivity> getXmlMateriales(String xml)
            throws BusinessExceptionFault {
        try {
            xml = xml.replace("&lt;", "<");
            xml = xml.replace("&gt;", ">");
            xml = xml.replace("&#039;", "\"");
            List<String> response = ResponseUtil.divideResponseStringByTags(
                    true, xml, "</?BillingActivities>");
            List<BillingActivity> billingActivities = new ArrayList<>();
            for (String string : response) {
                List<Integer> positions = ResponseUtil.getSubStringPositions(0,
                        false, true, false, string, "<BillingActivity");
                List<Integer> positions2 = new ArrayList<>();
                for (Integer pos : positions) {
                    List<Integer> subStringPositions = ResponseUtil
                            .getSubStringPositions(pos, true, false, true,
                                    string, ">");
                    positions2.add(pos);
                    if (!subStringPositions.isEmpty()) {
                        positions2.add(subStringPositions.get(0));
                    }
                }
                for (int i = 0, j = 1; j < positions2.size(); i = i + 2, j = j + 2) {
                    String substring = string.substring(positions2.get(i),
                            positions2.get(j));
                    xml = xml.replaceFirst(substring, "");
                    List<String> responseStrs = ResponseUtil
                            .divideResponseStringByTags(true, substring, "\"", "'");
                    BillingActivity billingActivity = ResponseUtil
                            .asignResponseValues(new BillingActivity(),
                                    responseStrs, "name", "must_be_executed",
                                    "executed", "material_required",
                                    "activity_code", "exchange");
                    billingActivities.add(billingActivity);
                }

            }

            List<String> response2 = ResponseUtil.divideResponseStringByTags(
                    true, xml, "</?BillingActivity>");
            int i = 0;
            for (String string : response2) {

                List<Integer> positions = ResponseUtil.getSubStringPositions(0,
                        false, true, false, string, "<Material");
                List<Integer> positions2 = new ArrayList<>();
                for (Integer pos : positions) {
                    List<Integer> subStringPositions = ResponseUtil
                            .getSubStringPositions(pos, true, false, true,
                                    string, ">");
                    positions2.add(pos);
                    if (!subStringPositions.isEmpty()) {
                        positions2.add(subStringPositions.get(0));
                    }
                }
                List<Material> materials = new ArrayList<>();
                for (int k = 0, j = 1; j < positions2.size(); k = k + 2, j = j + 2) {
                    String substring = string.substring(positions2.get(k),
                            positions2.get(j));
                    List<String> responseStrs = ResponseUtil
                            .divideResponseStringByTags(true, substring, "\"", "'");
                    Material material = ResponseUtil.asignResponseValues(
                            new Material(), responseStrs, "code", "name",
                            "family", "min", "max", "real", "units", "area");
                    materials.add(material);
                }
                billingActivities.get(i++).setMaterials(materials);

            }
            return billingActivities;

        } catch (Exception e) {
            throw new BusinessExceptionFault("MGW_3", "Error en el formato del XML",
                    e.getMessage());
        }
    }

    

}
