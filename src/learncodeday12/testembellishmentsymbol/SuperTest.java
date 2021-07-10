package learncodeday12.testembellishmentsymbol;

/**
 * @author: chenwei
 * @date: 2021/7/9 23:15
 */
public class SuperTest {
    public static void main(String[] args){
        Student student = new Student();
        student.show();
        System.out.println();
        student.study();
        Student student1 = new Student("tom",21,"it",99);
        student1.show();
    }
}
