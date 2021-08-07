package day20usualclass1;

/**
 * @author: chenwei
 * @date: 2021/8/8 1:49
 * @description: 描述
 */
public class SingleThreadLanHan {
    private int number;

    private SingleThreadLanHan(int number) {
        this.number = number;
    }

    private static SingleThreadLanHan singleThreadLanHan=null;
    public static synchronized SingleThreadLanHan getInstance(int number){
        if (singleThreadLanHan == null){
            singleThreadLanHan=new SingleThreadLanHan(number);
        }
        return singleThreadLanHan;
    }
}
