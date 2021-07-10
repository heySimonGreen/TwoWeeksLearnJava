package learncodeday12.testembellishmentsymbol2;

import learncodeday12.testembellishmentsymbol.Order;

/**
 * @author: chenwei
 * @date: 2021/7/9 22:41
 */
public class SubOrder extends Order {
    public void method(){
        orderProtected=1;
        orderPublic=2;

        methodProtected();
        methodPublic();

        //在不用包的子类中，不能调用Order类中声明为private和缺省权限的属性和方法。
//        orderPrivate=1;
//        orderDefault=2;
//
//        methodPrivate();
//        methodDefault();


    }
}
