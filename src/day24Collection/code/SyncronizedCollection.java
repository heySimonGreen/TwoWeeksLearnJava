package day24Collection.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: chenwei
 * @date: 2021/9/1 3:17
 * @description: Collections类中提供了多个synchronizedXxx()方法，
 * 该方法可以使指定集合包装成线程同步的集合，从而可以解决多线程并发访问集合时的线程安全问题
 */
public class SyncronizedCollection {
  public static void main(String[] args) {
      List list = new ArrayList();
      list.add("chen");
      list.add("wei");
      list.add(2354);
      List l = Collections.singletonList(list);

  }
}
