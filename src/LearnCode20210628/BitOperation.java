package LearnCode20210628;
/*
* 位运算，面试题，最快的计算16除以8的计算方式，16>>3,在看源代码的时候有看到过Java编写源代码的人写这种位运算
*
*
* */
public class BitOperation {
    public static void main(String args[]){
        int a = -21;
        int b = 21;
        int c = 16;
        System.out.println("chenwei");
        System.out.println("a << 1 ="+( a << 1 ));
        System.out.println("a >> 1 ="+( a >> 1 ));
        System.out.println("b << 1 ="+( b << 1 ));
        System.out.println("b >> 1 ="+( b >> 1 ));
        System.out.println("c >> 3 ="+( c >> 3 ));
        //自动类型提升
        byte bb = 2;
        byte cc = 2;
        //short i = bb + cc;//编译不通过
//        System.out.println(i);
    }
}
