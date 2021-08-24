package day24Collection.preview;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author: chenwei
 * @date: 2021/8/25 1:26
 * @description: 描述
 */
public class Test {

  public static void main(String[] args) {
    Comparator comparator = new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        if (o1 instanceof Employee && o2 instanceof Employee){
          Employee e1 = (Employee) o1;
          Employee e2 = (Employee) o2;
          if ((e1.getBirthday().getYear() != e2.getBirthday().getYear())){
            return e1.getBirthday().getYear()-e2.getBirthday().getYear();
          }else {
            if (e1.getBirthday().getMonth()!=e2.getBirthday().getMonth()){
              return e1.getBirthday().getMonth()-e2.getBirthday().getMonth();
          }else {
              if (e1.getBirthday().getDay()!=e2.getBirthday().getDay()){
                return e1.getBirthday().getDay()-e2.getBirthday().getDay();
              }else {
                return 0;
              }
            }
        }
      }
        throw new RuntimeException("comparator error" );
    }};
    TreeSet treeSet = new TreeSet(comparator);
    treeSet.add(new Employee("ccsd", 24, new MyDate(2021, 8, 3)));
    treeSet.add(new Employee("af", 30, new MyDate(2023, 5, 3)));
    treeSet.add(new Employee("fsdfsd", 22, new MyDate(2001, 3, 6)));
    treeSet.add(new Employee("afaf", 19, new MyDate(2002, 4, 3)));
    treeSet.add(new Employee("gherh", 18, new MyDate(2000, 2, 3)));
    treeSet.add(new Employee("egaeg ", 30, new MyDate(2023, 5, 3)));
    Iterator it = treeSet.iterator();
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }
}
