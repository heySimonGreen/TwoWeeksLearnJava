package learncodeday13.practice6;

/**
 * @author: chenwei
 * @date: 2021/7/13 14:18
 */
public class InterviewTest1 {
    public static void main(String[] args){
        //多态
        Base1 base = new Sub1();
        //虚拟方法调用
        base.add(1,2,3);
        Sub1 sub1 = (Sub1) base;
        //确定的优先调用
        sub1.add(12,3,4);
    }
}
class Base1{
    public void add(int a,int...arr){
        System.out.println("base1");
    }
}
class Sub1 extends Base1{
    @Override
    public void add(int a, int[] arr){
        System.out.println("sub_1");
    }
    public void add(int a,int b,int c){
        System.out.println("sub_2");
    }
}
