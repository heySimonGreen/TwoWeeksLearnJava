package day24Collection.code;

import java.util.*;

/**
 * @author: chenwei
 * @date: 2021/9/1 16:45
 * @description: 描述
 */
public class Practice1 {
  public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n=10;
      Comparator comparator = new Comparator() {
          @Override
          public int compare(Object o1, Object o2) {
              if (o1 instanceof Integer && o2 instanceof Integer){
                  Integer number1 = (Integer) o1;
                  Integer number2 = (Integer) o2;
                  return -(number1-number2);
              }
              throw new RuntimeException("Object is not number");
          }
      };
      List integers = new ArrayList();
      for(int i=0;i<n;i++){
          int number = scanner.nextInt();
          integers.add(number);
      }
      Collections.sort(integers,comparator);
      System.out.println(integers);
  }
}
