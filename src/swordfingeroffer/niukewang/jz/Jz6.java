package swordfingeroffer.niukewang.jz;

/**
 * @author: chenwei
 * @date: 2021/8/13 20:19
 * @description: 描述
 */
public class Jz6 {
  public static void main(String[] args) {
      int[] arr = new int[]{3,4,5,1,2};
      System.out.println(minNumberInRotateArray(arr));
  }
    public static int minNumberInRotateArray(int [] array){
      int min = 100000;
      for (int i=0;i<array.length;i++){
          if (array[i]<min){
              min = array[i];
          }
      }
      return min;
    }
}
