package LearnCode20210630.String;

/**
 * @author: chenwei
 * @date: 2021/7/1 19:38
 */
/*
* switch(表达式)：这里的表达式只能是这六种byte short char int string 枚举这六种
* case 常量1：
* 执行语句；
* break;
* case 常量1：
* 执行语句；
* break;
* */
public class SwitchCaseTest {
    /*
    * 根据switch表达式中的值，一次匹配各个case中的常量。一旦匹配成功，则进入相应case结构中，调用其执行语句
    * 当调用完执行语句后，则仍然继续向下执行其它case结构中的执行语句，直到遇到break关键字或此switch-case
    * 结构末尾结束为止。
    * */
    /*
    *
    * */
    public static void main(String[] a){
        int num = 8;
        switch (num){
            case 0:
                System.out.println(0);
                break;
            case 2:
                System.out.println(2);
                break;
            case 8:
                System.out.println(8);
                break;
            default:
                System.out.println("not 0 2 8");
        }
    }
}
