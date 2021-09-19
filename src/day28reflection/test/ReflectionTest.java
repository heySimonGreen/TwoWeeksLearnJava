package day28reflection.test;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: chenwei
 * @date: 2021/9/17 2:39
 * @description: 调用运行时类中指定的结构：属性、方法、构造器
 */
public class ReflectionTest {
    @Test
    public void test1() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class aClass = Class.forName("day28reflection.test.Person");
        //创建运行时类的对象
        Person person = (Person) aClass.newInstance();
        System.out.println(person.toString());
        //getField() 获取指定属性 要求运行时类中属性声明为public 通常不使用此方法
        Field id = aClass.getField("id");
        /*
        * 设置当前属性的值
        * set():参数1：指明设置哪个对象的属性 参数2：将此属性值设置为多少
        * */
        id.set(person,5666);
        /*
        * 获取当前属性的值
        * get() 参数1：获取哪个对象的当前属性
        * */
        Integer o = (Integer) id.get(person);
        System.out.println(o);
        System.out.println(person);
    }
    @Test
    public void test2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        /*
        * 如何操作运行时累的指定属性 ----需要掌握
        * */
        Class aClass = Class.forName("day28reflection.test.Person");
        //创建运行时类的对象
        Person person = (Person) aClass.newInstance();

        //1. getDeclaredField(String fieldName) 获取运行时类中指定变量名的属性，这里都可以拿到
        Field name = aClass.getDeclaredField("name");
        //2. 保证当前变量是可访问的
        name.setAccessible(true);
        //3. 获取、设置指定对象的属性
        name.set(person,"chenwei");
        System.out.println(person);
    }
    @Test
    public void test3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /*
        * 调用运行时类中的指定方法
        * */
        Class aClass = Class.forName("day28reflection.test.Person");

        Person person = (Person) aClass.newInstance();

        //1. 获取某个指定的方法 getDeclaredMethod()：参数1：指明获取的方法的名称 参数2：指明获取方法的形参列表
        Method show = aClass.getDeclaredMethod("showNation", String.class);
        //2. 保证当前方法时可访问的
        show.setAccessible(true);
        /*
        * 调用方法的invoke()参数1：方法的调用者 参数2：给方法形参赋值的实参
        * invoke()的返回值即为对应类中调用的方法的返回值。
        * */
        Object chen = show.invoke(person, "chen");
        System.out.println(chen);
        System.out.println("如何调用静态方法");
        Method showDetail = aClass.getDeclaredMethod("showDetail");
        showDetail.setAccessible(true);
        Object invoke = showDetail.invoke(Person.class);
        System.out.println(invoke);
    }
    @Test
    public void test4() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        /*
        * 调用运行时类中的指定构造器
        * */
        Class aClass = Class.forName("day28reflection.test.Person");

        //1. 获取指定构造器
        Constructor declaredConstructor = aClass.getDeclaredConstructor(String.class);
        //2. 保证此构造器是可访问的
        declaredConstructor.setAccessible(true);
        //3. 调用此构造器创建运行时类的对象
        Object o = declaredConstructor.newInstance("Tome");
        System.out.println(o);
    }
}
