package day18thread;

/**
 * @author: chenwei
 * @date: 2021/7/31 1:43
 */
public class ThreadTestTicket2 {
  public static void main(String[] args) {
    WindowsTicket windowsTicket = new WindowsTicket();
    Thread thread1 = new Thread(windowsTicket);
    Thread thread2 = new Thread(windowsTicket);
    Thread thread3 = new Thread(windowsTicket);
    thread1.setName("窗口1 ");
    thread2.setName("窗口2 ");
    thread3.setName("窗口3 ");
    thread1.start();
    thread2.start();
    thread3.start();
  }
}

class WindowsTicket implements Runnable {
  private int ticket = 1000;
  Object object = new Object();

  @Override
  public void run() {
    while (true) {
      synchronized (object) {
        if (ticket > 0) {
          System.out.println(Thread.currentThread().getName() + " 剩余： " + ticket);
          ticket--;
        }else {
            break;
        }
      }
    }
  }
}
