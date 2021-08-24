package day24Collection.preview;

import day23Collection.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @author: chenwei
 * @date: 2021/8/25 2:51
 * @description: 描述
 */
public class InterviewTest {
    public static List d(List list){
        HashSet hashSet = new HashSet();
        hashSet.addAll(list);
        return new ArrayList(hashSet);
    }
  public static void main(String[] args) {
      HashSet hashSet = new HashSet();

      Person p1 = new Person("CHENWEI",33);
      Person p2 = new Person("CHENWEI",24);
      hashSet.add(p1);
      hashSet.add(p2);
      System.out.println(hashSet);

      p1.setName("chendada");
      hashSet.remove(p1);
      System.out.println(hashSet);

      hashSet.add(new Person("chendada",33));
      System.out.println(hashSet);

      hashSet.add(new Person("CHENWEI",33));
      System.out.println(hashSet);

  }
}
