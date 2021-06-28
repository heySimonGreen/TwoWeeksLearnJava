package LearnCode.day1210;

import java.util.Map;

/**
 * @author: chenwei
 * @data: 2020/12/11 0:48
 */
public class TestConstructorComputePoint {
    static class Point{
        double x,y;
        Point(double x,double y){
            this.x = x;
            this.y = y;
        }
        public double computeInstance(Point p){
            return Math.sqrt((p.x-x)*(p.x-x)+(p.y-y)*(p.y-y));
        }
        public static void main(String[] args){
            Point point = new Point(3,4);
            Point origin = new Point(0,0);
            System.out.println(origin.computeInstance(point));
        }
    }
}
