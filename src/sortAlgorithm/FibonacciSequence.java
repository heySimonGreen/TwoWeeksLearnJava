package sortAlgorithm;

/**
 * @author: chenwei
 * @date: 2021/10/14 20:14
 * @description: 斐波拉切数列，第一个数字为1，第二个数字为1，后面的数字为前两个数字之和
 * 1. 输出第i和数字，以及它前面的数字
 * 2. 输出第i个数字
 */
public class FibonacciSequence {
	public static void main(String[] args) {
		int n=10;
		for (int i=1;i<n;i++){
			System.out.print(getNumber(i)+" ");
		}
		System.out.println();
		for (int i=1;i<n;i++){
			System.out.print(getNumber2(i)+" ");
		}
	}
	public static int getNumber(int n){
		int a=1,b=1;
		int count=2;
		if (n==1||n==2){
			return 1;
		}
		while (n!=count){
			int temp=a+b;
			a=b;
			b=temp;
			count++;
		}
		return b;
	}
	public static int getNumber2(int n){
		if (n==1){
			return 1;
		}
		if (n==2){
			return 1;
		}
		return getNumber2(n-2)+getNumber2(n-1);
	}
}
