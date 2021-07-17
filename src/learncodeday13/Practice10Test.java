package learncodeday13;

import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

/**
 * @author: chenwei
 * @date: 2021/7/14 13:54
 */
public class Practice10Test {
    @Test
    public static void main(String[] args){
        int n=0;
        System.out.println("chenwei");
//        Vector<Integer> vector = new Vector<Integer>();
        Vector vector = new Vector();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int score = scanner.nextInt();
//            Integer score = scanner.nextInt();
            if (score < 0){
                break;
            }
            vector.addElement(score);
            vector.add(score);
            n=n+1;
        }
        int max=0;
        for (int i=0;i<n;i++){
            int num = (int) vector.get(i);
            if (max<num){
                max = num;
            }
        }
        System.out.println(max);
        System.out.println(vector.size());
        System.out.println("capacity= " + vector.capacity());

        for (int i = 0;i<n;i++){
            int difference = max-(int)vector.get(i);
            if (difference<=10){
                System.out.println("A");
            }else if (difference<=20){
                System.out.println("B");
            }else if (difference<=30){
                System.out.println("C");
            }else {
                System.out.println("D");
            }
        }
    }
    public void test10(){
    }
}
