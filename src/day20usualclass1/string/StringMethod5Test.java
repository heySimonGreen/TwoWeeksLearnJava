package day20usualclass1.string;

import java.util.Scanner;

/**
 * @author: chenwei
 * @date: 2021/8/11 1:30
 * @description: String与char[]之间的转换
 * String ---> char[] : 调用String的toCharArray()
 * char[] ---> String : 调用String的构造器
 * 练习题：将String str = "1234abcd";给定一个字符，除去第一个和最后一个字符外里面的内容反转输出，输出结果为1cba432d
 */
public class StringMethod5Test {
  public static void main(String[] args) {
    String str = "1234abcd";
    char[] chars = str.toCharArray();

    for (int i=0;i<chars.length;i++){
      System.out.println(chars[i]);
    }
    String str2 = new String(chars);
    System.out.println(str2);

      //练习题：将String strNew = "1234abcd";给定一个字符，除去第一个和最后一个字符外里面的内容反转输出，输出结果为1cba432d
      Scanner scanner = new Scanner(System.in);
      String strNew = scanner.nextLine();
      char[] charsNew = strNew.toCharArray();
      char first = charsNew[0];
      char last = charsNew[charsNew.length-1];
      Character[] character = new Character[charsNew.length-2];
//      for (int i=charsNew.length-2;i>0;i--){
      for (int i=1;i<charsNew.length-1;i++){
          character[charsNew.length-2-i] = charsNew[i];
      }
      System.out.print(first);
      for (int i=0;i<character.length;i++){
        System.out.print(character[i]);
      }
      System.out.println(last);
  }
}
