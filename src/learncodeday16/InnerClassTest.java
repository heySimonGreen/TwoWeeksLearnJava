package learncodeday16;

/**
 * @author: chenwei
 * @date: 2021/7/21 12:57
 */
public class InnerClassTest {
  public void method() {
    int num = 0;
    /**
     * 在局部内部类的方法中(比如show),如果调用局部内部类所声明的方法(比如，method)中的局部变量的话，
     * 要求此局部变量声明为final的
     * jdk7及之前版本：要求此局部变量显式的声明为final的
     * jdk8及之后的版本：可以省略final的声明
     * */
    class Aa {
      public void show() {
        System.out.println(num);
      }
    }
  }
}
