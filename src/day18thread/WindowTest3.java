package day18thread;

/**
 * @author: chenwei
 * @date: 2021/7/31 17:08
 * @description : 使用同步方法解决实现Runnable接口的线程安全问题
 * 关于同步方法的总结：
 * 1. 同步方法仍然涉及到同步监视器，只是不需要我们显式的声明。
 * 2. 非静态的同步方法，同步监视器是:this
 *     静态的同步方法，同步监视器是：当前类本身
 */
public class WindowTest3 {
  public static void main(String[] args) {
      //实现Runnable接口的线程安全问题
//      ThreadTest3 threadTest3 = new ThreadTest3();
//      Thread thread1 = new Thread(threadTest3);
//      Thread thread2 = new Thread(threadTest3);
//      Thread thread3 = new Thread(threadTest3);
//      thread1.start();
//      thread2.start();
//      thread3.start();

      ThreadTest4 threadTest41 = new ThreadTest4();
      threadTest41.start();
      ThreadTest4 threadTest42 = new ThreadTest4();
      threadTest42.start();
      ThreadTest4 threadTest43 = new ThreadTest4();
      threadTest43.start();


  }
}
class ThreadTest3 implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (true){
            method();
        }
    }
    private synchronized void method(){
        if (ticket>0){
            System.out.println("还有票： " + ticket + " " +Thread.currentThread().getName());
            ticket--;
        }
    }
}
class ThreadTest4 extends Thread{
    private static int ticket = 100;
    @Override
    public void run() {
        while (true){
            method();
        }
    }
    private static synchronized void method(){
//    private synchronized void method(){ 此种是错误的s
        if (ticket>0){
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("还有票： " + ticket + " " +Thread.currentThread().getName());
            ticket--;
        }
    }
}
