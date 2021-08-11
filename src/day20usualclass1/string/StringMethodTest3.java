package day20usualclass1.string;

/**
 * Created by 21954 on 2021/8/10 17:13
 * description :String 常用方法3
 * 1. String replace(char oldChar,char newChar):返回一个新的字符串，它是通过用newChar替换此字符串中出现的所有oldChar得到的。
 * 2. String replace(CharSequence target,CharSequence replacement):使用指定的子面值替换序列替换此字符串所有匹配字面值目标序列的子字符串。
 * 3. String replaceAll(String regex,String replacement):使用给定的replacement替换此字符串所有匹配给定的正则表达式的子字符串。
 * 4. String replaceFirst(String regex,String replacement):使用给定的replacement替换此字符串所有匹配给定的正则表达式的第一个子字符串。
 *
 * 5. boolean matches(String regex):告知此字符串是否匹配给定的正则表达式。
 *
 * 6. String[] split(String regex):根据给定正则表达式的匹配拆分此字符串。
 * 7. String split(String regex,int limit):根据匹配给定的正则表达式来拆分此字符串，最多不超过limit个，如果超过了，剩下的全部都放在最后一个元素中
 */
public class StringMethodTest3 {
  public static void main(String[] args) {
  String str1 = "重庆市黔江区五里乡重庆";
  String str2 = str1.replace("庆","喜");
  System.out.println(str1);
  System.out.println(str2);
  String str3 = str1.replace("重庆","上海");
  System.out.println(str3);
  String str4 = "534hello52world25235java23542mysql26565";
  String string = str4.replaceAll("\\d+",",");
  System.out.println(string.replaceAll("^,|,$",""));
  String str5 = "13235325324534";
  boolean match = str5.matches("\\d+");
  System.out.println(match);
  String tel = "0571-4534289";
  //判断这是否是一个杭州的固定电话
  boolean result = tel.matches("0571-\\d{7,8}");
  System.out.println(result);
  System.out.println("***********");
  String str6 = "hello|world|java|mysql";
  String[] strs = str6.split("\\|");
  for (int i=0;i<strs.length;i++){
    System.out.println(strs[i]);
  }
    String str7 = "hello.world.java.mysql";
  String[] strs2 = str7.split("\\.");
  for (int i=0;i<strs2.length;i++){
    System.out.println(strs2[i]);
  }
  }
}
