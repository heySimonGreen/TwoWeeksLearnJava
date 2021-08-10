package day20usualclass1.test;


import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author: chenwei
 * @date: 2021/8/11 4:02
 * @description: String 与byte[]之间的转换 编码 String ---> byte[] : 调用String的getBytes() 解码 byte[] --->
 *     String : 调用String的构造器 编码 字符串 ---> 字节 解码 字节 ---> 字符串
 */
public class StringMethodTest6 {
  public static void main(String[] args) throws UnsupportedEncodingException {
    String string = "abc123中国";
    byte[] bytes = string.getBytes();
    System.out.println(Arrays.toString(bytes));
    byte[] bytes1 = string.getBytes("gbk");
    System.out.println(Arrays.toString(bytes1));

    String string1 = new String(bytes);
    System.out.println(string1);
    //解码也必须是gbk，否则编码与解码不一样会乱码
    String string2 = new String(bytes1,"gbk");
    System.out.println(string2);
  }
}
