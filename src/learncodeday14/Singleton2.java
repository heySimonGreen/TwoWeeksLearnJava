package learncodeday14;

/**
 * @author: chenwei
 * @date: 2021/7/15 17:57
 * 懒汉式
 */
public class Singleton2 {
    public static void main(String[] args){
        Order order = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order == order2);
    }
}
class Order{
    //1.私有化构造器

     private Order(){
     }
     //2.声明当前类对象，没有初始化。懒。
    //4.此对象也必须声明为static

     private static Order instance = null;

     //3.声明public、static的返回当前类对象的方法

     public static Order getInstance(){
         if (instance == null){
             instance = new Order();
         }
         return instance;
     }
}
