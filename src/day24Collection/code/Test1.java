package day24Collection.code;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author: chenwei
 * @date: 2021/8/30 21:49
 * @description: 描述
 */
public class Test1 {
  public static void main(String[] args) {
      Map map = new HashMap();
      map = new LinkedHashMap();
      map.put(32,43);
      map.put("chenwei",32);
      map.put("hello",33);
      map.put("study",42);
      Iterator iterator = map.entrySet().iterator();
      Iterator iterator2 = map.keySet().iterator();
    Iterator iterator3 = map.values().iterator();
      while (iterator.hasNext()){
        System.out.println(iterator.next());
      }
  }
}
