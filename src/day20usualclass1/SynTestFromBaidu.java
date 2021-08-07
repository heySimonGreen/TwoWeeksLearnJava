package day20usualclass1;

/**
 * @author: chenwei
 * @date: 2021/8/8 1:12
 * @description: 描述
 */
public class SynTestFromBaidu {
  public static void main(String[] args) {
    Share share = new Share();
    Caller caller1 = new Caller("A", share);
    Caller caller2 = new Caller("B", share);
    Caller caller3 = new Caller("C", share);
  }
}

class Share {
  void print(String str) {
    System.out.print("[" + str);
    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
    }
    System.out.println("]");
  }
}

class Caller implements Runnable {
  String str;
  Share share;
  Thread thread;

  public Caller(String str, Share share) {
    this.share = share;
    this.str = str;
    thread = new Thread(this);
    thread.start();
  }

  @Override
  public void run() {
    share.print(str);
  }
}
//    sleep() 既然不会释放对象锁，为什么在线程执行sleep()之后，别的线程可以占用share资源呢？
//
//        本线程内不会释放，但是把Share类和Caller类改成
// class share
// {
//    void print(String str)
//    {
//        System.out.print("["+str);
//    }
// }
//
// class Caller extends Thread {
//    String str;
//    share share;
//    Thread thread;
//    public Caller(String str,share share)
//    {
//        this.share = share;
//        this.str = str;
//        thread = new Thread(this);
//        thread.start();
//    }
//    public void run()
//    {
//        share.print(str);
//        try {
//            this.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("]");
//    }
// }
