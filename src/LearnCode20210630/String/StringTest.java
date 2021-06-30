package LearnCode20210630.String;

/**
 * @Author chenwei
 * @Date 2021/6/30 16:28
 * @Version 1.0
 */
public class StringTest {
    public static void main(String[] a){
        char c = 'a'; //97 A:65
        int num = 10;
        String str = "hello";
        //练习1
        System.out.println(c + num +str);
        System.out.println(c + str +num);
        System.out.println(c + (num +str));
        System.out.println((c + num) +str);
        System.out.println(str + num +c);
        //char在做连接运算时是字符，在和整型做运算时是数字,这就是为什么字符+数字等于数字了
        char aa = '*';
        char bb = '\t';
        System.out.println(aa + 0);
        System.out.println(bb + 0);
        System.out.println(bb);
        System.out.println("dsfadfa");
        //练习2
        System.out.println("*  *");
        System.out.println('*' + '\t' + '*');
        System.out.println('*' + "\t" + '*');
        System.out.println('*' + '\t' + "*");
        System.out.println('*' + ('\t' + "*"));
        /*
        * 1.*  *
        * 2.93
        * 3.*\t*
        * 4.51*
        * 5.* *
        * */
    }
}
