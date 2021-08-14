package swordfingeroffer.utils;

/**
 * @author: chenwei
 * @date: 2021/8/12 16:34
 * @description: 描述
 */
public class SingleLink<Anytype> {
    public Node<Anytype> first;
    public Node<Anytype> head;
    public int thesize;
    public boolean initlist(){
        this.first = new Node<>(null,null);
        this.head = new Node<>(null,first);
        this.thesize = 0;
        return true;
    }
    public boolean isEmpty(){
        return thesize == 0;
    }
    public Node<Anytype> getNode(int i){
        Node<Anytype> renode = head;
        for (int j=-2;j<i;j++){
            renode = renode.next;
        }
        return renode;
    }
    public void add(Anytype a){
        Node<Anytype> renode = new Node<>(a,null);
        getNode(thesize -1).next = renode;
        renode.next = first.next;
        thesize++;
    }
    public void print(){
        for (int i=0;i<thesize;i++){
            System.out.println(getNode(i).data);
        }
    }
    public Anytype remove(int i){
        if (i == thesize-1){
            Anytype a = getNode(thesize -1).data;
            getNode(thesize-2).next = first.next;
            return a;
        }
        Node<Anytype> prev = getNode(i-1);
        Anytype a = prev.next.data;
        prev.next = prev.next.next;
        thesize--;
        return a;

    }
    public void insert(int i,Anytype a){
        Node<Anytype> prev = getNode(i-1);
        Node<Anytype> node = new Node<>(a,null);
        node.next = prev.next;
        prev.next = node;
        thesize++;
    }
    public Anytype get(int i){
        return getNode(i).data;
    }
    public void set(int i,Anytype data){
        getNode(i).data = data;
    }
    public int length(){
        return thesize;
    }
    public void clear(){
        initlist();
    }
    public void printList(){
        for (int i=0;i<thesize;i++){
            System.out.println(getNode(i).data);
        }
    }

}
