package day21usualclass2.code;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author: chenwei
 * @date: 2021/8/16 22:44
 * @description:
 * 一、 说明：java中的对象，正常情况下，只能进行比较：==！=。
 * 不能使用<和>，但是在开发场景中，我们需要对多个对象进行排序，言外之意，就比较对象的大小。
 * 如何实现使用两个接口中的任何一个：Comparable或Comparator
 * 二、 Comparable接口和Comparator使用的对比
 *      Comparable接口一但指定，保证Comparable接口实现类的对象在任何位置都可以比较大小
 *      Comparator属于临时比较
 *      比如买筷子一样，一个是可以重复使用的筷子一个是一次性的筷子
 *
 * Comparable接口的使用举例：
 * 1. 像String、包装类等实现了Comparable接口，重写了CompareTo(obj)方法，给出了比较两个对象大小的方式
 * 2. 像String、包装类重写CompareTo方法后，进行了从小到大的排序
 * 3. 重写CompareTo的规则：
 *      如果当但对象大于形参对象obj，则返回正整数
 *      如果当但对象小于形参对象obj，则返回负整数
 *      如果当但对象等于形参对象obj，则返回零
 * 4. 对于自定义类来说，如果需要排序，我们可以让自定义类实现Comparable接口，重写CompareTo(obj)方法
 *    在CompareTo(obj)方法中指明如何排序
 *
 * Compare的使用，特定排序，上面的排序通常是从小到大排序，但我们有时需要从打到小排序，可以临时使用这个
 */
public class TestCompare {
  public static void main(String[] args) {
    String[] strings = new String[]{"FF","KK","PP","SS","II"};

    //方式一:实现Comparable接口重写CompareTo方法
      Arrays.sort(strings);
      System.out.println("strings = " + Arrays.toString(strings));

      Goods[] goods = new Goods[7];
      goods[0] = new Goods("dell 1245",33);
      goods[1] = new Goods("huasuo 1245",30);
      goods[2] = new Goods("lenovol 15",20);
      goods[3] = new Goods("shubiao 1245",3);
      goods[4] = new Goods("shuibei",13);
      goods[5] = new Goods("dianshi",50);
      goods[6] = new Goods("cianshi",50);
      Arrays.sort(goods);
      for (int i =0;i<7;i++){
        System.out.println(goods[i].getName() + "  " + goods[i].getPrice());
      }
      System.out.println(Arrays.toString(goods));

      //方法二：临时定制排序
  }
  @Test
  public void compareTest(){
    String[] strings = new String[]{"FF","KK","PP","SS","II"};
    Arrays.sort(strings, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        if (o1 instanceof String && o2 instanceof String){
          return -o1.compareTo(o2);
        }
        throw new RuntimeException("参数错误");
      }
    });
    for (int i=0;i<strings.length;i++){
      System.out.println(strings[i]);
    }
  }
}
