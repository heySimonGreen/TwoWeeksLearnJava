package learncodeday12.test1;

/**
 * @author: chenwei
 * @date: 2021/7/9 17:30
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
    public void walk(int distance){
        System.out.println("walk " + distance + " mills");
    }
}
