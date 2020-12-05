package LearnCode.day1127;

import LearnCode.day2.Dog;
import LearnCode.day2.Hound;

import java.util.Random;

/**
 * @author: chenwei
 * @data: 2020/11/27 16:12
 */
public class Test1 {
    public  static void  main(String args[]){

        Hound hound = new Hound();
        hound.sniff();
        hound.bark();
        Random random = new Random(47);
        System.out.println(random.nextInt(100));
//        String s1 = new String("chenwei");
//        String s2 = new String("chenwei");
//        System.out.println(s1 == s2);

        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hel" + "lo";
        String s4 = "Hel" + new String("lo");
        String s5 = new String("Hello");
        String s6 = s5.intern();
        String s7 = "H";
        String s8 = "ello";
        String s9 = s7 + s8;
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s9);
        System.out.println(s4 == s5);
        System.out.println(s1 == s6);
    }
}
