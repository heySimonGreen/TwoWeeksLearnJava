package learncodeday13.test1;

/**
 * @author: chenwei
 * @date: 2021/7/11 22:18
 */
public class Person {
    String name;
    private int age;
    int id = 1001;

    public void eat(){
        System.out.println("人，吃饭。");
    }
    public void walk(){
        System.out.println("人，走路。");
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
}
