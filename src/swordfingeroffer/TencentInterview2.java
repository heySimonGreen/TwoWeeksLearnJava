package swordfingeroffer;

import java.util.Scanner;

/**
 * @author: chenwei
 * @date: 2021/8/9 20:53
 * @description: 描述
 */
public class TencentInterview2 {
  public static void main(String[] args) {
      int n=0,m=0;
      Scanner scanner = new Scanner(System.in);
      n=scanner.nextInt();
      m=scanner.nextInt();
      System.out.println(n);
      System.out.println(m);
      Node fitst = new Node(0,null);
      for (int i=1;i<n;i++){
          Node node = new Node(i, null);
          fitst.next=node;
      }
  }
}
class Node{
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
