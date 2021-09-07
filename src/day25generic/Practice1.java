package day25generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author: chenwei
 * @date: 2021/9/2 2:41
 * @description: 描述
 */
public class Practice1 {
  public static void main(String[] args) {
      ArrayList<Integer> integers = new ArrayList<>();
      for (int i=0;i<100;i++){
          integers.add((int) (Math.random()*100 + 1));
      }
      Iterator<Integer> i = integers.iterator();
      while (i.hasNext()){
            System.out.println(i.next());
      }
  }
}
