package swordfingeroffer.leetcode;

import javax.swing.*;
import java.util.Arrays;
import java.util.Vector;

/**
 * @author: chenwei
 * @date: 2021/8/14 15:43
 * @description: leetcode上的第1583题，答案已正确提交
 */
public class Leetcode1583 {
  public static void main(String[] args) {
//      int n = 4;
//      int[][] preferences = {{1,3,2}, {2,3,0}, {1,3,0}, {0,2,1}};
//      int[][] pairs = {{1,3}, {0,2}};

//      int n = 4;
//      int[][] preferences = {{1,2,3}, {3,2,0}, {3,1,0}, {1,2,0}};
//      int[][] pairs = {{0,1}, {2,3}};

      int n = 6;
      int[][] preferences = {{3,2,4,5,1}, {3,4,2,0,5}, {5,0,3,1,4}, {2,0,4,5,1},{2,3,5,0,1},{1,4,3,0,2}};
      int[][] pairs = {{5,3}, {4,2},{0,1}};
      System.out.println(unhappyFriends(n,preferences,pairs));

  }
  public static int unhappyFriends(int n, int[][] preferences, int[][] pairs){
      int res = 0;
      int[] res_arr = new int[n];
      for (int i = 0;i<res_arr.length;i++){
          res_arr[i]=-10;
      }
      for (int i=0;i<pairs.length;i++){
          for (int j=i+1;j<pairs.length;j++){
              int[] arr1 = pairs[i];
              int[] arr2 = pairs[j];

              int x=arr1[0],y=arr1[1],u=arr2[0],v=arr2[1];

              //1
              if (Res(x,y,u,v,preferences)!=-1){
                  int num = Res(x,y,u,v,preferences);
                  if (indexOf(res_arr,num)==-1){
                      res_arr[res] = num;
                      res++;
                  }
              }else {
                  if (Res(x,y,v,u,preferences)!=-1){
                      int num = Res(x,y,v,u,preferences);
                      if (indexOf(res_arr,num)==-1){
                          res_arr[res] = num;
                          res++;
                      }
                  }
              }
              //2
              if (Res(y,x,u,v,preferences)!=-1){
                  int num = Res(y,x,u,v,preferences);
                  if (indexOf(res_arr,num)==-1){
                      res_arr[res] = num;
                      res++;
                  }
              }else {
                  if (Res(y,x,v,u,preferences)!=-1){
                      int num = Res(y,x,v,u,preferences);;
                      if (indexOf(res_arr,num)==-1){
                          res_arr[res] = num;
                          res++;
                      }
                  }
              }
              //3
              if (Res(u,v,x,y,preferences)!=-1){
                  int num = Res(u,v,x,y,preferences);
                  if (indexOf(res_arr,num)==-1){
                      res_arr[res] = num;
                      res++;
                  }
              }else {
                  if (Res(u,v,y,x,preferences)!=-1){
                      int num = Res(u,v,y,x,preferences);
                      if (indexOf(res_arr,num)==-1){
                          res_arr[res] = num;
                          res++;
                      }
                  }
              }
              //4
              if (Res(v,u,x,y,preferences)!=-1){
                  int num = Res(v,u,x,y,preferences);
                  if (indexOf(res_arr,num)==-1){
                      res_arr[res] = num;
                      res++;
                  }
              }else {
                  if (Res(v,u,y,x,preferences)!=-1){
                      int num = Res(v,u,y,x,preferences);
                      if (indexOf(res_arr,num)==-1){
                          res_arr[res] = num;
                          res++;
                      }
                  }
              }

          }
      }
      return res;
  }
  public static int indexOf(int[] arr,int number){
      for(int i=0;i<arr.length;i++){
          if (arr[i] == number){
              return i;
          }
      }
      return -1;
  }
  public static int Res(int x,int y,int u,int v,int[][] preferences){
      if (indexOf(preferences[x],u) <indexOf(preferences[x],y) && indexOf(preferences[u],x) < indexOf(preferences[u],v)){
          System.out.println("x = " + x);
          return x;
      }
      return -1;
  }
}
