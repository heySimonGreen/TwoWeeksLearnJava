package LearnCode20210630.String;

/**
 * @author: chenwei
 * @date: 2021/7/5 21:53
 */
public class day0920ArgsAsObject {
    public static void main(String[] args){
        System.out.println("Radius           Area");
        Circle circle = new Circle();
        PassObject passObject = new PassObject();
        passObject.printAreas(circle,5);
    }

}
class Circle{
    public double radius;
    public double findAreas(){
        return Math.PI*radius*radius;
    }
}
class PassObject{
    public void printAreas(Circle circle,int time){
        for(int i =1;i<=time;i++){
            circle.radius = i;
            System.out.println((double) (circle.radius) + "           " + circle.findAreas());
        }
    }
}
