package LearnCode.day1201;

import java.util.Random;

/**
 * @author: chenwei
 * @data: 2020/12/1 23:01
 */
public class ForInFloat {
    public static void main(String args[]){
        float[] a = new float[10];
        System.out.println("chenwei");
        Random random = new Random(47);
        System.out.println(random.nextFloat());
        for(int i=0;i<10;i++){
            a[i] = random.nextFloat();
        }
        for(float x:a){
            System.out.println(x);
        }
    }
}
