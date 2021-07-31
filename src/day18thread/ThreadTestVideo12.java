package day18thread;

/**
 * @author: chenwei
 * @date: 2021/7/31 21:56
 * @description: 演示线程死锁问题
 * 1. 死锁的理解：不同的线程分别占用对方所需要的同步资源不放弃，都在等待对方放弃自己需要的同步资源，就形成了线程死锁
 * 2. 说明：
 *      1.出现死锁后，不会出现异常，不会出现提示，只是所有的线程都处于阻塞状态，无法继续。
 *      2.我们使用同步时，要避免出现死锁。
 */
public class ThreadTestVideo12 {
  public static void main(String[] args) {
    StringBuffer stringBuffer1 = new StringBuffer();
    StringBuffer stringBuffer2 = new StringBuffer();
    new Thread() {
      @Override
      public void run() {
        synchronized (stringBuffer1) {
          stringBuffer1.append("a");
          stringBuffer2.append("1");
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          synchronized (stringBuffer2) {
            stringBuffer1.append("b");
            stringBuffer2.append("2");
            System.out.println(stringBuffer1);
            System.out.println(stringBuffer2);
          }
        }
      }
    }.start();
    new Thread() {
      @Override
      public void run() {
        synchronized (stringBuffer2) {
          stringBuffer1.append("c");
          stringBuffer2.append("3");
          try {
            Thread.sleep(100);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          synchronized (stringBuffer1) {
            stringBuffer1.append("d");
            stringBuffer2.append("4");
            System.out.println(stringBuffer1);
            System.out.println(stringBuffer2);
          }
        }
      }
    }.start();
  }
}
