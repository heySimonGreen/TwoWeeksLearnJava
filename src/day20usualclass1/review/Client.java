package day20usualclass1.review;

/**
 * @author: chenwei
 * @date: 2021/8/8 2:05
 * @description: 描述
 */
public class Client {

  public static void main(String[] args) {
    Aaa a = new Aaa();
  }
}

class Aaa {
  {
    new Bbb();
  }

  public Aaa() {
    System.out.println("A init..." + Thread.currentThread().getName());
  }
}

class Bbb {
  {
    new Aaa();
  }

  public Bbb() {
    System.out.println("B init..." + Thread.currentThread().getName());
  }
}
