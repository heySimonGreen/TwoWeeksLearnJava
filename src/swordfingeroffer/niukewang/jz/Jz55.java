package swordfingeroffer.niukewang.jz;

/**
 * @author: chenwei
 * @date: 2021/8/12 20:16
 * @description: 描述
 */
public class Jz55 {
  public static void main(String[] args) {
      int N = 1;
      int loop = 5;
      ListNode listNodeLoop = null;
      ListNode listNode = new ListNode(1);
      listNode.next =null;
      ListNode head = listNode;
//      for (int i=0;i<N;i++){
//          ListNode listNode1 = new ListNode(i);
//          listNode.next = listNode1;
//          listNode = listNode.next;
//          if (i==5){
//              listNodeLoop=listNode1;
//          }
//      }
//      listNode.next = listNodeLoop;


//      while (head != null){
//          System.out.println(head.val);
//          head = head.next;
//      }
    System.out.println(EntryNodeOfLoop(head).val);
  }
    public static ListNode EntryNodeOfLoop(ListNode pHead){
      ListNode fast = pHead;
      ListNode slow = pHead;
      while (fast!=null && fast.next!=null){
          fast=fast.next.next;
          slow=slow.next;
          if (fast==slow){
              fast=pHead;
              while (fast !=slow){
                  fast=fast.next;
                  slow=slow.next;
              }
              return fast;
          }
      }
        return null;
    }
}
