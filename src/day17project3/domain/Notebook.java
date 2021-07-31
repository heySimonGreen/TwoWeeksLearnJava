package day17project3.domain;

/**
 * @author: chenwei
 * @date: 2021/7/26 23:50
 */
public class Notebook implements Equipment{
    private String model;

    public Notebook() {
    }

    public Notebook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    private double price;
    @Override
    public String getDescription() {
        return model + "(" + price +")";
    }
}
