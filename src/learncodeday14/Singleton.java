package learncodeday14;

/**
 * @author: chenwei
 * @date: 2021/7/15 17:41
 * 饿汉式单例模式
 */
public class Singleton {
    public static void main(String[] args){
        Bank bank = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank == bank2);
    }
}
class Bank{
    //1.私有化类的构造器

    private Bank(){

    }
    //2.内部创建类的对象
    //3.要求此对象也必须声明为静态的

    private static Bank instance = new Bank();

    //3.提供公共的静态方法，返回类的对象

    public static Bank getInstance(){
        return instance;
    }
}
