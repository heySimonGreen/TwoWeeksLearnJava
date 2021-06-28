package LearnCode.day1210;

/**
 * @author: chenwei
 * @data: 2020/12/11 0:31
 */
public class SxtStu {
    int id;
    String name;
    int age;
    Computer comp;

    void study(){
        System.out.println("i am studying now");
    }
    void play(){
        System.out.println("i am playing now");
    }
    SxtStu(){
    }
    static class Computer{
        String brand;
    }

    public static void main(String[] args){
        SxtStu stu = new SxtStu();
        stu.id=100;
        stu.name="chenwei";
        stu.age=23;

        Computer c1 = new Computer();
        c1.brand="lenovo";
        stu.comp = c1;
        stu.play();
        stu.study();
    }

}
