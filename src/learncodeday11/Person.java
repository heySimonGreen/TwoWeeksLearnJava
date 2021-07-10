package learncodeday11;

/**
 * @author: chenwei
 * @date: 2021/7/9 15:07
 */
public class Person {
    String name;
    int age;


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println("eat");
    }
    public void sleep(){
        System.out.println("sleep");
    }
}
