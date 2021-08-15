package day21usualclass2.code;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @author: chenwei
 * @date: 2021/8/15 20:33
 * @description:格式化或解析时间、日期
 * 1. 实例化
 *      一、 预定义标准格式 三种：DateTimeFormatter.ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATEISO_LOCAL_TIME;
 *      二、 本地化的相关格式：
 *      三、 自定义的格式：
 */
public class TestDateTimeFormatter {
  public static void main(String[] args) {
      //实例化
      //方式一：预定义标准格式 三种DateTimeFormatter.ISO_LOCAL_DATE_TIME;ISO_LOCAL_DATE;ISO_LOCAL_TIME
      DateTimeFormatter isoLocalDateTime = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
      //创建一个LocalDateTime用于格式化
      //格式化 LocalDateTime --> String
      LocalDateTime localDateTime = LocalDateTime.now();
      String str_isoLocalDateTime = isoLocalDateTime.format(localDateTime);
      System.out.println("str_isoLocalDateTime"+str_isoLocalDateTime);
    System.out.println(localDateTime);
    //解析 String --> LocalDateTime TemporalAccessor由于不知道是LocalDateTime还是LocalDate还是LocalTime，这里是一个接口形式呈现的，是一个多态形式
      TemporalAccessor parse = isoLocalDateTime.parse("2021-08-15T20:41:29.065");
    System.out.println(parse);

    //方式二:本地化的相关格式 DateTimeFormatter.ofLocalizedDateTime();DateTimeFormatter.ofLocalizedDate();DateTimeFormatter.ofLocalizedTime()
      //FormatStyle.LONG/FormatStyle.SHORT/FormatStyle.FULL
      DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
      //2021年8月16日 上午01时37分38秒
      String format = dateTimeFormatter.format(LocalDateTime.now());
    System.out.println(format);

    System.out.println("********** DateTimeFormatter.ofLocalizedDate()");
      DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
      //2021年8月16日 星期一
      String format1 = dateTimeFormatter1.format(LocalDate.now());
    System.out.println(format1);

    // 重点：方式三 自定义的格式
    System.out.println("方式3 重点");
      DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
      //解析
      String str_2 = dateTimeFormatter2.format(LocalDateTime.now());
      System.out.println(str_2);
    System.out.println(LocalDateTime.now());
    // 格式化
    System.out.println("格式化");
      String s = "2010-03-01 12:12:12";
      TemporalAccessor parse1 = dateTimeFormatter2.parse(s);
    System.out.println(s);
    System.out.println(parse1);
  }
}
