package sortAlgorithm;

import learncode20210706day10basic.Order;

/**
 * @author: chenwei
 * @date: 2021/7/7 13:17
 */
public class OrderTest {
    public static void main(String[] args){
        Order order = new Order();
        order.orderPublic = 3;
        //出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
        //order.orderDefault = 1;
        //出了Order类之后，私有的结构就不可以调用了
        //报错
        //order.orderPrivate = 3;

        order.methodPublic();
        //出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
        //order.methodDefault();
        //出了Order类之后，私有的结构就不可以调用了
        //order.methodPrivate();
    }
}
