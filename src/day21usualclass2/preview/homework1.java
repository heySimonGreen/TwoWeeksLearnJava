package day21usualclass2.preview;

/**
 * @author: chenwei
 * @date: 2021/8/15 0:13
 * @description: 描述 最大字串，这个是只返回第一次出现的最大字串，拓展开，当最大字串不止一个的时候可以找到所有的最大字串
 */
public class homework1 {
  public static void main(String[] args) {
    String str = "abfghkcdefghijk";
    String str2 = "fgkh";
    System.out.println(findMaxSameString(str,str2));
  }
  public static String findMaxSameString(String str1,String str2){
      String maxString = str1.length()>=str2.length()?str1:str2;
      String minString = str1.length()<str2.length()?str1:str2;
      int minLength = minString.length();
      for (int i=0;i<minLength;i++){
          for (int x=0,y=minLength-i;y<=minLength;x++,y++){
              if (maxString.contains(minString.substring(x,y))){
                  return minString.substring(x,y);
              }
          }
      }
      return null;
  }
}
