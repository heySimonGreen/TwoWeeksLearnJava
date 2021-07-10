package LearnCode20210630.String;

import java.util.Random;

/**
 * @author: chenwei
 * @date: 2021/7/4 19:32
 */
public class Day08homework3 {
    public static void main(String[] args){
        int N = 50;
        Student[] students = new Student[N];
        Random random = new Random();
        for(int i = 0;i<N;i++){
            students[i] = new Student();
            students[i].setNumber(i+1);
            students[i].setState(random.nextInt(6)+1);
            students[i].setScore(random.nextInt(100)+1);
        }
        for(int i =0;i<N;i++){
            System.out.println(students[i].toString());
        }
        System.out.println("班级为3的学生信息");
        for(int i =0;i<N;i++){
            if (students[i].getState() == 3){
                System.out.println(students[i].toString());
            }
        }
        System.out.println("排序后的结果");
        for(int i = 0;i<N-1;i++){
            boolean flag = false;
            for(int j = 0;j<N-i-1;j++){
                if(students[j].getScore() > students[j+1].getScore()){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                    flag = true;
                }
            }
            if(flag = false){
                break;
            }
        }
        for(int i =0;i<N;i++){
            System.out.println(students[i].toString());
        }
    }
}
