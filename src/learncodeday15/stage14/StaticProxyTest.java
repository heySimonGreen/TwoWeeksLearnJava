package learncodeday15.stage14;

/**
 * @author: chenwei
 * @date: 2021/7/17 22:46
 * 代理模式
 * 先定义一个明星类，再有真是明星（就是被代理类）和代理类，他们去实现Star，
 * 代理类帮明星完成其他操作，当要唱歌时由明星自己完成，
 * 看似都由代理类完成了所有操作，但唱歌的操作是在代理里面传递了一个明星过去完成的。
 */
public class StaticProxyTest {
    public static void main(String[] args){
        Star star = new Proxy(new RealStar());
        star.confer();
        star.signContract();
        star.bookTicked();
        star.sing();
        star.collectMoney();
    }
}

interface Star{
  /**
   * 面谈
   * */
  void confer();
  /**
   * 签合同
   * */
  void signContract();
  /**订票 */
  void bookTicked();

  /**唱歌 */
  void sing();

  /** 收钱*/
  void collectMoney();
}
//被代理类

class RealStar implements Star{
    @Override
    public void confer() {

    }

    @Override
    public void signContract() {

    }

    @Override
    public void bookTicked() {

    }

    @Override
    public void sing() {
        System.out.println("明星唱歌~~~~~");

    }

    @Override
    public void collectMoney() {

    }
}
//代理类

class Proxy implements Star{
    private RealStar realStar;
    public Proxy(RealStar realStar){
        this.realStar = realStar;
    }

    @Override
    public void confer() {
        System.out.println("经纪人面谈");
    }

    @Override
    public void signContract() {
        System.out.println("经纪人面谈");
    }

    @Override
    public void bookTicked() {
        System.out.println("经纪人订票");
    }

    @Override
    public void sing() {
        realStar.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("经纪人收钱");
    }
}
