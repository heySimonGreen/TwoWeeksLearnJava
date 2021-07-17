package learncodeday13.test3;

/**
 * @author: chenwei
 * @date: 2021/7/13 15:03
 */
public class ObjectTest {
    public static void main(String[] args){
        Order order = new Order();
        System.out.println(order.getClass().getSuperclass());
    }
}
class Order{

}
