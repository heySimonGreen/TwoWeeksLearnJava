package LearnCode20210630.String;

/**
 * @author: chenwei
 * @date: 2021/7/5 12:56
 */
/*
*
* ### 8 方法重载
*#### 8.1 定义：在同一个类中，允许存在一个以上的同名方法，只要他们的参数个数或者参数类型不同即可
*1. ”两同一不同“：同一个类、相同方法名；参数列表不同，参数个数不同，参数类型不同。
*2. 举例：Arrays类中重载的sort() / binarySearch()
*. 判断是否是重载：跟方法的权限修饰符、返回值类型、形参变量名、方法体都没关系
*4. 在通过对象调用方法时，如何确定某一个指定的方法：方法名 ---> 参数列表
*/
public class Day09OverloadTest {
    public static void main(String[] args){
        Day09OverloadTest day09OverloadTest = new Day09OverloadTest();
        day09OverloadTest.getSum(3,12);
        day09OverloadTest.getSum("fsfd");
        day09OverloadTest.getSum(3.2,5); //自动类型提升
//        day09OverloadTest.show("fsda","fasdfs");
        day09OverloadTest.show(new String[]{"ff","wr","ga"});

    }
    public int getSum(int a,int b){
        System.out.println(a);
        return 1;
    }
    public void getSum(double a,int b){
        System.out.println("void");
    }
    public String getSum(String s){
        System.out.println("getSum(String s)");
        return "getSum(String s)";
    }
    /*
    * 可变形参jdk5.0新特性,调用和数组调用一样
    * */
//    public void show(String ... strs){
//        System.out.println("String ... strs");
//        System.out.println(strs);
//        System.out.println(strs[0]);
//    }
    //jdk5.0以前要传入多个参数是下面的写法，但要调用的时候必须New一个数组day09OverloadTest.show(new String[]{"ff","wr","ga"});
    public void show(String[] strs){
        System.out.println(strs);
    }
}
