package day28reflection.test;

import LearnCode20210628.day210629.CodeExecutionProcess.TestStatic;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;

/**
 * @author: chenwei
 * @date: 2021/9/17 0:12
 * @description: 描述
 */
public class MethodTest {
    @Test
    public void test1() throws ClassNotFoundException {
        Class personClass = Class.forName("day28reflection.test.Person");
        //getMethods() 获取当前运行时类及其父类中声明为public访问权限的方法
        Method[] methods = personClass.getMethods();
        for (Method m : methods){
            System.out.println(m);
        }

    // getDeclaredMethods() 获取当前运行时类中声明的所有方法。(不包含父类中声明的方法)
        System.out.println("--------------");
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method m : declaredMethods){
            System.out.println(m);
        }

    }
    @Test
    public void test2() throws NoSuchFieldException, IllegalAccessException {
        String str = new String("chenwei");
        Class aClass = str.getClass();

        Field value = aClass.getDeclaredField("value");
        value.setAccessible(true);
        char[] chars = (char[]) value.get("chenwei");
        //这里有两种修改值得方法
        //方法一： 这里可以修改str的值
        chars[2] = 'o';
        System.out.println(str);
        //方法二： 此处此时修改的正常写法，并且记得修改长度
        value.set(str,new char[]{'w','s','c','w'});
        System.out.println(str);
        System.out.println(str.length());
    }
    @Test
    public void test3() throws ClassNotFoundException {
        /**
         @Xxx
         权限修饰符 返回值类型 方法名(参数类型1, 参数类型2,...) throws XxxException

        */
        Class personClass = Class.forName("day28reflection.test.Person");
        Method[] declaredMethods = personClass.getDeclaredMethods();
        for (Method m : declaredMethods){
            //获取方法声明的注解
            Annotation[] annotations = m.getAnnotations();
            for (Annotation a : annotations){
                System.out.println(a);
            }
            //权限修饰符
            int modifiers = m.getModifiers();
            String string = Modifier.toString(modifiers);
            System.out.print("权限修饰符： "+string);

            // 返回值类型
            System.out.print(m.getReturnType()+" ");

            // 方法名
            System.out.println(m.getName());

            //参数列表
            Class[] parameterTypes = m.getParameterTypes();
            //如果有形参，则输出形参类型
            if (!(parameterTypes == null && parameterTypes.length == 0)){
                for (int i= 0;i<parameterTypes.length;i++){

                    System.out.println(parameterTypes[i] + "args_" + i + ",");
                }
            }
            System.out.println("***********************");
            //6. 抛出的异常
            Class[] exceptionTypes = m.getExceptionTypes();
            if (!(exceptionTypes==null&&exceptionTypes.length==0)){
                System.out.println("throws");
                for (int i=0;i<exceptionTypes.length;i++){
                    //这里写的代码没有抛出异常所以都没有
                    System.out.println(exceptionTypes[i].getName() + " exception_" + i);
                }
            }
        }
    }
}
