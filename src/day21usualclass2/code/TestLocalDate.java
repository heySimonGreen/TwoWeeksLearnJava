package day21usualclass2.code;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author: chenwei
 * @date: 2021/8/15 15:56
 * @description: LocalDate、LocalTime、LocalDateTime的使用
 * 说明:
 * 1. LocalDateTime的使用频率相较LocalDate、LocalTime使用频率更高
 * 2. 类似于Calendar类
 *
 */
public class TestLocalDate {
  public static void main(String[] args) {
      //now()获取当前的日期、时间、时间+日期
      LocalDate localDate = LocalDate.now();
      LocalTime localTime = LocalTime.now();
      LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println("localDate = " + localDate);
    System.out.println("localTime = " + localTime);
    System.out.println("localDateTime = " + localDateTime);

    //of()设置指定的年、月、日、时、分、秒。没有偏移量
      LocalDateTime of = LocalDateTime.of(2021, 10, 3, 3, 3, 3);
      System.out.println(of);

    // getXxx() 获取某个属性
    System.out.println(localDateTime.getDayOfMonth());
    System.out.println(localDateTime.getDayOfWeek());
    System.out.println(localDateTime.getMonth());
    System.out.println(localDateTime.getMinute());

    //体现不可变性,这里对比calendar类的可变性，calendar没有返回值，而这里有返回值所以也可以看出不可变性
      //withXxx()设置相关属性，类似于Calendar的set
      LocalDate localDate1 = localDate.withDayOfMonth(22);
    System.out.println(localDate);
    System.out.println(localDate1);

    //LocalDate、LocalTime、LocalDateTime是一样的
      LocalDateTime localDateTime1 = localDateTime.withHour(2);
    System.out.println(localDateTime1);
    System.out.println(localDateTime);

    //不可变性，
      //plus加
      LocalDateTime localDateTime2 = localDateTime.plusMonths(3);
    System.out.println(localDateTime);
    System.out.println(localDateTime2);

      //不可变性，
      //minus
      LocalDateTime localDateTime3 = localDateTime.minusDays(5);
    System.out.println(localDateTime);
    System.out.println(localDateTime3);
  }
}
