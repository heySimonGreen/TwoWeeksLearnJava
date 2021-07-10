package learncodeday12.testembellishmentsymbol;

/**
 * @author: chenwei
 * @date: 2021/7/9 23:03
 */
public class Person {
    String name;
    int age;
    int id=1001;

    public Person(){
        System.out.println("我无处不在");
    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name,int age){
        this(name);
        this.age = age;
    }

    public void eat(){
        System.out.println("人：吃饭");
    }
    public void walk(){
        System.out.println("人：走路");
    }
}
