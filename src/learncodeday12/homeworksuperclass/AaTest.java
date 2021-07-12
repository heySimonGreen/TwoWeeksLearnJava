package learncodeday12.homeworksuperclass;

/**
 * @author: chenwei
 * @date: 2021/7/12 17:30
 */
public class AaTest {
    public static void main(String[] args){
        String s1 = "abc";
        String s2 = new String("def");
        String s3 = s1 + s2;
        String s4 = "abcdef";
        if(s4.equals(s3)){
            System.out.println("s4.equals(s3)");
        }else {
            System.out.println("s4.not equals(s3)");
        }
        System.out.println("________________________");
        if (s4 == s3){
            System.out.println("s4 == s3");
        }else {
            System.out.println("s4 !== s3");
        }
    }
}
