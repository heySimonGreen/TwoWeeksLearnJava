package LearnCode.day2;

/**
 * @author: chenwei
 * @data: 2020/11/25 15:11
 */
public class Test1 {
    public static void main(String[] args){
        System.out.println("chenwei");
//        System.out.println(args[0]);
        Dog dog = new Hound();
        dog.bark();
        Hound hound = new Hound();
        hound.bark();
        hound.sniff();

    }
}
