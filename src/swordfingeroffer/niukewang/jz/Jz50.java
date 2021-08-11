package swordfingeroffer.niukewang.jz;

/**
 * @author: chenwei
 * @date: 2021/8/11 2:21
 * @description: 描述
 */
public class Jz50 {
  public static void main(String[] args) {
      int[] arrs = {1,3,5,2,5,2,5};
      System.out.println(duplicate(arrs));
    //
  }
  public static int duplicate (int[] numbers) {
      int[] arr = new int[numbers.length];
      for (int i=0;i<numbers.length;i++){
          if (arr[numbers[i]] ==1){
              return numbers[i];
          }
          arr[numbers[i]] = 1;
      }
      return -1;
  }
}
