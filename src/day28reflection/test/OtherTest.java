package day28reflection.test;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author: chenwei
 * @date: 2021/9/17 1:53
 * @description: 描述
 */
public class OtherTest {
    @Test
    public void test1() throws ClassNotFoundException {
        /*
        * 获取构造器
        * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        //getConstructors() 获取当前运行时类中声明为public的构造器
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor c : constructors){
            System.out.println(c);
        }
        System.out.println("****************");
        //getDeclaredConstructors() 获取当前运行时类中所有的构造器
        Constructor[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor c : declaredConstructors){
            System.out.println(c);
        }
    }
    @Test
    public void test2() throws ClassNotFoundException {
        /*
        * 获取运行时类的父类
        * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);
    }

    @Test
    public void test3() throws ClassNotFoundException {
        /*
         * 获取运行时类的带泛型的父类
         * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Type genericSuperclass = aClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    @Test
    public void test4() throws ClassNotFoundException {
        /*
         * 获取运行时类的带泛型的父类的泛型
         * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Type genericSuperclass = aClass.getGenericSuperclass();
        System.out.println(genericSuperclass);
        //强转过后表明是带参数的
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        //获取实际类型的参数，就是获取泛型
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        //把Type强转为class
        System.out.println(((Class)actualTypeArguments[0]).getName());
    }
    @Test
    public void test5() throws ClassNotFoundException {
        /*
        * 获取运行时类的接口
        * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class i:interfaces){
            System.out.println(i);
        }
        System.out.println("------------------");
        //获取运行时父类的接口
        Class<?>[] interfaces1 = aClass.getSuperclass().getInterfaces();
        for (Class i:interfaces1){
            System.out.println(i);
        }
    }

    @Test
    public void test6() throws ClassNotFoundException {
        /*
         * 获取运行时类所在的包
         * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Package aPackage = aClass.getPackage();
        System.out.println(aPackage);
    }
    @Test
    public void test7() throws ClassNotFoundException {
        /*
         * 获取运行时类声明的注解
         * */
        Class<?> aClass = Class.forName("day28reflection.test.Person");
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation a: annotations){
            System.out.println(a);
        }
    }
}
