package day21usualclass2.code;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author: chenwei
 * @date: 2021/8/17 2:47
 * @description: 其他常用类的使用
 * 1. System类
 */
public class OtherClass {
    @Test
    public void systemTest(){
        String java_version = System.getProperty("java.version");
        String java_home = System.getProperty("java.home");
        String os_name = System.getProperty("os.name");
        String os_version = System.getProperty("os.version");
        String user_name = System.getProperty("user.name");
        String user_home = System.getProperty("user.home");
        String user_dir = System.getProperty("user.dir");

        System.out.println("java_version " +  java_version);
        System.out.println("java_home " +  java_home);
        System.out.println("os_name " +  os_name);
        System.out.println("os_version " +  os_version);
        System.out.println("user_name " +  user_name);
        System.out.println("user_home " +  user_home);
        System.out.println("user_dir " +  user_dir);
    }
    @Test
    public void bigIntegerTest(){
        BigInteger bigInteger = new BigInteger("321156431564651464616461");
        BigDecimal bigDecimal = new BigDecimal("2646156.156461");
        BigDecimal bigDecimal2 = new BigDecimal("564645441.56431644");
    System.out.println(bigInteger);
    //支持任意精度的小数位（25） ， 四舍五入BigDecimal.ROUND_HALF_UP
    System.out.println(bigDecimal2.divide(bigDecimal,25,BigDecimal.ROUND_HALF_UP));
    }
}
