package day25generic;

import org.junit.Test;

/**
 * @author: chenwei
 * @date: 2021/9/2 3:34
 * @description: 描述
 */
public class OrderTest {
    @Test
    public void test1(){
        //如果定义了泛型类，实例化没有指名类的泛型，则认为此泛型类型为Object
        //要求：如果大家定义了类是带泛型的，建议在实例化时要指名类的泛型
        Order order = new Order();
        order.setName("chenwei");
        order.setOrderT(124);
        //建议在实例化时要指名类的泛型
        Order<Integer> order1 = new Order<>();
        order1.setOrderT(12);
        order1.setName("cj");
    }
}
