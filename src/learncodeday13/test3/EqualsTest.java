package learncodeday13.test3;

import com.sun.jmx.snmp.internal.SnmpSubSystem;
import day1109project02.bean.Customer;

import java.util.Date;

/**
 * @author: chenwei
 * @date: 2021/7/13 15:31
 */
public class EqualsTest {
    public static void main(String[] args){
        int i =10;
        int j=10;
        double d = 10.0;
        System.out.println(i==j);
        System.out.println(i==d);
        boolean b = true;
//        System.out.println(i==b);
        char c =10;
        System.out.println(i==c);//相等
        char c1 = 'A';
        char c2 = 65;
        System.out.println(c1 == c2);

        //引用类型
        Customer customer1 = new Customer("chenwei",'男',34,"3333","323");
        Customer customer2 = new Customer("chenwei",'男',34,"3333","323");
        System.out.println(customer1==customer2);
        String str1 = new String("chenwei");
        String str2 = new String("chenwei");
        System.out.println(str1==str2);
        System.out.println("*****************");
        System.out.println(customer1.equals(customer2));
        System.out.println(str1.equals(str2));
        Date date1 = new Date(12345678912L);
        Date date2 = new Date(12345678912L);
        System.out.println(date1.equals(date2));

    }
}
