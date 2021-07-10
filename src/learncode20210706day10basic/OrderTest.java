package learncode20210706day10basic;

/**
 * @author: chenwei
 * @date: 2021/7/6 19:37
 */
public class OrderTest {
    public static void main(String[] args){
        System.out.println('a' + 'b');
        Order order = new Order();
        order.orderDefault = 1;
        order.orderPublic = 3;
        //出了Order类之后，私有的结构就不可以调用了
        //报错
        //order.orderPrivate = 3;

        order.methodDefault();
        order.methodPublic();
        //出了Order类之后，私有的结构就不可以调用了
        //order.methodPrivate();
    }
}
