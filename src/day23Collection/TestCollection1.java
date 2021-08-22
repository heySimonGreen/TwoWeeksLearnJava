package day23Collection;

import org.junit.Test;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @author: chenwei
 * @date: 2021/8/21 22:51
 * @description: 描述
 */
public class TestCollection1 {
    @Test
    public void CollectionMethodTest(){
        Collection collection = new ArrayList();
        //add() 将元素添加到collection中
        collection.add("陈伟");
        collection.add(123);
        collection.add(new Date());
        collection.add("陈伟2");
        //size()返回集合中元素个数
        System.out.println(collection.size());
        Collection collection1 = new ArrayList();
        collection1.add("8976");
        //addAll()将指定集合中的所有元素添加到此集合
        collection.addAll(collection1);
        System.out.println(collection.size());
    }
}
