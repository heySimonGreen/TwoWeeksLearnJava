package day25generic.file;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @author: chenwei
 * @date: 2021/9/6 18:28
 * @description: 描述
 */
public class Homework {
  public static void main(String[] args) throws IOException {
      File file = new File("filetest/test1/childFolder0");
      if (file.mkdir()) {
          System.out.println("mkdir successful");
      }
      for (int i=0;i<5;i++){
          File file1 = new File(file,"childFolder"+i);
          if (file1.mkdir()) {
              System.out.println("mkdir" + i +" successful ");
          }
          String childFile = "file" + i + ".txt";
          File file2 = new File(file,childFile);
          if (file2.exists()){
            System.out.println("exists " + childFile);
          }else {
              file2.createNewFile();
              System.out.println("create file successful");
          }
      }
      File file1 = new File(file.getParent());
      String[] list = file1.list();
      System.out.println(Arrays.toString(list));
      List<String> strings = Arrays.asList(list);
//      strings.removeIf(a -> a.matches("^((?!\\.).)*$"));
//      strings.removeIf(a -> a.contains("."));
      for (Iterator iterator = strings.iterator();iterator.hasNext();){
          String string = (String) iterator.next();
          if (string.contains(".")){
                System.out.println(string);
          }
      }
  }
}
