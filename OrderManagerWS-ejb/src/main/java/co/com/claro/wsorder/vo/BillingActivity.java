package co.com.claro.wsorder.vo;

import java.util.List;

public class BillingActivity {

    private String name;

    private Boolean must_be_executed;

    private Boolean executed;

    private Boolean material_required;

    private String activity_code;

    private String exchange;

    private long quantity;

    private List<Material> materials;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMust_be_executed() {
        return must_be_executed;
    }

    public void setMust_be_executed(Boolean must_be_executed) {
        this.must_be_executed = must_be_executed;
    }

    public Boolean getExecuted() {
        return executed;
    }

    public void setExecuted(Boolean executed) {
        this.executed = executed;
    }

    public Boolean getMaterial_required() {
        return material_required;
    }

    public void setMaterial_required(Boolean material_required) {
        this.material_required = material_required;
    }

    public String getActivity_code() {
        return activity_code;
    }

    public void setActivity_code(String activity_code) {
        this.activity_code = activity_code;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

}
