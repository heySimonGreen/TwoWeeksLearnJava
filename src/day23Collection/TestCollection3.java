package day23Collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author: chenwei
 * @date: 2021/8/24 17:25
 * @description: 描述
 */
public class TestCollection3 {
    @Test
    public void treeSet(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    Person p1 = (Person) o1;
                    Person p2 = (Person) o2;
                    if (p1 == p2){
                        return 0;
                    }else {
                        if (p1.getName().equals(p2.getName())){
                            if (p1.getAge() == p2.getAge()){
                                return 0;
                            }else {
                                return p1.getAge() - p2.getAge();
                            }
                        }else {
                            return p1.getName().compareTo(p2.getName());
                        }
                    }
                }else {
                    throw new RuntimeException("不是同一个对象" + getClass().getName());
                }
            }
        };
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.add(new Person("陈伟",24));
        treeSet.add(new Person("陈伟",22));
        treeSet.add(new Person("陈伟",26));
        treeSet.add(new Person("陈伟",26));
        treeSet.add(new Person("陈大大",24));
        System.out.println(treeSet);
    }
}
