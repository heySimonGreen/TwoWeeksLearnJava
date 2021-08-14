package day20usualclass1.datetime;

import org.junit.Test;

import java.util.Date;

/**
 * @author: chenwei
 * @date: 2021/8/13 20:58
 * @description: jdk 8 之前日期和时间的测试
 *
 * java.util.Date类
 *          |-----java.sql.Date
 * 1. 两个构造器的使用
 *      构造器一：Date() 创建当前时间的Data对象
 *      构造器二：创建指定毫秒数的Date对象
 *
 * 2. 两个方法的使用
 *      >toString //显示当前时间的年月日时分秒
 *      >getTime //获取当前date对象的时间戳，具体到毫秒
 *
 * 3. java.sql.Date对应着数据库中的日期类型的变量
 *      >如何实例化
 *      >sql.Date  --->  util.Date 子转父，可强转
 *      >util.Date  --->  sql.Date  通过毫秒数
 */
public class Test1 {
    @Test
    public void dateTest(){
        //返回当前时间与1970年1月1日0时0分0秒之间以毫秒为单位的时间差
        Long currentTime = System.currentTimeMillis();
        System.out.println("chen");
        System.out.println(currentTime );
    }
    @Test
    public void dateTimeTest(){
        //构造器一：Date() 创建当前时间的Data对象
        Date date1 = new Date();
        System.out.println(date1.toString());
        System.out.println(date1.getTime());
        //构造器二：创建指定毫秒数的Date对象
        Date date2 = new Date(1628860522707L);
        System.out.println(date2.toString());
        //创建java.sql.Date对象
        java.sql.Date date = new java.sql.Date(1628860522707L);
        System.out.println(date);
        //如何将util.Date  转换为--->  sql.Date   通过毫秒数
        Date date3 = new Date();
        java.sql.Date date4 = new java.sql.Date(date3.getTime());
        System.out.println(date4);
    }
}
