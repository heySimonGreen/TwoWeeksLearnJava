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

        /*
        * 1. void add(int index,Object ele) 在index位置插入ele元素
2. boolean addAll(int index,Collection eles) 从index位置开始将eles中的所有元素添加进来
3. Object get(int index) 获取指定index位置的元素
4. int indexOf(Object obj) 返回obj在集合中首次出现的位置
5. int lastIndexOf(Object obj) 返回obj在集合中最后一次出现的位置
6. Object remove(int index) 移除指定位置的元素，并返回此元素
7. Object set(int index,Object ele) 设置指定index位置的元素为ele
8. List subList(int fromIndex,int toIndex) 返回从fromIndex到toIndex位置的左闭右开子集合
        *
        * */
        ArrayList arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(456);
        arrayList.add(new Person("陈伟",24));
        arrayList.add("陈伟");
        arrayList.add("hello world!");
        for (Object o: arrayList) {
            System.out.println(o);
        }
        arrayList.add(0,222);
        for (Object o: arrayList) {
            System.out.println(o);
        }

        ArrayList arrayList2 = new ArrayList();
        arrayList2.add("rrrr");
        arrayList2.add(456);
        arrayList2.add(new Person("陈伟",24));
        arrayList2.add("陈伟");
        arrayList2.add("hello world!");
        arrayList.addAll(3,arrayList2);
        System.out.println("ooooooooooooooooooo");
        for (Object o: arrayList) {
            System.out.println(o);
        }
        System.out.println("ooooooooooooooooooo");
        System.out.println(arrayList.get(4));
        System.out.println("ooooooooooooooooooo");
        System.out.println(arrayList.indexOf(222));
        System.out.println("ooooooooooooooooooo");
        System.out.println(arrayList.lastIndexOf(456));
        System.out.println("ooooooooooooooooooo");
        for (Object o: arrayList) {
            System.out.println(o);
        }
        System.out.println("ooooooooooooooooooo");
        System.out.println(arrayList.remove(4));
        System.out.println("ooooooooooooooooooo");
        for (Object o: arrayList) {
            System.out.println(o);
        }

    }
    @Test
    public void test6(){
        //remove()有两个，一个删除指定位置的元素，一个删除指定对象，当对象是数字时，要使用包装类
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.remove(2);
        arrayList.remove(new Integer(2));
        System.out.println(arrayList);
    }
}
