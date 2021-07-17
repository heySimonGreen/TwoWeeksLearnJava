package learncodeday14;

/**
 * @author: chenwei
 * @date: 2021/7/15 22:16
 */
public class BlockTest {
    public static void main(String[] args){
        String str = Person.desc;
        System.out.println(str);
        System.out.println("******************");
        Person person = new Person();
    }

}
class Person{
    //属性

    String name;
    int age;
    static String desc = "我是一个人";
    //构造器

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //方法

    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //非静态代码块
    {
        System.out.println("非静态代码块1");
        age = 1;
    }
    {
        System.out.println("非静态代码块2");
    }
    //静态代码块
    static {
        System.out.println("静态代码块1");
    }
    static {
        System.out.println("静态代码块2");
        desc = "我是一个爱学习的人";
    }
}
