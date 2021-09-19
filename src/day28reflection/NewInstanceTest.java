package day28reflection;

import org.junit.Test;

import java.util.Random;

/**
 * @author: chenwei
 * @date: 2021/9/16 16:41
 * @description: 描述
 */
public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        /**
         通过反射，调用运行时类的对象
         newInstance()，调用此方法，创建对应的运行时类的对象。内部调用了运行时类的空参构造器
         要想此方法正常的创建运行时类的对象，要求：
         1. 运行时类必须提供空参的构造器
         2. 空参的构造器的访问权限得够，通常设置为public.

         在javabean中要求提供一个public的空参的构造器。原因
         1. 便于通过反射，创建运行时类的对象，百分之九十五都是调用newInstance()
         2. 便于子类继承此运行时类时，默认调用super()时，保证父类有此构造器
         这里也是为什么JavaBean为什么要提供一个空参的权限为public的构造器。
         后面许多的框架都需要使用反射创建javabean,都是需要使用空参的public的构造器
         另外一个方面：就是类构造器都省略了super()，这个也是调用父类的空参构造器，所以一般都需要提供空参的构造器
         */
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();
        System.out.println(person);
    }


    @Test
    public void test2() throws InstantiationException, IllegalAccessException {
        //体会反射的动态性
        for(int i=0;i<100;i++){
            int number = new Random().nextInt(3);
            System.out.println(number);
            String classPath = "";
            switch (number){
                case 0:
                    classPath = "java.util.Date";
                    break;
                case 1:
                    classPath = "java.lang.Object";
                    break;
                case 2:
                    classPath = "day28reflection.Person";
                    break;
            }
            Object object = null;
            try {
                object = getInstance(classPath);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(object);
        }
    }

    public Object getInstance(String classPath) throws Exception {
        Class newInstanceTestClass = Class.forName(classPath);
        return newInstanceTestClass.newInstance();
    }
}
