package swordfingeroffer;

/**
 * @author: chenwei
 * @date: 2021/10/22 0:31
 * @description: 描述
 */
public class Interview2 {
	public static void main(String[] args) {
		Integer a1 = new Integer((200));
		int a2 = new Integer(200);
		Integer a3 = new Integer(200);
		Integer a4 = 200;
		int a5 = 200;
		System.out.println(a1==a2);
		System.out.println(a1==a3);
		System.out.println(a1==a4);
		System.out.println(a1==a5);
		System.out.println(a2==a4);
		new Derived("chenwei");
	}
}

class Base{
	public Base(String s){
		System.out.println("B");
	}
}
class Derived extends Base{
	public Derived(String s){
		super(s);
		System.out.println("D");
		}
}