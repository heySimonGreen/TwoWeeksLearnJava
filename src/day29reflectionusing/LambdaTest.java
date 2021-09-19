package day29reflectionusing;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author: chenwei
 * @date: 2021/9/17 18:25
 * @description: Lambda表达式的使用举例
 */
public class LambdaTest {
    @Test
    public void test1(){
        /*
        * 语法格式一：无参，无返回值
        * */
        //提供一个实现Runnable接口的匿名实现类的对象
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("我爱北极天安门");
            }
        };
        r1.run();
        Runnable r2 = () -> System.out.println("我爱北京故宫");
        r2.run();
    }
    @Test
    public void test2(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        int compare = comparator.compare(22, 32);
        System.out.println(compare);
        System.out.println("*************");
        //Lambda表达式的写法
        Comparator<Integer> comparator2 = (o1,o2) ->  Integer.compare(o1,o2);
        int compare1 = comparator2.compare(53, 412);
        System.out.println(compare1);
        //方法引用
        System.out.println("*************");
        Comparator<Integer> comparator3 = Integer::compare;
        int compare3 = comparator3.compare(53, 412);
        System.out.println(compare3);
    }
    @Test
    public void test3(){
        /**
         1. 举例：(o1,o2) -> Integer.compare(o1,o2)
         2. 格式：
         ->:lambda操作符 或箭头操作符
         ->左边：lambda形参列表 (其实就是接口中的抽象方法的形参列表)
         ->右边：lambda体 (其实就是重写的抽象方法的方法体)
         3. lambda表达式的使用：(分6种情况介绍)
         总结：
            -> 左边 lambda形参列表的数据类型可以省略(类型推断)；如果lambda形参列表只有一个参数，其一对()也可以省略
            -> 右边 lambda体应该使用一对{}包裹，如果lambda体只有一条执行语句(可能时return语句),可以省略这一对{}和return关键字(要省必须一起省)
         4. lambda表达式的本质；作为接口的实例
         */

        /*
        * 语法格式二：需要一个参数，但没有返回值
        * 提供接口匿名实现类的对象
        * */
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("谎言和誓言的区别是什么？");
        consumer.accept("************");
        Consumer<String> consumer2 =(String s) -> System.out.println(s);
        consumer2.accept("一个是听的人当真了，另一个是说的人当真了");

        /*
         * 语法格式三：数据类型可以省略，因为可以由编译器推断得出，称为"类型维护"
         * 提供接口匿名实现类的对象
         * */
        Consumer<String> consumer3 =(s) -> System.out.println(s);
        consumer3.accept("aaaaaaaaaaa");
        /*
         * 语法格式四：Lambda只需要一个参数时，参数的小括号可以省略
         * 提供接口匿名实现类的对象
         * */
        Consumer<String> consumer4 = s -> System.out.println(s);
        consumer4.accept("consumer4");

        /*
         * 语法格式五：Lambda需要两个或以上参数，多条执行语句，并且可以有返回值，
         * 提供接口匿名实现类的对象
         * */
        //没有使用Lambda表达式时的写法
        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("多条执行语句1");
                System.out.println("多条执行语句2");
                return Integer.compare(o1,o2);
            }
        };
        int compare = c.compare(56, 52);
        System.out.println(compare);
        System.out.println("***************");
        //使用Lambda表达式时的写法
        Comparator<Integer> c2 = (o1,o2) -> {
                System.out.println("多条执行语句1");
                System.out.println("多条执行语句2");
                return Integer.compare(o1,o2);
        };
        int compare2 = c2.compare(56, 60);
        System.out.println(compare);
        /*
        * 语法格式六：当Lambda体只有一条语句时,return与大括号若有，都可以省略
        * */
        Comparator<Integer> c3 = (o1,o2) -> Integer.compare(o1,o2);
        int compare3 = c3.compare(56, 60);
        System.out.println(compare3);
    }
    @Test
    public void test4(){
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("test4");
    }
}
