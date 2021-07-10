package learncodeday12.testembellishmentsymbol;

/**
 * @author: chenwei
 * @date: 2021/7/9 22:25
 */
public class OrderTest {
    public static void main(String[] args){
        Order order = new Order();
        order.orderDefault=2;
        order.orderProtected=2;
        order.orderPublic=1;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

//        order.orderPrivate=4;
//        order.methodPrivate();
    }
}
