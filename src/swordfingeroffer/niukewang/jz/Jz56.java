package swordfingeroffer.niukewang.jz;

import jdk.nashorn.internal.objects.NativeUint8Array;

/**
 * @author: chenwei
 * @date: 2021/8/13 10:18
 * @description: 描述
 */
public class Jz56 {
  public static void main(String[] args) {
    ListNode head = new ListNode(-1);
    ListNode first = head;
    int[] arr = new int[]{1,2,3,3,4,4,5};
    arr = new int[]{1,2,3,3,4,4,5};
    arr = new int[]{1,1,2,3,3,4,5,5};
    arr = new int[]{1,1,1,1,1,1,2};
    arr = new int[]{1,2};
//    arr = new int[]{1,1,1,1,1,1,1};
    for (int i=0;i<arr.length;i++){
        first.next = new ListNode(arr[i]);
        first = first.next;
    }
    ListNode p = head.next;
    printList(p);
//    ListNode res = deleteDuplication(p);
//    printList(res);

    ListNode res2 = deleteDuplication2(p);
    System.out.println("new res");
    printList(res2);
  }

  public static void printList(ListNode listNode) {
    System.out.println("print list:");
    while (listNode != null) {
      System.out.println(listNode.val);
      listNode = listNode.next;
    }
  }

  public static ListNode deleteDuplication(ListNode pHead) {
    ListNode first = pHead;
    if (first==null){
        return first;
    }
    {
        int value_out = first.val;
        ListNode p = first;
        while (p.next != null){
//            p=p.next;
        if (p.next.val == value_out) {
                if (p.next.next == null){
                    return null;
                }
            p= p.next;
                continue;
            }
            value_out = p.next.val;
            if (p.next.next == null){
                if (p==first){
                    return p;
                }
                return p.next;
//                first=p;
//                break;
            }
            if (value_out != p.next.next.val){
                break;
            }
            p= p.next;
        }
    }
//    System.out.println("lll");
//    printList(first);
    while (first!=null){
        int value = first.val;
        boolean flag = false;
        if (first.next == null){
            return first;
        }
        while (first.next.val == value){
            first = first.next;
            flag = true;
        }
        if (flag==true){
            first = first.next;
        }
        if (first.next == null){
            break;
        }else {
            if (first.next.val != first.val){
                break;
            }
        }
    }
    ListNode p = first;
    while (p.next != null){
        //后面只有一个元素或者没有元素
        if (p.next.next == null||p.next == null){
            return first;
        }
        //后面有两个元素
        if (p.next.next.next == null){
            if (p.next.val == p.next.next.val){
                p.next = null;
            }
            return first;
        }
        //后面元素大于两个
        ListNode q=p.next;
        int v = q.val;
        boolean flag = false;
        while (q.next.val == v){
            q=q.next;
            flag = true;
        }
        if (flag == false){
            p = p.next;
        }
        else {
            p.next = q.next;
        }
    }
    return first;
  }
    public static ListNode deleteDuplication2(ListNode pHead){
      if (pHead == null){
          return null;
      }
        ListNode first = pHead;
        ListNode p= first,q= first.next,r= first;
        out:
        while (p.next != null){
            int length = 0;
            while (p.val == q.val){
                length+=1;
                if (q.next == null){
                    if (p == first){
                        return null;
                    }
                    r.next = null;
                    break out;
                }
                q = q.next;
            }
            if (p == first&&length!=0){
                first = q;
                p = q;
                r=q;
                q=q.next;
            }else {
                if (length != 0){
                    r.next = q;
                    p=r;
                }
                r=p;
                p=q;
                q=q.next;
            }
        }
        return first;
    }
}
