package day18thread;

/**
 * @author: chenwei
 * @date: 2021/8/2 0:29
 * @description: 线程通信的例子，使用两个线程答应1-100，线程一线程二交替打印
 * 涉及到的三个方法：
 * wait()一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器。
 * notify():一旦执行此方法，就会唤醒被wait的一个线程。如果有多个线程被wait()，就唤醒优先级高的
 * notifyAll():一旦执行此方法，就唤醒所有被wait的线程
 *
 * 说明：
 * 1. wait notify notifyAll三个方法必须使用在同步代码块或同步方法中。
 * 2. wait notify notifyAll三个方法的调用者必须是同步代码块或同步方法中的同步监视器，否则，会出现IllegalMonitorStateException异常
 * 3. wait notify notifyAll三个方法是定义在java.lang.Object中的
 */
public class ThreadCommunicationTest {
  public static void main(String[] args) {
      Count count = new Count();
      Thread thread1 = new Thread(count);
      thread1.setName("线程1");
      Thread thread2 = new Thread(count);
      thread2.setName("线程2");
      thread1.start();
      thread2.start();
  }
}
class Count implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while (true){
            synchronized (this){
                notify();

                if (number<=100){
                    System.out.println("number is : " + number + Thread.currentThread().getName());
                    number++;
                }else {
                    break;
                }
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
