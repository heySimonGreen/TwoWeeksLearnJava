package day20usualclass1.test;

import org.junit.Test;

/**
 * Created by 21954 on 2021/8/10 16:22 description :String常用方法2 *
 * 13. boolean endswith(String suffix) :测试此字符串是否以指定的后缀字符串结束
 * 14. boolean startswith(String prefix) :测试此字符串是否以指定的前缀字符串结束
 * 15. boolean startswith(String prefix,String suffix) :测试此字符串从从指定索引开始的子字符串是否以指定前缀开头
 * 16. boolean contains(CharSequence s):当且仅当此字符串包含指定的char值序列时，返回true
 * 17. int indexOf(String str):返回指定子字符串在此字符串中第一次出现处的索引
 * 18、int indexOf(String str,int fromIndex):返回指定子字符串在此字符串中第一次出现处的索引，从指定索引开始
 * 19. int lastIndexOf(String str):返回指定子字符串在此字符串中最右边出现处的索引
 * 20. int lastIndexOf(String str,int fromIndex) 返回指定子字符串在此字符串中最后一次出现处的索引，从指定的索引开始
 * 注：indexOf和lastIndexOf方法如果未找到都是返回-1
 * @author 21954
 */
public class StringMethod2Test {
  public static void main(String[] args) {
      String str1 = "helloworld";
      boolean b1 = str1.endsWith("rld");
      System.out.println(b1);
      boolean he = str1.startsWith("He");
      System.out.println(he);
      boolean ll = str1.startsWith("ll", 2);
      System.out.println(ll);
      String str2 = "wor";
      System.out.println(str1.contains(str2));
      System.out.println(str1.indexOf("lo"));
      //此方法可以用来找某个字符串出现了几次
      System.out.println(str1.indexOf("lo", 5));
      String str3 = "hellorworld";
      System.out.println(str3.lastIndexOf("or"));
      System.out.println(str3.lastIndexOf("or",6));
      //什么情况下，indexOf(str)和lastIndexOf(str)返回值相同？
      //情况一：存在唯一一个str。情况二：不存在str都返回-1
  }
}
