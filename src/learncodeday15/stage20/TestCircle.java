package learncodeday15.stage20;

/**
 * @author: chenwei
 * @date: 2021/7/19 17:05
 */
public class TestCircle {
    public static void main(String[] args){
        CompareObj compareObj = new ComparebleCircle(5.3);
        CompareObj compareObj2 = new ComparebleCircle(5.1);
        System.out.println(compareObj2.compareTo(compareObj));
    }
}
