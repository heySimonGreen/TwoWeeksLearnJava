package swordfingeroffer.bilibili;

import java.lang.reflect.Field;

/**
 * @author : chenwei
 * @date : ${DATE}$
 * @description : 描述:考察的是反射
 */
public class InterView1 {
  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    String s = new String("abc");
    // 在这中间可以添加N行代码，但必须保证s的指向不变，最终将输出变成abcd

    Field value = s.getClass().getDeclaredField("value");
    value.setAccessible(true);
    value.set(s,"abcd".toCharArray());

    System.out.println(s);
  }
}
