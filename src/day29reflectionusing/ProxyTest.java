package day29reflectionusing;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: chenwei
 * @date: 2021/9/17 16:19
 * @description: 描述
 */
public class ProxyTest {
  public static void main(String[] args) {
      SuperMan superMan = new SuperMan();
      //proxyInstance:代理类的对象
      Human proxyInstance = (Human) ProxyFactory.getProxyInstance(superMan);
      //当通过代理类对象调用方法时，会自动的调用被代理类中的同名方法
      String belief = proxyInstance.getBelief();
      System.out.println(belief);
      proxyInstance.eat("火锅");
      //用另外一个例子说明动态性
      NikeFactory nikeFactory = new NikeFactory();
      ClothFactory clothFactory = (ClothFactory) ProxyFactory.getProxyInstance(nikeFactory);
      clothFactory.produceCloth();
  }
}
interface Human{
    /**
     * 信仰
     * @return  返回信仰
     */
    String getBelief();

    /**
     * 吃东西
     * @param food:食物
     */
    void eat(String food);
}
class HumanUtil{
    public void method1(){
        System.out.println("调用HumanUtil方法一");
    }
    public void method2(){
        System.out.println("调用HumanUtil方法一");
    }
}
//被代理类
class SuperMan implements Human{

    @Override
    public String getBelief() {
        return "i belied i can fly";
    }

    @Override
    public void eat(String food) {
        System.out.println("i like eat "+food);
    }
}
/**
 要想实现动态代理，需要解决的问题？
 问题一：如何根据加载到内存中的被代理类，动态的创建一个代理类及其对象。
 问题二：当通过代理类的对象调用方法a时，如何动态的去调用被代理类中的同名方法a
 */
class ProxyFactory{
    /**
     * 调用此方法：返回一个代理类的对象，解决问题一
     * @param obj 被代理类的对象
     * */
    public static Object getProxyInstance(Object obj){
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        myInvocationHandler.bind(obj);
        Object o = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), myInvocationHandler);
        return o;
    }
}
class MyInvocationHandler implements InvocationHandler{
    //需要使用被代理类的对象进行赋值
    private Object object;
    public void bind(Object object){
        this.object = object;
    }

    /**
     当我们通过代理类的对象，调用方法a时，就会调用如下的方法：invoke()
     将被代理类要执行的方法a的功能就声明在invoke()中
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //method()：即为代理类对象调用的方法，此方法也就作为了被代理类对象要调用的方法，obj本身就是被代理类的对象
        HumanUtil humanUtil = new HumanUtil();
        humanUtil.method1();
        Object retrunValue = method.invoke(object,args);
        humanUtil.method1();
        //上述方法的返回值就作为当前类中的invoke()的返回值
        return retrunValue;
    }
}