package day18thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: chenwei
 * @date: 2021/8/1 0:37
 * @description: 解决线程安全的方式三：Lock锁 ---jdk 5.0新增
 * 1. 面试题：synchronized和lock的异同
 * 相同：两者都可以解决线程安全问题
 * 不同：synchronized机制在执行完相应的同步代码以后，自动释放同步监视器
 *       lock需要手动的启动同步(lock())，同时结束同步也需要手动实现(unlock())
 * 2. 优先使用顺序：lock->同步代码块（已经进入了方法体，分配了相应资源）->同步方法（在方法体之外）
 *
 * 面试题：如何解决线程安全问题？有几种方式？
 */
public class ThreadTestVideo13 {
  public static void main(String[] args) {
      WindowsTickets windowsTickets = new WindowsTickets();
      Thread thread1 = new Thread(windowsTickets);
      Thread thread2 = new Thread(windowsTickets);
      Thread thread3 = new Thread(windowsTickets);
      thread1.start();
      thread2.start();
      thread3.start();
  }
}
class WindowsTickets implements Runnable{
    private int ticket =100;
    ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
            try {
                //上锁
                reentrantLock.lock();
                if (ticket>0){
                    System.out.println("剩余票数为： " + ticket + Thread.currentThread().getName());
                    ticket--;
                }else {
                    break;
                }
            } finally {
                //2.调用解锁方法解锁
                reentrantLock.unlock();

            }
        }
    }
}
