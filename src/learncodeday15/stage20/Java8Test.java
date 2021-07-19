package learncodeday15.stage20;

/**
 * @author: chenwei
 * @date: 2021/7/19 19:57
 */
public interface Java8Test {
  /**
   * test */
  public static void method1() {
        System.out.println("CompareA:北京");
    }
    /**
     * test2 */
    public default void method2(){
      System.out.println("CompareA:上海");
    }
    /**
     * test3 */
    default void method3(){
      System.out.println("CompareA:上海");
    }
}
