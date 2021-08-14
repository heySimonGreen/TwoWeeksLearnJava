# 有问题的代码
## Arrays.binarySearch的使用问题
**调用这个方法前必须要先对数组排序**，所以这题不能使用这个方法来查找元素在数组中的位置，需要自己写一个函数
```java
package swordfingeroffer.leetcode;

import java.util.Arrays;

/**
 * @author: chenwei
 * @date: 2021/8/14 15:43
 * @description: 描述
 */
public class Leetcode1583 {
  public static void main(String[] args) {
      int n = 4;
      int[][] preferences = {{1, 2, 3}, {3, 2, 0}, {3, 1, 0}, {1, 2, 0}};
      int[][] pairs = {{0, 1}, {2, 3}};
      System.out.println(unhappyFriends(n,preferences,pairs));

  }
  public static int unhappyFriends(int n, int[][] preferences, int[][] pairs){
      int res = 0;
      for (int i=0;i<pairs.length;i++){
          for (int j=i+1;j<pairs.length;j++){
              int[] arr1 = pairs[i];
              int[] arr2 = pairs[j];
              System.out.println("arr1:" + Arrays.toString(arr1));
              System.out.println("arr2:" + Arrays.toString(arr2));
              int x=arr1[0],y=arr1[1],u=arr2[0],v=arr2[1];
              res += Res(x,y,u,v,preferences);

          }
      }
      return 0;
  }
  //Arrays.binarySearch()不起作用
  public static int Res(int x,int y,int u,int v,int[][] preferences){
      int[] arr = preferences[0];
      System.out.println(Arrays.toString(preferences[x]));
      System.out.println(Arrays.binarySearch(preferences[x],u));
      System.out.println(Arrays.binarySearch(preferences[x],y));
      System.out.println(Arrays.binarySearch(preferences[x],3));
      System.out.println("preferences[u]");
      System.out.println(Arrays.toString(preferences[u]));
      System.out.println("x: " + x);
      System.out.println(Arrays.binarySearch(preferences[u],3));
      System.out.println(Arrays.binarySearch(preferences[u],1));
      System.out.println(Arrays.binarySearch(preferences[u],0));
      System.out.println("***********");
      System.out.println(Arrays.binarySearch(preferences[u],x));
      System.out.println(Arrays.binarySearch(preferences[u],3));
      System.out.println(Arrays.binarySearch(preferences[u],v));
      System.out.println(Arrays.binarySearch(preferences[u],1));
      System.out.println(Arrays.binarySearch(preferences[u],2));
      if (Arrays.binarySearch(preferences[x],u)>Arrays.binarySearch(preferences[x],y) &&
              Arrays.binarySearch(preferences[x],u) >Arrays.binarySearch(preferences[x],u)){
          return 1;
      }
      return 0;
  }
}

```