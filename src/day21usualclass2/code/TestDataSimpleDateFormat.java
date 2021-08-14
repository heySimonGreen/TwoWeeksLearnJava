package day21usualclass2.code;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: chenwei
 * @date: 2021/8/15 1:07
 * @description: jdk8之前的日期时间API测试
 * 1. System类中的currentTimeMillis();
 * 2. java.util.Date和java.sql.Date
 * 3. simpleDateFormat
 * 4. Calender
 *
 * SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
 * 注意这里后面的yyyy和dd写成大写的会有问题，为什么呢？
 * 直接记忆MM为什么大写吧，因为和分钟minute的m冲突，所以月份要大写
 *
 * simpleDateFormat的使用：simpleDateFormat对日期Date类的格式化和解析
 * 1. 两个操作
 * 1.1 格式化：日期 --> 字符串
 * 1.2 解析： 格式化的逆过程，字符串 --> 日期
 *
 * 2. simpleDateFormat的实例化
 * SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("YYYY-MM-dd hh-mm-ss");//指定日期格式的实例化
 * SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
 */
public class TestDataSimpleDateFormat {
  public static void main(String[] args) throws ParseException {
      //实例化simpleDateFormat
      SimpleDateFormat simpleDateFormat = new SimpleDateFormat();

      //格式化：日期 --> 字符串
      Date date = new Date();
      System.out.println("date = " + date);

      String s = simpleDateFormat.format(date);
      System.out.println("s = " + s);

      //解析：格式化的逆过程，字符串-->日期
      String str = "19-12-03 上午 11:66";
      Date date1 = new Date();
      date1 = simpleDateFormat.parse(str);
      System.out.println("date1 = " + date1);

      System.out.println("\"******************\" = " + "******************");
      //格式化
      SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("YYYY-MM-dd hh-mm-ss");
      System.out.println("simpleDateFormat1.format(date1) = " + simpleDateFormat1.format(date1));
      //解析
      Date date2 = simpleDateFormat1.parse("2019-12-03 12-06-00");
      System.out.println("date2 = " + date2);
      Date date3 = new Date();
      System.out.println(simpleDateFormat1.format(date3));
      //练习1 将字符串“2020-09-08”转换为java.sql.Date
      String s1 = new String("2020-09-08");
      SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd");
      Date date4 = simpleDateFormat2.parse(s1);
      java.sql.Date sqlDate = new java.sql.Date(date4.getTime());
      System.out.println("sqlDate = " + sqlDate);
      //练习2 三天打鱼两天晒网 1990-09-08 xxxx-xx-xx打鱼还是筛网？
      /*
      * 关键计算到那一天的总天数，关于计算总天数的问题，考虑使用毫秒数解决问题，获取毫秒数相减
      * 计算天数 (date2.getTime() - date1.getTime()) / (1000 * 60 * 60 *24) + 1
      * 总天数%5 == 1,2,3 打鱼
      * 总天数%5 == 4，0 筛网
      * */
  }
}
