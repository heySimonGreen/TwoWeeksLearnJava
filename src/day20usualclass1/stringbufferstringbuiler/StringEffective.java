package day20usualclass1.stringbufferstringbuiler;

/**
 * @author: chenwei
 * @date: 2021/8/12 2:02
 * @description: 对比String、StringBuffer、StringBuilder三者的效率
 *  从高到低排序：StringBuilder > StringBuffer > String
 */
public class StringEffective {
  public static void main(String[] args) {
      long startTime = 0L;
      long endTime = 0L;
      int N = 20000000;
      String str = "";
      StringBuilder builder = new StringBuilder("");
      StringBuffer buffer = new StringBuffer("");
      //开始对比
//      startTime = System.currentTimeMillis();
//      for (int i=0;i<N;i++){
//          str = str + i;
//      }
//      endTime = System.currentTimeMillis();
//      System.out.print("str");
//      System.out.println(endTime - startTime);

      startTime = System.currentTimeMillis();
      for (int i=0;i<N;i++){
          builder.append(String.valueOf(i));
      }
      endTime = System.currentTimeMillis();
      System.out.print("builder");
      System.out.println(endTime - startTime);

      startTime = System.currentTimeMillis();
      for (int i=0;i<N;i++){
          buffer.append(String.valueOf(i));
      }
      endTime = System.currentTimeMillis();
      System.out.print("buffer");
      System.out.println(endTime - startTime);
  }
}
