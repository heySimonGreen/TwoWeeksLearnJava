package LearnCode20210630.String;

/**
 * @author: chenwei
 * @date: 2021/7/6 14:10
 */
public class Day0921RecursionTest2 {
    public static void main(String[] args){
        Day0921RecursionTest2 day0921RecursionTest2 = new Day0921RecursionTest2();
        System.out.println(day0921RecursionTest2.testRecursion(10));
        System.out.println(day0921RecursionTest2.fibonacci(10));

    }
    public int testRecursion(int n){
        if(n == 0){
            return 1;
        }else if(n == 1){
            return 4;
        }else{
            return 2*testRecursion(n-1) + testRecursion(n-2);
        }
    }
    public int fibonacci(int n){
        if(n == 1 || n == 2){
            return 1;
        }else return fibonacci(n-1) + fibonacci(n-2);
    }
}
