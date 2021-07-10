package LearnCode20210630.String;

/**
 * @author: chenwei
 * @date: 2021/7/4 18:38
 */
public class Day08homework {
    int method(int m,int n){
        int x = m;
        int y = n;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        return x*y;
    }
    public static void main(String[] args){
        Day08homework day08homework = new Day08homework();
        int area = day08homework.method(10,8);
        System.out.println(area);
    }
}
