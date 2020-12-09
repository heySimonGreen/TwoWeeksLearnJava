package LearnCode.day1208;

/**
 * @author: chenwei
 * @data: 2020/12/8 17:27
 */
public class TestTypeConvert {
    public static void main(String[] args){
        //强制类型转换
        int money = 1000000000;
        int year = 200;
        int a = money*year;//计算的结果超过了int范围，产生了溢出
        long b = money*year;//这里接收的任然是int,还是超过了范围
        long c = money*(long)year;//强制类型转换，计算的类型里面只要有一个为long结果就是long，不会有溢出情况
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        long d = 1000000000*300L;//这样也不会溢出，应为200为long类型
        System.out.println(d);
    }
}
