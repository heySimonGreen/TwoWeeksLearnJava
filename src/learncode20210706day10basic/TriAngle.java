package learncode20210706day10basic;

/**
 * @author: chenwei
 * @date: 2021/7/7 15:53
 */
public class TriAngle {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public TriAngle(){
        System.out.println("this is constructor TriAngle");
    }

    public TriAngle(double height,double base){
        this.height = height;
        this.base = base;
    }
}
