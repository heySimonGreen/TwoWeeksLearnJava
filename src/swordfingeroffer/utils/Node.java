package swordfingeroffer.utils;

/**
 * @author: chenwei
 * @date: 2021/8/12 15:00
 * @description: 描述
 */
public class Node<Anytype> {
    public Anytype data;
    public Node<Anytype> next;
    public Node(Anytype data,Node<Anytype> next){
        this.data=data;
        this.next=next;
    }
}
