package learncodeday12.homework2;

/**
 * @author: chenwei
 * @date: 2021/7/9 17:11
 */
public class CylinderTest {
    public static void main(String[] args){
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2.1);
        cylinder.setLength(3.4);
        System.out.println(cylinder.findVolume());
        //园的底面积，没有重写findArea时
        System.out.println(cylinder.findArea());
        //重写findArea后
        double area = cylinder.findArea();
        System.out.println("圆柱的表面积: " + area);
    }
}
