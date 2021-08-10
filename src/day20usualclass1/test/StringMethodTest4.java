package day20usualclass1.test;

/**
 * @author: chenwei
 * @date: 2021/8/10 21:21
 * @description: String与基本数据类型、包装类之间的转换。
 * String->基本数据类型、包装类：调用包装类的静态方法：parseXXX(str)
 * 基本数据类型、包装类 ->String：调用String重载的valueOf(xxx)
 */
public class StringMethodTest4 {
  public static void main(String[] args) {
    String str1 = "123";
    int i = Integer.parseInt(str1);
    String str2 = String.valueOf(i);
    String str3 = i + "";
    //只要有变量参与了都是在堆里
    System.out.println(str3 == str1);
  }
}
