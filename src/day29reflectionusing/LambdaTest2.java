package day29reflectionusing;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author: chenwei
 * @date: 2021/9/18 2:24
 * @description: java内置的4大函数式接口
 * 消费型接口 Consumer<T> void accept(T t)
 * 供给型接口 Supplier<T> T get()
 * 函数型接口 Function<T> R apply(T t)
 * 断定型接口 Predicate<T> Boolean test(T t)
 */
public class LambdaTest2 {
    @Test
    public void test1(){
        //不使用函数式接口
        happyTime(300, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("spend "+ aDouble);
            }
        });
        //使用函数式接口
        happyTime(20,money -> System.out.println("spend "+ money));
    }
    public void happyTime(double money, Consumer<Double> consumer){
        consumer.accept(money);
    }
    @Test
    public void test2(){
        //未使用Lambda表达式
        List<String> list = Arrays.asList("南京","天津","东京","北京","重庆","普京");
        List<String> filterString = filterString(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("京");
            }
        });
        System.out.println(filterString);
        //使用Lambda表达式后
        List<String> filterString1 = filterString(list, s -> s.contains("京"));
        System.out.println(filterString1);
    }

    public List<String> filterString(List<String> stringList, Predicate<String> predicate){
        ArrayList<String> strings = new ArrayList<>();
        for (String s : stringList){
            if (predicate.test(s)) {
                strings.add(s);
            }
        }
        return strings;
    }

    /**
     * 方法引用的使用
     * 1. 使用情景：当要传递给lambda体的操作，已经有实现的方法了，可以使用方法引用
     * 2. 方法引用，本质上就是lambda表达式，而lambda表达式作为函数式接口的实例。所以方法引用也是函数式接口的实例
     * 3. 使用格式
     * 类(或对象) :: 方法名
     * 4. 具体分为如下三种情况
     * 对象：：非静态方法(实例方法)
     * 类：：静态方法
     *类：：非静态方法
    * */
    @Test
    public void test3(){

    }
}
