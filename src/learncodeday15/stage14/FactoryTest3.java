package learncodeday15.stage14;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * @author: chenwei
 * @date: 2021/7/18 0:53
 */
public class FactoryTest3 {
    public static void main(String[] args){
        Car a = new AudiFactory().getCar();
        Car b = new BydFactory().getCar();
        a.run();
        b.run();
    }
}
interface Car3{
    /**
     * 跑 */
    void run();
}
class Audi3 implements Car3{
    @Override
    public void run() {
        System.out.println("audi running");
    }
}
class Byd3 implements Car3{
    @Override
    public void run() {
        System.out.println("byd running");
    }
}
interface Factory{
  /**
   * 工厂接口
   * @return 获取车
   *
   * */
  Car getCar();
}
//两个工厂类

class AudiFactory implements Factory{
    @Override
    public Audi getCar() {
        return new Audi();
    }
}
class BydFactory implements Factory{

    @Override
    public Byd getCar() {
        return new Byd();
    }
}