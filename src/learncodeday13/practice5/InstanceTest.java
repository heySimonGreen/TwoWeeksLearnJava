package learncodeday13.practice5;

import org.junit.Test;

/**
 * @author: chenwei
 * @date: 2021/7/13 11:52
 */
class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name:" + name + "\n" + "age: " + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    @Override
    public String getInfo() {
        return "Name:" + name + "\n" + "\nage: " + age + "\nschool: " + school;
    }
}

class Graduate extends Student {
    public String major = "IT";

    @Override
    public String getInfo() {
        return "Name:" + name + "\n" + "age: " + age + "\nschool: " + school
                + "\nmajor: " + major;
    }
}

/**
 * @author 11839
 */
public class InstanceTest {
    @Test
    public static void main(String[] args) {
        Person p1 = new Graduate();
        Person p2 = new Student();
        Person p3 = new Person();
        method(p1);
        System.out.println("***************");
        method(p2);
        System.out.println("***************");
        method(p3);
        System.out.println("***************");

    }

    public static void method(Person person) {
        //虚拟方法调用
        String info = person.getInfo();
        System.out.println(info);

        if (person instanceof Graduate) {
            System.out.println("a graduate\na student\na person");
        } else if (person instanceof Student) {
            System.out.println("a student\na person");
        } else {
            System.out.println("a person");
        }
    }

}
