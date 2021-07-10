package LearnCode20210630.String;

/**
 * @author: chenwei
 * @date: 2021/7/6 13:16
 */
public class Day0921RecursionTest {
    int i=0;
    public static void main(String[] ags){
        Day0921RecursionTest day0921RecursionTest = new Day0921RecursionTest();
        System.out.println(day0921RecursionTest.getSum(100));

    }
    public int getSum(int n){
        if(n == 1){
            return 1;
        }
        else {
            return n+getSum(n-1);
        }
    }
}
