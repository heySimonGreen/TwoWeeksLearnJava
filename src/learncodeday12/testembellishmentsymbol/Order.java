package learncodeday12.testembellishmentsymbol;

/**
 * @author: chenwei
 * @date: 2021/7/9 22:19
 * 体会四种不同的权限修饰符
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){
        orderPrivate=1;
        orderDefault=1;
        orderProtected=1;
        orderPublic=1;
    }
    void methodDefault(){
        orderPrivate=1;
        orderDefault=1;
        orderProtected=1;
        orderPublic=1;
    }
    protected void methodProtected(){
        orderPrivate=1;
        orderDefault=1;
        orderProtected=1;
        orderPublic=1;
    }
    public void methodPublic(){
        orderPrivate=1;
        orderDefault=1;
        orderProtected=1;
        orderPublic=1;
    }
}
