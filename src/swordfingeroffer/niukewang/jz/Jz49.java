package swordfingeroffer.niukewang.jz;

/**
 * @author: chenwei
 * @date: 2021/8/11 3:00
 * @description: 描述
 */
public class Jz49 {
  public static void main(String[] args) {
      String s = "1a33";
      System.out.println(StrToInt(s));
    //
  }

  public static int StrToInt(String str) {
      if (str.length()==0){
          return 0;
      }
      int flag = 1;
      if(str.charAt(0) == '-' || str.charAt(0) == '+'){
          if (str.charAt(0) == '-'){
              flag = -1;
          }
          str = str.substring(1);
      }
      if (str.length()==0){
          return 0;
      }
      if (str.charAt(0) == '0'){
          return 0;
      }

      for (int i=0;i<str.length();i++){
          if (str.charAt(i) >= '0'&&str.charAt(i) <= '9'){
          }else {
              return 0;
          }
      }

      int n =0;
      char[] chars = str.toCharArray();
      for (int i=0;i<chars.length;i++){
          int charNumber = (int)(chars[chars.length - 1 - i]-'0');
          n = n + (int)(charNumber * Math.pow(10.0, Double.parseDouble(String.valueOf(i))));
      }
    return n*flag;
  }
}
