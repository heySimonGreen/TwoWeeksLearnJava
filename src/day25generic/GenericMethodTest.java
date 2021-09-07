package day25generic;

import org.junit.Test;

import java.util.List;

/**
 * @author: chenwei
 * @date: 2021/9/4 0:22
 * @description: 描述
 */
public class GenericMethodTest {
    @Test
    public void test1(){
        GenericMethod genericMethod = new GenericMethod();
        Integer[] arr = new Integer[]{1,4,2,5,2};
        //泛型方法在调用时，指明泛型参数的类型
        List<Integer> integers = genericMethod.copyFromArrayToList(arr);
        System.out.println(integers);
    }
}
