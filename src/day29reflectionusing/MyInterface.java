package day29reflectionusing;

/**
 * @author: chenwei
 * @date: 2021/9/18 2:07
 * @description: 描述
 */
@FunctionalInterface
public interface MyInterface {
    /**
     * 自定义函数式接口
     * 这里使用注解表示是一个函数式接口，会对下面的方法校验是否满足函数式接口的定义
     * 只有一个抽象方法的接口就是函数式接口
     * lambda表达式要使用就一定依赖函数式接口
    */
    void method();
}
