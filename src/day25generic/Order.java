package day25generic;

/**
 * @author: chenwei
 * @date: 2021/9/2 3:32
 * @description: 描述
 */
public class Order<T> {
    private String name;
    T orderT;

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "name='" + name + '\'' +
                ", orderT=" + orderT +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    public Order(String name, T orderT) {
        this.name = name;
        this.orderT = orderT;
    }
}
