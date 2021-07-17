package learncodeday14;

import javax.swing.plaf.ComponentUI;
import java.util.Vector;

/**
 * @author: chenwei
 * @date: 2021/7/15 14:12
 */
public class CircleTest {
    public static void main(String[] args){
        Vector vector = new Vector();
        for (int i=0;i<3;i++){
            Circle circle1 = new Circle(i);
            vector.addElement(circle1);
        }
        Circle.getTotalAndInit();
        for (int i = 0;i<vector.size();i++){
            System.out.println("radius: "+ ((Circle)(vector.get(i))).getRadius());
            System.out.println("id: "+ ((Circle)(vector.get(i))).getId());
        }
    }
}
class Circle{
    private double radius;
    private int id;
    private static int total; //记录创建圆的个数
    private static int init = 1001;     //static修饰的属性被所有对象共享

    public Circle() {
        id = init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static void getTotalAndInit(){
        System.out.println("total: "+total);
        System.out.println("init: "+init);
    }
}
