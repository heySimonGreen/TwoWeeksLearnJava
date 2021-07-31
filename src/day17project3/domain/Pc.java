package day17project3.domain;

/**
 * @author: chenwei
 * @date: 2021/7/26 23:43
 */
public class Pc implements Equipment{
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    private String display;

    @Override
    public String getDescription() {
        return model + "(" + display +")";
    }

    public Pc(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public Pc() {
    }
}
