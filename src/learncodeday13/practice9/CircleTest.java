package learncodeday13.practice9;

/**
 * @author: chenwei
 * @date: 2021/7/13 21:59
 */
public class CircleTest {
    public static void main(String[] args){
        Circle circle1 = new Circle("red",12.0,33);
        Circle circle2 = new Circle("red",12.0,33);
        if (circle1.getColor().equals(circle2.getColor())){
            System.out.println("color same");
        }else {
            System.out.println("color not same");
        }
        if(circle1.equals(circle2)){
            System.out.println("radius same");
        }else {
            System.out.println("radius not same");
        }
    }
}
