package day18thread;

/**
 * @author: chenwei
 * @date: 2021/7/30 18:43
 * 创建多线程的方式二：实现Runnable接口
 * 1. 创建一个实现了Runnel接口的类
 * 2. 实现类去实现Runnal中的抽象方法:run
 * 3.创建实现类的对象
 * 4. 将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
 * 5. 通过Thread类的对象调用start
 * 6. 比较创建线程的两种方式。
 *     开发中：优先选择：实现Runnable接口的方式
 *     原因： 1.实现的方式没有类的单继承的局限性 2.实现的方式更适合处理多个线程有共享数据的情况
 *     联系：public class Thread implements Runnable 相同点：两种方式都需要重写run，将线程要执行的逻辑声明在run中
 *
 * 例子：创建三个窗口卖票，总票数为100张，使用Runnable接口的方式
 * 1. 问题：卖票过程中，出现了重票、错票 -->出现了线程安全问题
 * 2. 问题出现的原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票
 * 3. 如何解决：当一个线程在操作ticket的时候，其他线程不能参与进来。直到线程a操作完ticket时，
 *            其他线程才可以开始操作ticket。这种情况即使线程a出现了阻塞，也不能被改变。
 * 4. 在Java中，我们通过同步机制，来解决线程的安全问题
 *    说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类从当
 *
 * 方法一：同步代码块
 * synchronized(同步监视器){需要被同步的代码}
 * 说明： 1. 操作共享数据的代码，即为需要被同步的代码，
 *       2. 共享数据：多个线程共同操作的变量。比如，ticket就是
 *       3. 同步监视器：俗称锁。任何一个类的的对象，都可以充当锁。要求多个线程必须要用同一把锁。
 *       补充：在实现Runnable接口创建多线程的方式中，我们可以考虑使用this充当同步监视器
 *  方法二：同步方法
 *
 *   5.同步的方法，解决了线程的安全问题。--好处
 *     操作同步代码时，只能有一个线程参与，其他线程等待。相当于是一个单线程的过程，效率低。
 *
 *
 */
public class ThreadTestTicket {
  public static void main(String[] args) {
//    Windows windows1 = new Windows("windows1");
//    Windows windows2 = new Windows("windows2");
//    Windows windows3 = new Windows("windows3");
//    windows1.start();
//    windows2.start();
//    windows3.start();

        MyThread myThread = new MyThread();
        Thread thread1 = new Thread(myThread);
        thread1.setName("线程1");
        Thread thread2 = new Thread(myThread);
        thread2.setName("线程2");
        Thread thread3 = new Thread(myThread);
        thread3.setName("线程3");
        thread1.start();
        thread2.start();
        thread3.start();
  }
}

class Windows extends Thread {
  private static int ticket = 100;
  private static Object object = new Object();

  public Windows(String name) {
    super(name);
  }

  @Override
  public void run() {
    while (true) {
      synchronized (object) {
        if (ticket > 0) {
          try {
            Thread.sleep(10);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
          System.out.println(getName() + " 还有票,票号为：" + ticket);
          ticket--;
        }else {
          break;
        }
      }
    }
  }
}

class MyThread implements Runnable {
  private int ticket = 100;

  @Override
  public void run() {
    while (true) {
      synchronized (this){
        if (ticket>0){
          System.out.println("还有票 " + Thread.currentThread().getName() + " 剩余 ： " + ticket);
          ticket--;
        }else {
          break;
        }
      }
    }
  }
}
