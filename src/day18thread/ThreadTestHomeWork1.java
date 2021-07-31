package day18thread;

/**
 * @author: chenwei
 * @date: 2021/7/30 15:21
 * @description: 创建遍历一百以内的偶数，和创建100以内的奇数两个线程
 */
public class ThreadTestHomeWork1 {
    public static void main(String[] args){
        //通过构造函数方式设置线程名字
        TheadTestOuShu theadTestOuShu = new TheadTestOuShu("theadTestOuShu");
        TheadTestJiShu theadTestJiShu = new TheadTestJiShu();
        theadTestJiShu.setPriority(Thread.MIN_PRIORITY);
        theadTestOuShu.setPriority(Thread.MIN_PRIORITY);

        /**
         * 测试Thread中的常用方法
         * 1. start() 启动当前线程；调用当前线程的run
         * 2. run() 通常需要重写Thread类中的run方法，将创建的线程要执行的操作声明在此方法中
         * 3. currentThread() 静态方法，返回执行当前代码的线程
         * 4. getName() 获取当前线程的名字
         * 5. setName() 设置当前线程的名字
         * 设置线程的名字有两种方式，1是通过setName()方式 2是通过创建线程时的构造方法
         * 6. yield()释放当前cpu执行权
         * 7. 在线程a种调用线程b的join()，此时线程a进入阻塞状态，知道线程b完全执行完以后，线程a才结束阻塞状态
         * 8. stop() 此方法已过时，当执行此方法，强制结束当前线程
         * 9. sleep(long milliime) 让当前线程睡眠millitime毫秒，既是阻塞millimite毫秒，在指定的millitime内，当前线程时阻塞状态
         * 10. isAlive() 判断当前线程是否存活
         *
         * 线程的优先级
         * 1.
         * MIN_PRIORITY :1
         * MAX_PRIORITY : 10
         * NORM_PRIORITY : 5  -->默认优先级
         * 2. 如何获取和设置当前线程的优先级
         * setPriority()
         * getPriority()
         * 说明:高优先级的线程要抢占低优先级线程的cpu执行权。但是只是从概率上讲，高优先级的线程高概率的情况下被执行。
         *      并不意味着只有当高优先级的线程执行完以后，低优先级的线程才执行。
         *
        * */

        theadTestJiShu.setName("线程-奇数");
        Thread.currentThread().setName("main线程");
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        theadTestJiShu.start();
        theadTestOuShu.start();
        for (int i=0;i<=100;i++){
            System.out.println(i + Thread.currentThread().getName() + " "+Thread.currentThread().getPriority());
            if (i==20){
                try {
                    theadTestOuShu.join();
                    System.out.println("到偶数了 theadTestOuShu.join();");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(theadTestOuShu.isAlive());

        //如果这个方法只使用一次，有经验的程序员都是采用创建匿名子类的方式
        //创建Thread类的匿名子类对象
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<=100;i++){
                    if (i%2 != 0){
                        System.out.println(i + Thread.currentThread().getName() +  " "+Thread.currentThread().getPriority());
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<=100;i++){
                    if (i%2 == 0){
                        System.out.println(i + Thread.currentThread().getName() +  " "+Thread.currentThread().getPriority());
                    }
                }
            }
        }.start();

    }
}
class TheadTestJiShu extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            if (i%2 != 0){
                System.out.println(i + Thread.currentThread().getName() +  " "+Thread.currentThread().getPriority());
            }
            if (i%3 == 0){
                yield();
            }
        }
    }
}
class TheadTestOuShu extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
//            if (i%2 == 0){
//                try {
//                    sleep(10);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                System.out.println(i + Thread.currentThread().getName() + Thread.currentThread().getPriority());
//            }
            System.out.println(i + Thread.currentThread().getName() +  " "+Thread.currentThread().getPriority());
        }
    }

    //通过构造函数方式设置线程名字
    public TheadTestOuShu(String name) {
        super(name);
    }
}
