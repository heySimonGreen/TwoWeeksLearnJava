package day21usualclass2.code;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * @author: chenwei
 * @date: 2021/8/15 20:14
 * @description: Instant 瞬时类，类似于java.util.Date类
 */
public class TestInstant {
  public static void main(String[] args) {
      //now()对应本初子午线的标准时间
      Instant instant = Instant.now();
    System.out.println(instant);
    //添加时间的偏移量
      OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
    System.out.println(offsetDateTime);
    //toEpochSecond() 获取对应的毫秒数，和Date一样的 获取自1970年1月1日0时0分0秒的毫秒数
      long toEpochSecond = offsetDateTime.toEpochSecond();
    System.out.println(toEpochSecond);

    //ofEpochMilli()通过给定的毫秒数，获取Instant实例 --> Date(Long long )
      Instant instant1 = Instant.ofEpochMilli(toEpochSecond);
    System.out.println(instant1);

  }
}
