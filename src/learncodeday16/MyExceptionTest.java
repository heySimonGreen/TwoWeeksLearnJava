package learncodeday16;

import org.junit.Test;

/**
 * @author: chenwei
 * @date: 2021/7/26 13:08
 */
public class MyExceptionTest {

    @Test
    public void test(){
        Student student = new Student();
        try {
            student.register(-8);
        } catch (MyExcepiton myExcepiton) {
            System.out.println(myExcepiton.getMessage());
        }
    }
}
