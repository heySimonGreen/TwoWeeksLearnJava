package LearnCode20210628.day210629.CodeExecutionProcess;

/**
 * @Author chenwei
 * @Date 2021/6/29 12:09
 * @Version 1.0
 */
/*
* 静态和静态时平级的，遵循自上向下的顺序执行，所以一定时先
* new的时候调用构造方法，构造方法调用前会先去调用构造代码块
* 1.对象一旦创建就会调用与之相对应的构造方法
* 2.不创建对象就不会调用构造方法
* 3.构造函数的作用是给对象初始化
* 4.对象创建一次,构造函数只调用一次,而普通方法可以被调用很多次
* */
public class Car {
    public static Car car1 = new Car();
    public static Car car2 = new Car();
    //实例语句块，在没调用一次构造方法执行一次。
    {
        System.out.println("构造代码块执行");
    }
    //静态代码块在类加载时执行，并且只执行一次。
    static {
        System.out.println("静态代码块执行");
    }
    public static void main(String[] args){
        new Car();
    }
}
