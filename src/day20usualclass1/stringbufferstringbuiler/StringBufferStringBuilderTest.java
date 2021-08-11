package day20usualclass1.stringbufferstringbuiler;

/**
 * @author: chenwei
 * @date: 2021/8/12 0:54
 * @description: String、StringBuffer、StringBuilder三者之间的异同
 * String ： 不可变的字符序列；底层使用char[]存储
 * StringBuffer : 可变的字符序列；线程安全的，效率低；底层使用char[]存储
 * StringBuilder : 可变的字符序列；JDK5.0新增的，线程不安全的，效率高；底层使用char[]存储
 *
 * 源码分析：
 * String str = new String();//char[] value = new char[0];
 * String str = new String("abc");//char[] value = new char[]{'a','b','c'};
 *
 * StringBuffer sb = new StringBuffer();//char[] value = new char[16];底层创建了一个长度是16的字符数组
 * sb.append('a');//value[0]='a';
 * sb.append('b');//value[1]='b';
 *StringBuffer sb = new StringBuffer("abc");//char[] value = new char["abc".length() + 16];底层创建了一个长度是16 + "abc".length()的字符数组
 *
 * 问题1. System.out.println(sb.length());是多少？这里的length里面是用count实现，实际表示的是里面有多少个字符，所以不用管16，里面是多少个字符就是多少
 * 问题2. 扩容问题； 如果要添加的数据底层数组放不下了，那就需要扩容底层数组
 *      默认情况下：扩容为原来容量的2倍+2，同时将原有数组中的元素复制到新的数组中。
 *      如果直到开发中需要多次追加，则可以考虑下面的，固定一定容量，就免去复制数组，节省空间和时间
 *      指导意义 : 开发中建议大家使用：StringBuffer(int capacity) 或 StringBuilder(int capacity)
 */
public class StringBufferStringBuilderTest {
  public static void main(String[] args) {
    StringBuffer stringBuffer = new StringBuffer("abc");
    stringBuffer.setCharAt(0,'p');
    System.out.println(stringBuffer);
    System.out.println(stringBuffer.length());

    StringBuilder stringBuilder = new StringBuilder("def");
  }
}
