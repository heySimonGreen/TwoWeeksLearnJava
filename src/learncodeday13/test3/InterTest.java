package learncodeday13.test3;

import org.junit.Test;

/**
 * @author: chenwei
 * @date: 2021/7/14 0:10
 */
public class InterTest {
    @Test
    public void test1(){
        int num = 10;
        Integer integer = new Integer(num);
        System.out.println(integer.toString());

        Integer integer1 = new Integer("1234");
        System.out.println(integer1.toString());

        Float f = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f);
        System.out.println(f2);

        Boolean b = new Boolean(true);
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("true123");
        System.out.println(new Orders().aBoolean);
        System.out.println(new Orders().aBoolean2);
    }
    @Test
    public void test2(){
        Integer integer = new Integer(12);
        int i = integer.intValue();
        System.out.println(i + 1);

        Float f1 = new Float(12.3);
        float f = f1.floatValue();
        System.out.println(f + 1);
    }
    /*
    * jdk5新特性，自动装箱与自动拆箱
    * */

    @Test
    public void test3(){
//        int num = 10;
//        //基本数据类型==》包装类的对象
//        method(num);

        //自动装箱：基本数据类型 --->包装类
        int num2 = 10;
        Integer in2 = num2;

        boolean b1 = true;
        Boolean b2 = b1;

        //自动拆箱： 包装类 --->基本数据类型
        System.out.println(in2.toString());
        int num3 = num2;

    }
    //基本数据类型、包装类 --- 》String类型

    @Test
    public void test4(){
        int num1 = 10;
        //方式1 连接运算
        String str1 = num1 + "";
        //方式2 调用String的valueOf()
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);
        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}
class Orders{
    boolean aBoolean;
    Boolean aBoolean2;
}
