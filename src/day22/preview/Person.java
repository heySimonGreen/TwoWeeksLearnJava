package day22.preview;

/**
 * @author: chenwei
 * @date: 2021/8/17 13:38
 * @description: 描述
 */
public class Person implements Comparable{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //按姓名从小到大排序
    @Override
    public int compareTo(Object o) {
        if (o instanceof Person){
            Person person = (Person) o;
            return this.name.compareTo(((Person) o).getName());
        }
        throw new RuntimeException("Not person can not compareTo");
    }
}
