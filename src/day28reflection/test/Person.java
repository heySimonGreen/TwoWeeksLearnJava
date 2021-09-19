package day28reflection.test;

/**
 * @author: chenwei
 * @date: 2021/9/16 21:22
 * @description: 描述
 */
@MyAnnotation("class")
public class Person extends Creature<String> implements Comparable<String>,MyInterface{
    private String name;
    int age;
    public int id;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @MyAnnotation("class")
    private String showNation(String nation){
        System.out.println("my nation is " + nation);
        return nation;
    }
    @MyAnnotation("class")
    public String display(String interests){
        return "my interests is " + interests;
    }

    @Override
    public void info() {
        System.out.println("Person");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }
    private static void showDetail(){
        System.out.println("wo shi yi ge ke ai de ren");
    }
}
