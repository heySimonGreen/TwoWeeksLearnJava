package LearnCode.day1205;

import com.sun.org.apache.bcel.internal.generic.BIPUSH;

import java.math.BigDecimal;

/**
 * @author: chenwei
 * @data: 2020/12/5 17:30
 * 测试基本数据类型
 * 当你不声明的时候，默认小数都用double来表示，所以如果要用float的话，则应该在其后加上f
 * 浮点数不精确，一定不要用于比较
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

        //这下面有问题，8位有效数字到最后一个数字总是不对
        float g = 3.0000017f;
        float h = 3.1234563f;//float精度是8位有效数字，第7位会四舍五入，故第七位是4
        System.out.println("g: " + g);
        System.out.println("h:" + h);
//        float i = g + h;
//        System.out.println(i);

        float a1 = 0.1f;
        double a2 = 1.0/10;
        System.out.println(a1 == a2);
        System.out.println("a1: " + a1);
        System.out.println("a2: " + a2);

        //浮点数一定不要用于比较
        float b1 = 423432423f;
        float b2 = b1 + 1;
        System.out.println("b1: " + b1);
        System.out.println("b2: " + b2);
        System.out.print("b1 == b2: ");
        System.out.println(b1 == b2);
        System.out.println("#################");
        BigDecimal bd = BigDecimal.valueOf(0.1);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println("bd:" + bd);
        BigDecimal bd1 = BigDecimal.valueOf(0.1);
        BigDecimal bd2 = BigDecimal.valueOf(1.0/10);
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd1 == bd2);
        System.out.println(bd1.equals(bd2));
        System.out.println("###############");
        String s = "5fd76dd18f48ed73";
        System.out.println(s.length());
    }
}
