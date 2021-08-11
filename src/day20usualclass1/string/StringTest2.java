package day20usualclass1.string;

/**
 * @author: chenwei
 * @date: 2021/8/9 1:19
 * @description: String的实例化方式
 * 1. 通过字面量的方式
 * 2. 通过new + 构造器的方式
 * 面试题：String s4 = new String("JavaEE");方式创建对象，在内存中创建了几个对象？
 * 答：两个，一个是堆空间new的结构，一个是char[]对应的常量池中的数据："JavaEE"
 */
public class StringTest2 {
  public static void main(String[] args) {
    //通过字面量定义的方式：此时s1s和2的数据JavaEE声明在方法区中的字符串常量池中。
    String s1 = "JavaEE";
    String s2 = "JavaEE";
    //通过new + 构造器的方式:此时s3和s4的保存的地值，是数据在堆空间中开辟空间以后对应的地址值
    String s3 = new String("JavaEE");
    String s4 = new String("JavaEE");
    System.out.println(s1 ==s2);
    System.out.println(s1 ==s3);
    System.out.println(s1 ==s4);
    System.out.println(s3 ==s4);
    //需要能画内存图
    Person person1 = new Person("chenwei",24);
    Person person2 = new Person("chenwei",24);
    System.out.println(person1.name.equals(person2.name));//重写写过equals比较的是值是否相等
    System.out.println(person1.name==person2.name);
    person1.name = "hei";
    System.out.println(person1.name==person2.name);
  }
}
class Person{
  public String name;
  public int age;
  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }
}
