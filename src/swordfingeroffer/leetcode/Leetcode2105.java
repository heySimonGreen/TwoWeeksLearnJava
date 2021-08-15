package swordfingeroffer.leetcode;

import swordfingeroffer.utils.ListNode;

import java.util.List;

/**
 * @author: chenwei
 * @date: 2021/8/15 11:58
 * @description: 描述
 */
public class Leetcode2105 {
  public static void main(String[] args) {
    ListNode head = new ListNode(1, null);
    ListNode p = head;
    for (int i = 2; i < 6; i++) {
      p.next = new ListNode(i, null);
      p = p.next;
    }
    p = head;
    while (true) {
      System.out.println("p.val = " + p.val);
      p = p.next;
      if (p == null) {
        break;
      }
    }
//    ListNode res = reverseList(head);
//    while (true) {
//      System.out.println("\"*************\" = " + "*************");
//      if (res == null) {
//        break;
//      }
//      System.out.println("res.val = " + res.val);
//      res = res.next;
//    }
    //2
      ListNode res2 = reverseList2(head);
      while (true) {
          System.out.println("##############");
          if (res2 == null) {
              break;
          }
          System.out.println("res2.val = " + res2.val);
          res2 = res2.next;
      }
  }

  public static ListNode reverseList(ListNode head) {
      if (head == null){
          return null;
      }
    int n = 0;
    ListNode p = head;
    // 计算长度
    while (true) {
      n++;
      p = p.next;
      if (p == null) {
        break;
      }
    }
    // 将节点放入数组中
    ListNode[] listNodes = new ListNode[n];
    p = head;
    for (int i = 0; i < n; i++) {
      listNodes[i] = p;
      p = p.next;
    }
    ListNode new_head = listNodes[n - 1];
    p = new_head;
    for (int i = 0; i < n; i++) {
      listNodes[i].next = null;
    }

    for (int i = n - 2; i >= 0; i--) {
      new_head.next = listNodes[i];
      new_head = new_head.next;
    }
    return p;
  }

  /*
  * 原链表：
  * head  1 --> 2 --> 3 --> 4 --> 5
  * 需要用一个last记录上一个值
  *
  * null <-- 1     2 --> 3 --> 4 --> 5 last = 1 head = 2
  * null <-- 1 <-- 2     3 --> 4 --> 5 last = 2 head = 3
  * null <-- 1 <-- 2 <-- 3     4 --> 5 last = 2 head = 4
  * null <-- 1 <-- 2 <-- 3 <-- 4     5 last = 3 head = 5
  * null <-- 1 <-- 2 <-- 3 <-- 4 <-- 5 last = 4 head = null
  *
  *
  * */
    public static ListNode reverseList2(ListNode head){
      if (head==null){
          return null;
      }
      if (head.next == null){
          return head;
      }

      ListNode last = null;
      while (head!=null){
          ListNode temp = head.next;
          head.next = last;
          last = head;
          head = temp;
      }
      return last;
    }
}
