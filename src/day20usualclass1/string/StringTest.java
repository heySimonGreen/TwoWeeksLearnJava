package day20usualclass1.test;

/**
 * @author: chenwei
 * @date: 2021/8/9 0:44
 * @description: String字符串，使用一对""引起来表示。
 * 1. String类声明为final的，不可被继承，就是说该有的方法都写好了，不需要你去拓展
 * 2. String实现了Serializable接口，表示字符串是可以被序列化的。
 *    String实现了Comparable接口，表示String可以比较大小。
 * 3. String内部定义了final char[] value 用于存放字符串数据
 * 4. String 代表不可变的字符序列。简称不可变性。
 *      体现：1. 当对字符串重新赋值时，需要重写内存区域赋值，不能使用原有的value进行赋值。
 *           2. 当对现有的字符串进行链接操作时，也需要重写指定内存区域赋值，不能使用原有的value进行赋值。
 *           3. 当调用String的replace方法修改指定的字符或者字符串时，也需要重写指定内存区域赋值，不能使用原有的value进行赋值。
 * 5. 通过子面量的方式(区别于new)给一个字符串赋值，此时的字符串值声明在方法区的字符串常量池中
 * 6. 字符串常量池中是不会存储相同内容的字符串的
 */
public class StringTest {
  public static void main(String[] args) {
    String s1 = "abc";
    String s2 = "abc";
    System.out.println("s1 == s2 ?" + (s1 == s2));
    s2 = "hello";
    System.out.println("s1 == s2 ?" + (s1 == s2));

    String s3 = "abc";
    s3 += "def";
    System.out.println("s3:" + (s3));
    System.out.println("s2:" + (s2));

    String s4 = "abca2365";
    String s5 = s4.replace('a','m');
    System.out.println("s4:"+(s4));
    System.out.println("s5:"+(s5));

  }
}
