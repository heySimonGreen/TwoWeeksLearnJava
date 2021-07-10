package learncodeday11;

/**
 * @author: chenwei
 * @date: 2021/7/9 15:08
 */
public class Student extends Person{
    String major;
    public Student(){
    }

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void study(){
        System.out.println("STUDY");
    }
}
