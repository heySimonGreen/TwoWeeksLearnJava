package learncodeday13.test3;

import org.junit.Test;

/**
 * @author: chenwei
 * @date: 2021/7/14 0:29
 */
public class WrapperTest {

    //基本数据类型------->包装类，调用包装类的构造器
    @Test
    public void test1(){
        int num = 10;
        Integer integer = new Integer(num);
        System.out.println(integer.toString());
    }
}
