package learncode20210706day10basic;

/**
 * @author: chenwei
 * @date: 2021/7/6 19:37
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
        System.out.println("methodPrivate");
    }
    void methodDefault(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
        System.out.println("methodDefault");
    }
    public void methodPublic(){
        orderPrivate = 1;
        orderDefault = 2;
        orderPublic = 3;
        System.out.println("methodPublic");
    }
}
