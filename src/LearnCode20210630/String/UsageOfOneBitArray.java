package LearnCode20210630.String;

import java.util.Scanner;

/**
 * @author: chenwei
 * @date: 2021/7/2 22:26
 */
public class UsageOfOneBitArray {
    public static void main(String[] a){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input student's number");
        int n = scanner.nextInt();
        System.out.println("please input " + n + " student");
        int[] arrStudents = new int[n];
        int max = 0;
        for(int i = 0;i<n;i++){
            arrStudents[i] = scanner.nextInt();
            if(max < arrStudents[i]){
                max = arrStudents[i];
            }
        }
        System.out.println("max marks is " + max);
        for(int i = 0;i<n;i++){
            System.out.print("student " + i + "score is " + arrStudents[i] + " grade is ");
            if(arrStudents[i]>=max-10){
                System.out.println("A");
            }else if(arrStudents[i]>=max-20){
                System.out.println("B");
            }else if(arrStudents[i]>=max-30){
                System.out.println("C");
            }else {
                System.out.println("D");
            }
        }
    }
}
