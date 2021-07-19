package learncodeday15.stage20;

/**
 * @author: chenwei
 * @date: 2021/7/19 20:34
 */
public interface Java8Test2 {

  /**
   * 实现多个接口，接口中的方法相同，此时实现类必须重写此方法 */
  default void method3() {
        System.out.println("CompareA:上海");
    }
}
