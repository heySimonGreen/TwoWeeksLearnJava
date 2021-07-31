package learncodeday16;

/**
 * @author: chenwei
 * @date: 2021/7/26 12:29
 */
public class Student {
    private int id;
    public void register(int id) throws MyExcepiton{
        if (id > 0){
            this.id = id;
        }else {
            System.out.println("输入非法。");
            throw new MyExcepiton("输入非法");
        }
    }
}
