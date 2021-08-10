package day20usualclass1.test;

import org.junit.Test;

import java.util.Locale;

/**
 * @author: chenwei
 * @date: 2021/8/9 14:08
 * @description: String常用方法1
 * 1. int length() 返回字符串的长度 return value.length()
 * 2. char charAt(int index) 返回某索引处的字符 return value[index]
 * 3. boolean isEmpty() 判断是否是空字符串：return value.length()
 * 4. String toLowerCase() 使用默认语言环境，将String中的所有字符转换为小写
 * 5. String toUpperCase() 使用默认语言环境，将String中的所有字符转换为大写
 * 6. String trim() 返回字符串的副本，忽略前导空白和尾部空白
 * 7. boolean equals(Object obj) 比较字符串的内容是否相同
 * 8. boolean equalsIgnoreCase(String anotherString) 与equals方法类似，忽略大小写
 * 9. String concat(String str) 将指定字符串连接到此字符串结尾。等价于"+"
 * 10. int compareTo(String anotherString) 比较两个字符串的大小
 * 11. String substring(int beginIndex) 返回一个新的字符串，它是此字符串的从beginIndex开始截取到最后的一个子字符串
 * 12. String substring(int beginIndex,int endIndex) 返回一个新字符串，它是此字符串从beginindex开始截取到endindex(不包含)的一个子字符串
 */
public class StringMethodTest {

    @Test
    public void test2(){
        String s1 = "HelloWorld";
        String s2 = "helloworld";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.concat(s2));
        String s3 = "abc";
        String s4 = new String("def");
        System.out.println(s3.compareTo(s4));//涉及到字符串排序

        String s5 = "我家在重庆市黔江区";
        String s6 = s5.substring(3);
        System.out.println(s5);
        System.out.println(s6);
        String s7 = s5.substring(6,8);
        System.out.println(s7);
    }

    @Test
    public void test1(){
        String s1 = "Helloworld";
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
        //System.out.println(s1.charAt(10));
        //s1= "";
        System.out.println(s1.isEmpty());
        String s2 = s1.toLowerCase();
        System.out.println(s2);
        s2 = s1.toUpperCase();
        System.out.println(s2);
        String s3 = "  hel  lo wor   ld   ";
        String s4 = s3.trim();
        System.out.println(s4);
    }
}
