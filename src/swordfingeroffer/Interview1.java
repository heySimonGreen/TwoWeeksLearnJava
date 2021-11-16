package swordfingeroffer;

/**
 * @author: chenwei
 * @date: 2021/10/22 0:27
 * @description: 描述
 */
public class Interview1 {
	public static void main(String[] args) {
		Integer a1 = new Integer((123));
		int a2 = new Integer(123);
		Integer a3 = new Integer(123);
		Integer a4 = 123;
		int a5 = 123;
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a1==a4);
		System.out.println(a1==a5);
		System.out.println(a2==a4);
	}
}
