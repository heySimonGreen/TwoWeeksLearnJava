package day29reflectionusing;

/**
 * @author: chenwei
 * @date: 2021/9/17 16:03
 * @description: 静态代理举例，一个接口，一个代理类和被代理类实现这个结构。
 * 特点：代理类和被代理类在编译期间，就确定下来了
 */
public class StaticProxyTest {
  public static void main(String[] args) {
      NikeFactory nikeFactory = new NikeFactory();
      ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nikeFactory);
      proxyClothFactory.produceCloth();
  }
}
interface ClothFactory{
    /**
     * 生产衣服
     * */
    void produceCloth();
}
//代理类
class ProxyClothFactory implements ClothFactory{
    private ClothFactory clothFactory;

    public ProxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂做一些准备工作");
        clothFactory.produceCloth();
        System.out.println("代理工厂做一些收尾工作");
    }
}
//被代理类
class NikeFactory implements ClothFactory{

    @Override
    public void produceCloth() {
        System.out.println("nike工厂生产一批运动鞋");
    }
}

