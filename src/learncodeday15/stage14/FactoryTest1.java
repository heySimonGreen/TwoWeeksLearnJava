package learncodeday15.stage14;

/**
 * @author: chenwei
 * @date: 2021/7/17 23:39
 * 无工厂模式
 */
public class FactoryTest1 {
    public static void main(String[] args){
        Car a = new Audi();
        Car b = new Byd();
        a.run();
        b.run();
    }
}
interface Car{
  /**
   * 跑 */
  void run();
}
class Audi implements Car{
    @Override
    public void run() {
        System.out.println("audi running");
    }
}
class Byd implements Car{
    @Override
    public void run() {
        System.out.println("byd running");
    }
}
