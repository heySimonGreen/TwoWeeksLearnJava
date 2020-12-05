package LearnCode.day1205;

/**
 * @author: chenwei
 * @data: 2020/12/5 17:30
 * 测试基本数据类型
 */
public class TestBasicDataType {
    public static void main(String[] args){
        int a = 15;
        int b = 015;
        int c = 0x15;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        byte age = 100;
        short salary = 30000;
        int population = 30000000;
        long globalPopulation = 30000000000L; //后面加L表示这是一个长整型

        float d = 3.14F;
        double e = 3.14;
        double f = 314E-2;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        float g = 3.1f;
    }
}
