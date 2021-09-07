package day25generic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author: chenwei
 * @date: 2021/9/2 2:53
 * @description: 描述
 */
public class Practice2 {
  public static void main(String[] args) {
      Map<String,Integer> map = new HashMap<String,Integer>();
      map.put("chenwei",23);
      map.put("chenqing",33);
      map.put("huangyuyao",24);
      map.put("zhoujianping",52);
      map.put("liwei",21);
      //泛型的嵌套
      Set<Map.Entry<String, Integer>> entries = map.entrySet();
      Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
      while (iterator.hasNext()){
          Map.Entry<String, Integer> next = iterator.next();
          System.out.print("key = "+next.getKey());
          System.out.println("  value = "+next.getValue());
      }
  }
}
