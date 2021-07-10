package learncodeday11;

/**
 * @author: chenwei
 * @date: 2021/7/9 15:12
 */
public class ExtendsTest {
    public static void main(String[] args){
        Person person = new Person("chenwei",33);
        person.eat();

        Student student = new Student();
        student.eat();
        student.study();
        student.name = "mick";
    }
}
