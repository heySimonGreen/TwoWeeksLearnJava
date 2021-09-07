package day24Collection.code;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @author: chenwei
 * @date: 2021/8/31 20:05
 * @description: 描述
 */
public class PropertyTest {
  public static void main(String[] args) throws IOException {
      //Properties:常用来处理配置文件。key-value都是String类型
      Properties properties = new Properties();
      FileInputStream fileInputStream = new FileInputStream("jdbc.properties");
      properties.load(fileInputStream);
      String name = properties.getProperty("name");
      String password = properties.getProperty("password");
      System.out.println("name:" + name);
      System.out.println("password:" + password);
  }
}
