package LearnCode.day1.Operators;

/**
 * @author: chenwei
 * @data: 2020/11/24 21:42
 */
class Tank{
    int level;
}
public class Evaluation {
    public static void main(String args[]){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 21;
        t2.level = 59;
        System.out.println("t1.level:" + t1.level + "   t2.level:" + t2.level);
        t1 = t2;
        System.out.println("t1.level:" + t1.level + "   t2.level:" + t2.level);
        t2.level = 27;
        System.out.println("t1.level:" + t1.level + "   t2.level:" + t2.level);
    }
}
