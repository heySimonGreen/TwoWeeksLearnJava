package learncodeday13.practice8;

import java.util.Objects;

/**
 * @author: chenwei
 * @date: 2021/7/13 21:15
 */
public class ObjectTests {
    public static void main(String[] args){
        Order order1 = new Order(3,"chenwei");
        Order order2 = new Order(3,"chenwei");
        Order order3 = new Order(4,"chenwei");
        System.out.println("order1.equals(order2)" + order1.equals(order2));
        System.out.println("order1.equals(order2)" + order2.equals(order3));
        order1.toString();
    }
}
class Order{
    int orderId;
    String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName);
    }
}
