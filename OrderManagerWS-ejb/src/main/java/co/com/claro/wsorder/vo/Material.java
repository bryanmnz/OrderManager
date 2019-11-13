package co.com.claro.wsorder.vo;

/**
 *
 */
public class Material {

    private String code;

    private String name;

    private String family;

    private Integer min;

    private Integer max;

    private String real;

    private String units;

    private String area;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public String getReal() {
        return real;
    }

    public void setReal(String real) {
        if (real == null || real.length() == 0) {
            this.real = "0";
        } else {
            this.real = real;
        }
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

}
