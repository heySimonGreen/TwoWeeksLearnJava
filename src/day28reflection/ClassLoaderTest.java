package day28reflection;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author: chenwei
 * @date: 2021/9/16 15:49
 * @description: 描述
 */
public class ClassLoaderTest {
    @Test
    public void test1(){
        //对于自定义类，使用类的加载器进行加载
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        //sun.misc.Launcher$AppClassLoader@18b4aac2 系统类加载器
        System.out.println(classLoader);

        //调用系统类的加载器的getParent():获取扩展类加载器
        ClassLoader classLoader1 = classLoader.getParent();
        //看classLoader的上一层是谁？ sun.misc.Launcher$ExtClassLoader@28a418fc 扩展类加载器
        System.out.println(classLoader1);

        //调用扩展类加载器的getParent():无法获取引导类加载器，、
        //引导类加载器主要负责加载java的核心类库，无法加载自定义的类的
        ClassLoader classLoader2 = classLoader1.getParent();
        //获取不到引导类加载器，返回的是null，引导类加载器是c++执行，效率较高。引导类加载器是不能加载我们自定义的类
        System.out.println(classLoader2);

        //说明String是引导类加载器加载的
        ClassLoader classLoader3 = String.class.getClassLoader();
        System.out.println(classLoader2);
    }
    @Test
    public void test2() throws IOException {
        Properties properties = new Properties();
        //此时的文件默认在当前module下，所以文件地址使用的是"src//jdbc.properties"
        //读取配置文件的方式一：
//        FileInputStream fileInputStream = new FileInputStream("src//jdbc.properties");
//        properties.load(fileInputStream);

        //读取配置文件的方式二：使用getClassLoader()，
        //配置文件默认识别为：当前module下的src下
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(resourceAsStream);


        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        System.out.println("user = " + user);
        System.out.println("password = " + password);
    }
}
