package learncodeday12.test1;

/**
 * @author: chenwei
 * @date: 2021/7/9 17:30
 */
public class Student extends Person{
    String major;

    public Student() {
    }

    public Student(String major) {
        this.major = major;
    }
    public void study(){
        System.out.println("study major is " + major);
    }

    @Override
    public void eat(){
        System.out.println("eat for student");
    }
}
