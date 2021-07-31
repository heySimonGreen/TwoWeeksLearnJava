package day18thread;

/**
 * @author: chenwei
 * @date: 2021/7/31 23:32
 * @description: 描述
 */
class A{
    public synchronized void foo(B b){//同步监视器,A类的对象
        System.out.println("当前线程名称: " + Thread.currentThread().getName());
        System.out.println("当前线程名称: " + Thread.currentThread().getName() + "企图调用B实例的last方法");
        b.last();
    }
    public synchronized void last(){
        System.out.println("进入了A类的last方法内部");
    }
}
class B{
    public synchronized void bar(A a){//同步监视器,A类的对象
        System.out.println("当前线程名称: " + Thread.currentThread().getName());
        System.out.println("当前线程名称: " + Thread.currentThread().getName() + "企图调用A实例的last方法");
        a.last();
    }
    public synchronized void last(){
        System.out.println("进入了B类的last方法内部");
    }
}
class DeadLock implements Runnable{
    A a = new A();
    B b = new B();
    public void init(){
            Thread.currentThread().setName("主线程");
            a.foo(b);
            System.out.println("进入了主线程之后");
    }

    @Override
    public void run() {
        Thread.currentThread().setName("副线程");
    }
}
public class ThreadTestVideo122 {
}
