package day29reflectionusing.optional;

import org.junit.Test;

import java.util.Optional;

/**
 * @author: chenwei
 * @date: 2021/9/20 2:06
 * @description: Optional类：为了在程序中避免出现空指针异常而创建的
 */
public class OptionalTest {
	@Test
	public void test1(){
		Girl girl = new Girl();
		//of(T t):保证t是非空的
//		girl=null;
		Optional<Girl> optionalGirl = Optional.of(girl);
		System.out.println(optionalGirl);
	}
	@Test
	public void test2(){
		Girl girl = new Girl();
		girl=null;
		//ofNullable(T t)：t可以为null
		Optional<Girl> optionalGirl = Optional.ofNullable(girl);
		System.out.println(optionalGirl);
	}
	public String getGirl(Boy boy){
		return boy.getGirl().getName();
	}
	@Test
	public void test3(){
		Boy boy = new Boy();
		boy = null;
		String girl = getGirl(boy);
		System.out.println(girl);
	}
	//优化以后的getGirlName
	public String getGirl1(Boy boy){
		if (boy!=null){
			Girl girl = boy.getGirl();
			if (girl!=null){
				return girl.getName();
			}
		}
		return null;
	}
	//使用Optional类的getGirlName
	public String getGirl2(Boy boy){
		Optional<Boy> boyOptional = Optional.ofNullable(boy);
		//此时的boy1一定非空，如果为空的话用new Girl("赵大大"))代替
		Boy boy1 = boyOptional.orElse(new Boy(new Girl("赵大大")));

		Girl girl = boy1.getGirl();
		Optional<Girl> girlOptional = Optional.ofNullable(girl);
		//此时girl1一定非空，如果为空的话用new Girl("古渣渣")代替
		Girl girl1 = girlOptional.orElse(new Girl("古渣渣"));
		return girl1.getName();
	}
	@Test
	public void test5(){
		Boy boy = null;
		boy = new Boy();
		//这里需要再看看，这个null，new一个对象后，里面的属性为null,并不是他自己为null
		boy = new Boy(new Girl("chenlaoshi"));
		String girl2 = getGirl2(boy);
		System.out.println(girl2);
	}
	@Test
	public void test6(){
		Boy boy = new Boy();
		if (boy==null){
			System.out.println("boy==nunll");
		}else {
			System.out.println("boy!=nunll");
		}
	}
}
