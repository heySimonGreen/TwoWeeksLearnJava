package LearnCode.day1207;

/**
 * @author: chenwei
 * @data: 2020/12/7 23:02
 */
public class TestPlusPlus {
    public static void main(String[] args){
        int a = 10;
        int c = 10;
//        int b = a++ + 6 + c++;
        int e = --a + 6 + --c;
        System.out.println(a);
//        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println("################");

        //位运算符 >>右移除以二 <<左移乘以二  ~取反符 ^异或符
        int i = 4>>1;
        int j = -1;
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i>>1));
        System.out.println(Integer.toBinaryString(j));
        String s = "11111111111111111111111111111111";
        //String类中常用的方法。
        System.out.println("s.intern():" + s.intern());//返回，一个字符串，内容与此字符串相同，但一定取自具有唯一字符串的池。
        String testIntern1 = new String("chenwei");
        String testIntern2 = new String("chenwei");
        System.out.println(testIntern1.intern());
        System.out.println(testIntern2.intern());

        System.out.println(s.length());
        System.out.println(Integer.SIZE);
        System.out.println(Integer.numberOfLeadingZeros(24));
        System.out.println(Integer.toBinaryString(24>>>16));
        System.out.println(Integer.toBinaryString(-5));
        System.out.println("############");
        int k =3;//011
        int l =4;//100
        System.out.println(k & l);//与
        System.out.println(k ^ l);//异或
        System.out.println(k | l);//或
        System.out.println(~k);//取反
        System.out.println(~l);

    }
}
