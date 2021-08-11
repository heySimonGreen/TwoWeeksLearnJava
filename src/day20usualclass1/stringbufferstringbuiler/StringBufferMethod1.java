package day20usualclass1.stringbufferstringbuiler;

/**
 * @author: chenwei
 * @date: 2021/8/12 1:34
 * @description: StringBuffer的常用方法
 * 1. StringBuffer append(xxx) : 提供了很多的append方法，用于字符串的拼接
 * 2. StringBuffer delete(int start, int end) : 删除指定位置的内容
 * 3. StringBuffer replace(int start, int end,String str) : 把[start,end)位置替换为str
 * 4. StringBuffer insert(int offset, xxx) : 在指定位置插入xxx
 * 5. StringBuffer reverse() : 把当前字符序列逆转
 *
 * 6. public int indexOf(String str) 找出str首次出现的位置
 * 7. public String substring(int start,int end) 返回一个从start开始到end索引结束的左闭右开区间的子字符串
 * 8. public int length()
 * 9. public char charAt()
 * 10. public void setCharAt(int n,char ch)
 * 总结：
 *      增：append
 *      删：delete
 *      改：setCharAt replace
 *      查：charAt
 *      插：insert
 *      长度：length
 *      遍历:for + charAt / toString
 */
public class StringBufferMethod1 {
  public static void main(String[] args) {
    StringBuffer stringBuffer = new StringBuffer("abc");
    stringBuffer.append(1);
    stringBuffer.append('1');
    System.out.println(stringBuffer);
    //注意是左闭右开
    stringBuffer.delete(2,4);
    System.out.println(stringBuffer);
    stringBuffer.replace(2,4,"chenwei");
    System.out.println(stringBuffer);
    stringBuffer.insert(2,false);
    System.out.println(stringBuffer);
    stringBuffer.reverse();
  }
}
