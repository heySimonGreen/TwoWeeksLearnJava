package swordfingeroffer.niukewang;

import swordfingeroffer.utils.Node;
import swordfingeroffer.utils.SingleLink;

import java.util.Scanner;

/**
 * @author: chenwei
 * @date: 2021/8/12 15:03
 * @description: 描述
 */
public class JosephRingProblem {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      SingleLink<Integer> singleLink = new SingleLink<>();
      singleLink.initlist();
      for (int i=0;i<n;i++){
          singleLink.add(i+1);
      }
      Node<Integer> pivot = singleLink.first;
      int data =0;
      while (pivot.next != pivot){
          for (int i=1;i<m;i++){
              pivot=pivot.next;
          }
          data = pivot.next.data;
          System.out.println(" delete: "+data);
          pivot.next = pivot.next.next;
          //pivot = pivot.next;
      }
      System.out.println(pivot.data);
//      singleLink.print();
  }
}
