package learncodeday13.practice6;

/**
 * @author: chenwei
 * @date: 2021/7/13 12:23
 */
public class GeometricTest {
    public boolean equalsArea(GeometricObject geometricObject1,GeometricObject geometricObject2){
        return geometricObject1.findArea() == geometricObject2.findArea();
    }
    public void displayGeometricObject(GeometricObject geometricObject){
        System.out.println(geometricObject.findArea());
    }
    public static void main(String[] args){
        GeometricObject geometricObject = new Circle("red",0,44);
        GeometricObject geometricObject2 = new MyRectangle("red",0,44,30);
        GeometricTest geometricTest = new GeometricTest();
        System.out.print("geometricObject2面积为：");
        geometricTest.displayGeometricObject(geometricObject2);
        System.out.print("geometricObject面积为：");
        geometricTest.displayGeometricObject(geometricObject);
        System.out.println(geometricTest.equalsArea(geometricObject,geometricObject2));
    }
}
class GeometricObject{
    private String color;
    private double weight;

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0;
    }
}
class Circle extends GeometricObject{
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI*radius*radius;
    }
}
class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(String color, double weight, double width, double height) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return this.height * this.width;
    }
}
