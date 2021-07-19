package learncodeday15.stage20;

import java.util.Collection;

/**
 * @author: chenwei
 * @date: 2021/7/19 19:57
 */
public class Java8 {
    public static void main(String[] args){
        System.out.println(Math.PI);
        SubClass subClass = new SubClass();
        //知识点1：接口中定义的静态方法，只能通过接口来调用
        //subClass.method1();
        //知识点2：通过实现类的对象，可以调用接口中默认的方法
        //如果实现类重写了接口中的默认方法，调用时，任然调用的是重写以后的方法
        subClass.method2();
        //知识点3：如果子类（实现类）,继承的父类和实现的接口中声明了同名同参数的方法，那么子类在
        //没有重写此方法的情况下，默认调用的是父类中的同名同参数的方法。 ---> 类优先原则

        //知识点4：如果实现类实现了多个接口，而这多个接口中定义了同名同参数的默认方法，
        //那么在实现类没有重写此方法的情况下，报错。--->接口冲突。
        //这就需要我们必须在实现类中重写此方法
        subClass.method3();
    }
}
class SubClass extends SuperClass implements Java8Test,Java8Test2{
    @Override
    public void method2() {
        System.out.println("$$$$$$$$");
    }

    @Override
    public void method3() {
        System.out.println("实现类实现多个接口，接口中的方法又相同时必须重写");
    }
    //知识点5：如何在子类（或实现类）的方法中调用父类、接口中被重写的方法
    public void myMethod(){
        method3();//调用自己定义的重写的方法
        super.method3();//调用父类中声明的
        Java8Test.super.method3();
        Java8Test2.super.method3();
    }
}
