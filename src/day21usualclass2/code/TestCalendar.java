package day21usualclass2.code;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author: chenwei
 * @date: 2021/8/15 2:40
 * @description: Calendar日历类（抽象类）的使用
 */
public class TestCalendar {
  public static void main(String[] args) {
      /*
      * 1. 实例化
      * 方式一、 创建其子类（GregorianCalendar）的对象
      * 方式二、 调用其静态方法GetInstance()
      * 2. 常用方法
      * get()
      * set()
      *
      * */
      Calendar instance = Calendar.getInstance();
      GregorianCalendar gregorianCalendar = new GregorianCalendar();

      //get()方法
      int days = instance.get(Calendar.DAY_OF_MONTH);
    System.out.println("days = " + days);
    System.out.println("DAY_OF_YEAR = " + instance.get(Calendar.DAY_OF_YEAR));

    //set方法
    //这里set过后将Calendar对象本身就改了
    instance.set(Calendar.DAY_OF_MONTH,10);
    System.out.println(
        "instance.get(Calendar.DAY_OF_MONTH) = " + instance.get(Calendar.DAY_OF_MONTH));
    //add方法,虽然没有减，但是可以把参数修改为负的就相当于是减了
      instance.add(Calendar.DAY_OF_MONTH,9);
      instance.add(Calendar.DAY_OF_MONTH,-1);
    System.out.println(
        "instance.get(Calendar.DAY_OF_MONTH) = " + instance.get(Calendar.DAY_OF_MONTH));

    //getTime() 日历类  --> date
      Date d = instance.getTime();
    System.out.println("d = " + d);
    //setTime() date --> 日历类
      Date date = new Date();
      instance.setTime(date);
    System.out.println(
        "instance.get(Calendar.DAY_OF_MONTH) = " + instance.get(Calendar.DAY_OF_MONTH));
  }
}
