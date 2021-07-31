package day18thread;

import org.junit.Test;

/**
 * @author: chenwei
 * @date: 2021/7/30 0:32
 * @description:多线程的创建方式：方式一：继承于Thread类
 * 1.创建一个继承于Thread类的子类
 * 2.重写Thread类的run() --> 将此线执行的操作声明在run中
 * 3.创建Thread类的子类对象
 * 4.通过此对象调用start()
 * 例子，编译100以内的所有偶数
 */
public class ThreadTest extends Thread{//1.继承Thread类
    //2重写run方法
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            if (i%2==0){
                System.out.println(i + Thread.currentThread().getName());
            }
        }
    }
    public static void main(String[] args){
        //3.创建Thread类的子类对象
        ThreadTest threadTest = new ThreadTest();
        //4.通过此对象调用start，启用当前线程，调用当前线程的run
        threadTest.start();
        //问题一：我们不能通过run()的方式来启动线程
        //threadTest.run();
        //问题二：再启动一个线程，遍历100以内的偶数。不可以让已经start()的线程去执行。会报IllegalThread
        //threadTest.start();

        //如下操作仍然是在main线程中执行
        for (int i=0;i<=100;i++){
            if (i%2==0){
                System.out.println(i+"ooooooooooooooooo" +Thread.currentThread().getName());
            }
        }
    }
}
