package learncodeday15.stage20;

/**
 * @author: chenwei
 * @date: 2021/7/19 22:40
 * 多个接口类相同的方法、父类里的方法也和接口类的方法相同情况下。
 * 如果没有继承父类，只是实现了Filial,Spoony，那么必须重写help方法
 * 如果继承了父类，那么不用重写了，默认调用继承的父类方法，
 */
public class Java8InterfaceTest extends Father implements Filial,Spoony {
    @Override
    public void help() {
        System.out.println("我该救谁呢？");
        Filial.super.help();
        Spoony.super.help();
    }
}
interface Filial{
  /**
   * 孝顺的
   * 就母亲*/
  default void help() {
        System.out.println("老妈，我来就你了");
    }
}
interface Spoony{
  /**
   * 痴情的
   * 救媳妇*/
  default void help() {
        System.out.println("媳妇，我来就你了");
    }
}
class Father{
    public void help(){
        System.out.println("儿子，救我媳妇");
    }
}
