package learncode20210706day10basic;

/**
 * @author: chenwei
 * @date: 2021/7/7 15:56
 */
public class TriAngleTest {
    public static void main(String[] args){
        TriAngle triAngle = new TriAngle();
        triAngle.setBase(8);
        triAngle.setHeight(8);
        System.out.println("the area is " + (triAngle.getBase() * triAngle.getHeight()) * 0.5);
    }
}
