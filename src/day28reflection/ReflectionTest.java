package day28reflection;

import javafx.scene.CacheHint;
import org.junit.Test;

import java.lang.annotation.ElementType;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author: chenwei
 * @date: 2021/9/15 18:18
 * @description: 描述
 */
public class ReflectionTest {
    @Test
    public void test1(){
        //创建Person类的对象
        Person chenwei = new Person("chenwei", 24);
        //通过对象，调用其内部的属性、方法
        chenwei.age = 20;
        System.out.println(chenwei.toString());
        chenwei.show();
        //在Person类外部，不可以通过Person类的对象调用其内部私有结构
        //比如，name、showNation
    }
    //反射之后，对Person的操作
    @Test
    public void test2() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class personClass = Person.class;
        //找到指定的构造器
        Constructor constructor = personClass.getConstructor(String.class, int.class);
        //1. 通过构造器去创建对象
        Object chen = constructor.newInstance("chen", 24);
        Person person = (Person) chen;
        System.out.println(person.toString());
        //2. 通过反射，调用对象指定的属性、方法
        //调属性
        Field name = personClass.getDeclaredField("age");
        name.set(person,10);
        System.out.println(person.toString());
        //掉方法,这里getDeclaredMethod调用的show方法没有参数，有参数的写法是personClass.getDeclaredMethod("show"，参数);show.invoke(person，参数)
        Method show = personClass.getDeclaredMethod("show");
        show.invoke(person);
        System.out.println("*****************");
        //通过反射，可以调用Person类的私有结构。比如：私有的构造器、方法、属性
        //调用私有的构造器
        Constructor declaredConstructor = personClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Object jenny = declaredConstructor.newInstance("jenny");
        Person person1 = (Person) jenny;
        System.out.println(jenny.toString());
        //调用私有的属性
        Field name1 = personClass.getDeclaredField("name");
        name1.setAccessible(true);
        name1.set(person1,"li");
        System.out.println(person1.toString());
        //调用方法
        Method showNation = personClass.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation = showNation.invoke(person1, "China").toString();
        System.out.println(nation);
    }

    /**
     疑问一：通过直接new的方式或反射的方式都可以调用公共的结构，开发中到底用哪个？
     建议：直接new。
     什么时候会使用：反射的方式。反射的特征：动态性。
     疑问二：反射机制与面向对象中的封装性是不是矛盾的？如何看待两个技术？
     不矛盾

     关于Java.Lang.Class类的理解
     1. 类的加载过程；
     程序经过javac.exe命令以后，会生产一个或多个字节码文件(.class结尾)
     接着我们使用java.exe命令对某个字节码文件进行解释运行。相当于将某个字节码文件加载到内存中。
     此过程就称为类的加载。加载到内存中的类，我们就称为运行时类，此运行时类，就作为class的一个实例。
     2. 换句话说：class的实例就对应着一个运行时类
     3. 加载到内存中的运行时类，会缓存一定的时间。在此时间之内，我们可以通过不同的方式来获取此运行时类。
     */
    @Test
    public void test3() throws ClassNotFoundException {
        //获取class实例的三种方式,使用频率上方式三使用多
        //方式一：调用运行时类的属性：.class
        Class<Person> personClass = Person.class;
        System.out.println(personClass);
        //方式二：通过运行时类的对象，调用getClass()
        Person person = new Person();
        Class aClass = person.getClass();
        System.out.println(aClass);
        //调用Class的静态方法：forName(String classPath)
        Class aClass1 = Class.forName("day28reflection.Person");
        System.out.println(aClass1);

        System.out.println(personClass==aClass);
        System.out.println(personClass==aClass1);
        //方式四：使用类的加载器：ClassLoader
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class aClass2 = classLoader.loadClass("day28reflection.Person");
        System.out.println(aClass2);
        System.out.println(personClass==aClass2);
    }

    @Test
    public void test4(){
        /**
         Class实例可以是哪些结构的说明：
        */
        Class<Object> objectClass = Object.class;
        System.out.println(objectClass);
        Class<Comparable> comparableClass = Comparable.class;//接口
        System.out.println(comparableClass);
        Class<String[]> aClass = String[].class;
        System.out.println(aClass);
        Class<int[][]> aClass1 = int[][].class;
        System.out.println(aClass1);
        Class<ElementType> elementTypeClass = ElementType.class;
        System.out.println(elementTypeClass);
        Class<Override> overrideClass = Override.class;//注解
        System.out.println(overrideClass);
        Class<Integer> integerClass = int.class;
        System.out.println(integerClass);
        Class<Void> voidClass = void.class;
        System.out.println(voidClass);
        Class<Class> classClass = Class.class;
        System.out.println(classClass);

        int[] a = new int[10];
        int[] b = new int[100];
        Class class1 = a.getClass();
        Class class2 = b.getClass();
    // 只要元素类型一样与维度一样，就是同一个class
    System.out.println((class1 == class2));
    }
}
