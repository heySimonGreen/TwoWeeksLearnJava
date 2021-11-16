package swordfingeroffer;

/**
 * @author: chenwei
 * @date: 2021/10/23 2:37
 * @description: 描述
 */
public class Interview3 {
	public static void main(String[] args) {
		SingleTone obj = SingleTone.getInstance();
		System.out.println("SingleTone.counter1="+SingleTone.counter1);
		System.out.println("SingleTone.counter2="+SingleTone.counter2);
	}
}
class SingleTone{
	private static SingleTone obj = new SingleTone();
	/*下面这两句不一样，执行*/
	public static int counter1;
	public static int counter2=0;
	private SingleTone(){
		counter1++;
		counter2++;
	}
	public static SingleTone getInstance(){
		return obj;
	}
}
