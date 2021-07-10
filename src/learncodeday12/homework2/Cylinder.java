package learncodeday12.homework2;

/**
 * @author: chenwei
 * @date: 2021/7/9 16:52
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double findVolume(){
        return Math.PI*getRadius()*getRadius();
//        return length*findArea();
    }

    @Override
    public double findArea() {
        return ((Math.PI*getRadius()*getRadius()*2) + Math.PI*2*getRadius()*length);
    }
}
