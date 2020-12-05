package LearnCode.day12092;

/**
 * @author: chenwei
 * @data: 2020/12/2 23:15
 */

/*
*  搭配“标签 break”的 for 循环中使用 break 和 continue
*
*注意 break 会中断 for 循环，而且在抵达 for 循环的末尾之前，递增表达式不会执行。
*
* */
public class test {
  public static void main(String args[]) {
    int i = 0;
    int j = 0;
    outer:
    for (; i < 5; i++) {
      inner:
      {
        System.out.println("inner");
        for (; j < 5; j++) {
          System.out.println("inner for:" + j);
          if (j == 3) {
              System.out.println("break inner");
            break inner;
          }
        }
      }
    }
  }
}
