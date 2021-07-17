package learncodeday15.stage14;

/**
 * @author: chenwei
 * @date: 2021/7/17 0:49
 */
public class InterfaceTest {
}
interface Flyable{
  // 全局常量
  /**
   * 最大速度
   * */
  public static final int MAX_SPEED = 7900;
  //省略了public static final

  int MIN_SPEED = 1;
    /**
     * 抽象方法
     * */
  public abstract void fly();

  /**
   * 停，省略了public abstract
   * */
  void stop();

  //public Flyable(){}Interface abstract methods cannot have body
}

class Plane implements Flyable{

    @Override
    public void fly() {
        System.out.println("plane fly");
    }

    @Override
    public void stop() {
        System.out.println("plane stop");
    }
}
class Bullet implements Flyable, Attackable{

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}
interface Attackable{
  /**
   * 攻击
   * */
  void attack();
}
