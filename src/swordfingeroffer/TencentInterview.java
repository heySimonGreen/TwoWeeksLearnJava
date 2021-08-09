package swordfingeroffer;

import java.sql.Array;
import java.util.Scanner;

/**
 * @author: chenwei
 * @date: 2021/8/9 17:40
 * @description: 0,1,···,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字（删除后从下一个数字开始计数）。求出这个圆圈里剩下的最后一个数字。
 *     例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 *     示例 1：
 *     输入: n = 5, m = 3 输出: 3
 *     示例 2：
 *     输入: n = 10, m = 17 输出: 2
 */
public class TencentInterview {
  public static void main(String[] args) {
    //输入n和m
    int n=0,m=0;
    Scanner scanner = new Scanner(System.in);
    n=scanner.nextInt();
    m=scanner.nextInt();
    System.out.println(n);
    System.out.println(m);
    //初始化数组
    int arr[] = new int[n];
    for (int i=0;i<n;i++){
      arr[i] = i;
    }
    //具体的实现
    for (int i=0;i<n;i++){
      //去掉删除的元素，将后面的元素向前移一位
      int index = m<=n?m:m%n;
      System.out.println("index = "+index);
      for (int j=m;j<n;j++){
        arr[j-1] = arr[j];
      }
      n--;
      //用arr2来将数组arr改变为从删除元素的下一个元素开始的下表为0的元素重写开始
      int arr2[] = new int[n];
      for (int j=0;j<n;j++){
        //int arr_index = (j+2)<3?j+2:(j+2)%4;
        int arr_index = (j+m-1)<n?j+m-1:(j+m-1)%n;
        arr2[j] = arr[arr_index];
      }
      for (int j=0;j<n;j++){
        arr[j]=arr2[j];
        System.out.println(arr2[j]);
      }
      if (i==n){
        System.out.print("res = ");
        System.out.println(arr[n-1]);
        break;
      }
    }

  }
}
