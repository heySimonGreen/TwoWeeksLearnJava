package day17project3.domain;

/**
 * @author: chenwei
 * @date: 2021/7/26 23:55
 */
public class Printer implements Equipment{
    private String name;
    private String type;

    public Printer() {
    }

    public Printer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getDescription() {
        return name + "(" + type +")";
    }
}
