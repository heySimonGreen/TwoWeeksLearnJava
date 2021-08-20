package day22.preview;

import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * @author: chenwei
 * @date: 2021/8/17 12:58
 * @description: 每日一题
 * 1。 将字符串“2017-08-09”转换位对应java.sql.Date对象。使用jdk8之前之后都可以
 */
public class Preview1 {
    @Test
    public void oneTest() throws ParseException {
        String s = "2017-08-09";
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date parse = simpleDateFormat.parse(s);
        java.sql.Date date_sql = new java.sql.Date(parse.getTime());
    System.out.println(parse);
    }

    @Test
    public void threeTest(){
        Person[] people = new Person[6];
        people[0] = new Person("chenwei", 24);
        people[1] = new Person("dhenwei", 24);
        people[2] = new Person("ahenwei", 24);
        people[3] = new Person("chenwei", 24);
        people[4] = new Person("hhenwei", 24);
        people[5] = new Person("dhenwei", 24);
        Arrays.sort(people);
    System.out.println(Arrays.toString(people));
    }
    @Test
    public void fourTest(){
        Person[] people = new Person[6];
        people[0] = new Person("chenwei", 20);
        people[1] = new Person("dhenwei", 64);
        people[2] = new Person("ahenwei", 14);
        people[3] = new Person("chenwei", 64);
        people[4] = new Person("hhenwei", 34);
        people[5] = new Person("dhenwei", 29);
        Arrays.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1 instanceof Person && o2 instanceof Person){
                    if (o1.getAge() > o2.getAge()){
                        return -1;
                    }else if (o1.getAge() < o2.getAge()){
                        return 1;
                    }
                    return 0;
                }
                throw new RuntimeException("can not compareTo");
            }
        });
    System.out.println(Arrays.toString(people));
    }
}
