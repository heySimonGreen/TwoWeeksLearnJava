package day23Collection;

import org.junit.Test;

import java.util.*;

/**
 * @author: chenwei
 * @date: 2021/8/22 1:03
 * @description: 描述
 */
public class TestCollection2 {
    @Test
    public void methodCollection(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(1235);
        collection.add("陈伟");
        collection.add(new String("陈伟"));
        collection.add(new Person("陈大大",24));
        //contains() 如果此集合包含指定的元素，则返回 true,这里比较时会调用equals方法，所以在自己写的类中一定要重写equals方法
        boolean isContain = collection.contains(new Person("陈大大",24));
    System.out.println(isContain);

        //containsAll()如果此集合包含指定 集合中的所有元素，则返回true。
        Collection collection1 = new ArrayList();
        collection1.add(123);
        collection1.add(1235);
        System.out.println(collection.containsAll(collection1));
    }
    @Test
    public void test3(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(1234);
        collection.add(1235);
        collection.add(1236);
        //集合 --> 数组
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
        //数组 --> 集合
        List<Integer> integers = Arrays.asList(new Integer[]{123, 4234, 342});
        System.out.println(integers.size());
    }
    @Test
    public void test4(){
        Collection collection = new ArrayList();
        collection.add(123);
        collection.add(1234);
        collection.add(1235);
        collection.add(1236);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object c : collection){
            System.out.println(c);
        }
        //foreach遍历面试题
        String[] str = new String[]{"fsd","sdaf","asdf"};
        //会改变
        for (int i=0;i<str.length;i++){
            str[i] = "ffff";
        }
        //不会改变
        for (String s : str){
            s = "fffff";
        }
        for (String s:str ) {
            System.out.println(s);
        }
    }
    @Test
    public void test5(){
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();
    }
}
