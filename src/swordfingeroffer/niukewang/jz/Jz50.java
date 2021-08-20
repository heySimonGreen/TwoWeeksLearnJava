package swordfingeroffer.niukewang.jz;

import java.util.Arrays;
import java.util.Random;

/**
 * @author: chenwei
 * @date: 2021/8/11 2:21
 * @description: 描述
 */
public class Jz50 {
  public static void main(String[] args) {
      int n = 100;
      int[] arrs = new int[n];
      Random random = new Random();
      for (int i=0;i<n;i++){
          arrs[i] = random.nextInt(100);
      }
    System.out.println(Arrays.toString(arrs));
      Arrays.sort(arrs);
      System.out.println("**************");
      System.out.println(Arrays.toString(arrs));
//      System.out.println(duplicate(arrs));
//      System.out.println(duplicate2(arrs));
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
  public static int duplicate2(int[] number){
      for (int i =0;i<number.length;i++){
          while (number[i]!=i){
              if (number[i] == number[number[i]]){
                  return number[i];
              }
              swap(number,i);
          }
          swap(number,i);
      }
      return -1;
  }
  public static void swap(int[] number,int i){
      int temp = number[number[i]];
      number[number[i]] = number[i];
      number[i]=temp;
  }
}
