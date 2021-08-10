package day20usualclass1.test;

/**
 * @author: chenwei
 * @date: 2021/8/9 2:02
 * @description: 结论：
 * 1. 常量和常量的拼接结果在常量池。且常量池中不会存在相同内容的常量
 * 2. 只要其中一个有变量，结果就在堆空间中，和new一样
 * String调用intern方法时，强制要求返回的值一定要是在常量池中去声明
 *
 * 被final修饰的String相当于是常量了，所以和字面量形式的字符串拼接仍然是在常量池中的
 */
public class StringTest3 {
  public static void main(String[] args) {
    String s1 = "javaee";
    String s2 = "hadoop";
    String s3 = "javaeehadoop";
    String s4 = "javaee" + "hadoop";
    String s5 = s1 + "hadoop";
    String s6 = "javaee"+ s2;
    String s7 = s1 + s2;
    String s8 = (s1 + s2).intern();//放回值得到的s8使用的是常量池中已经存在的"javahadoop"
    System.out.println(s3 == s4);
    System.out.println(s3 == s5);
    System.out.println(s3 == s6);
    System.out.println(s3 == s7);
    System.out.println(s5 == s6);
    System.out.println(s5 == s7);
    System.out.println(s6 == s7);
    System.out.println(s3 == s8);

    //这里被final修饰的String相当于是常量了，所以和字面量形式的字符串拼接仍然是在常量池中的
    final String str = "chen";
    String str2 = str + "wei";
    String chenwei = "chenwei";
    System.out.println(chenwei == str2);
  }
}
