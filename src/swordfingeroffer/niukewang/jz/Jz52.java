package swordfingeroffer.niukewang.jz;

/**
 * @author: chenwei
 * @date: 2021/8/11 14:12
 * @description: 描述
 */
public class Jz52 {
  public static void main(String[] args) {
    String str = "aaa";
    String pattern = "ab*ac*a";
      System.out.println(match(str,pattern));
  }

    public static boolean match (String str, String pattern){
        if (str.matches(pattern)) {
            return true;
        }else {
            return false;
        }
    }
}
