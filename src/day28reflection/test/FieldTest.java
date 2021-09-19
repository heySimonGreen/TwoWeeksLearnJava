package day28reflection.test;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author: chenwei
 * @date: 2021/9/16 23:31
 * @description: 描述
 */
public class FieldTest {
    @Test
    public void test1() throws ClassNotFoundException {
        Class personClass = Class.forName("day28reflection.test.Person");
        //获取属性结构
        //getFields();获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = personClass.getFields();
        for (Field f : fields){
            System.out.println(f);
        }
        System.out.println("***********");
        //getDeclaredFields();获取当前运行时类中声明的所有属性。(不包含父类中声明的属性)
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field f : declaredFields){
            System.out.println(f);
        }
    }
    @Test
    public void test() throws ClassNotFoundException {
        //获取权限修饰符 数据类型 变量名
        Class personClass = Class.forName("day28reflection.test.Person");
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field f : declaredFields){
            //1. 权限修饰符
            int modifiers = f.getModifiers();
            String string = Modifier.toString(modifiers);
            System.out.println("权限修饰符 ： "+string);
            //2. 数据类型
            Class type = f.getType();
            System.out.println("数据类型 : "+type.toString());
            //3. 变量名
            String name = f.getName();
            System.out.println("变量名 : "+name);
            System.out.println("------------------------");
        }
    }
}
