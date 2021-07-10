package learncodeday12.testembellishmentsymbol;

/**
 * @author: chenwei
 * @date: 2021/7/9 23:07
 */
public class Student extends Person{
    String major;
    int id = 1002;
    public Student(){

    }

    public Student(String major) {
        this.major = major;
    }

    public Student(String name, int age, String major, int id) {
        super(name, age);
        this.major = major;
        this.id = id;
    }

    @Override
    public void eat() {
        System.out.println("学生，多吃有营养的食物");
    }
    public void study(){
        System.out.println("学生：学习知识");
        this.eat();
        this.show();
    }

    @Override
    public void walk() {
        System.out.println("学生：学习知识");
    }

    public void show(){
        System.out.println("name=" + name+" age=" + age);
        System.out.println("id=" + id);
        System.out.println("super.id=" + super.id);
    }
}
