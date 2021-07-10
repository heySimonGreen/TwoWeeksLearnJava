package learncodeday12.testembellishmentsymbol2;

import learncodeday12.testembellishmentsymbol.Order;

/**
 * @author: chenwei
 * @date: 2021/7/9 22:49
 */
public class OrderTest {
    public static void main(String[] args){
        Order order = new Order();
        order.orderPublic = 1;
        order.methodPublic();

        //不同包下的普通类（非子类）要使用Order类，不可以调用声明为private、缺省、protected权限的属性和方法。
//        orderPrivate=1;
//        orderDefault=2;
//        orderProtected=1;
//
//        methodPrivate();
//        methodProtected();
//        methodDefault();

    }
}
