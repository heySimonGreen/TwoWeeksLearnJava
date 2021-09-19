package day26iostream;
import org.junit.Test;

import java.io.*;
import java.util.Locale;

/**
 * @author: chenwei
 * @date: 2021/9/9 17:48
 * @description: 处理流之一：缓冲流的使用
 * 1.缓冲流
 * BufferedInputStream
 * BufferedInputStream
 * BufferedReader
 * BufferedWriter
 * 2.缓冲流的作用：提升流的读取、写入速度
 *
 */
public class BufferedTest {
    /*
    实现非文本文件的复制
    */

    @Test
    public  void test1() {
        //1.造文件
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File srcFile = new File("D:\\io\\streamtest.avi");
            File descFile = new File("D:\\io\\streamtest2.avi");
            //2.造流
            //2.1 造节点流
            FileInputStream fileInputStream = new FileInputStream(srcFile);
            FileOutputStream fileOutputStream = new FileOutputStream(descFile);
            //2.2 造缓冲流
            bufferedInputStream = new BufferedInputStream(fileInputStream);
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            //3. 复制的细节 读入、写入
            byte[] buffer = new byte[1024];
            int leng;
            while ((leng=bufferedInputStream.read(buffer))!=-1){
                bufferedOutputStream.write(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 资源关闭，要关闭4个，这里要先关闭外层的缓冲流，再关节点流，就像先脱外面的衣服再脱里面的衣服
            try {
                bufferedInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //说明：关闭外层流的同时，内层流就在自动关闭了，不需要手动写，我们可以省略
//        fileInputStream.close();
//        fileOutputStream.close();
        }
    }
    /*
    使用BufferedReader和BufferedWriter实现文本文件的复制，
    还是一样的不能使用BufferedReader和BufferedWriter来处理非文本文件
    */

    @Test
    public void test2() throws IOException {
        BufferedWriter bufferedWriter = null;
        BufferedReader bufferedReader = null;
        try {
            //1. 造文件、造流
            bufferedWriter = new BufferedWriter(new FileWriter(new File("hello5.txt")));
            bufferedReader = new BufferedReader(new FileReader(new File("hello.txt")));
//            //2. 复制具体流程
//            char[] chars = new char[16];
//            int read = 0;
//            while ((read = bufferedReader.read(chars))!=-1){
//                bufferedWriter.write(chars);
//            }
            //方式二：使用string
            String data;
            while ((data=bufferedReader.readLine())!=null){
//                //方法一
//                bufferedWriter.write(data+"\n");//data中不包含换行符
                //方法二
                bufferedWriter.write(data);
                bufferedWriter.newLine();//提供换行的操作


            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            bufferedReader.close();
            bufferedWriter.close();
        }
    }

    /*
    1. 转换流：属于字符流
    InputStreamReader:将一个字节的输入流，转换为字符的输入流
    OutputStreamReader:将一个字符的输出流，转换为字节的输出流
    2. 作用：提供字节流与字符流之间的转换
    3. 解码：字节、字节数组 ---> 字符串、字符数组
        编码：字符串、字符数组 ---> 字节、字节数组
    */
    @Test
    public void test3() throws IOException {
        /*
        * 此时处理异常任然使用tyr-catch,为了方便阅读，就懒得该了
        * inputStreamReader的使用，实现字节的输入流到字符的输入流的转换
        * */
        FileInputStream fileInputStream = new FileInputStream("hello.txt");
//        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);//使用系统默认的字符集
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");//参数2指明了字符集，具体使用哪个字符集，取决于文件使用哪个字符集保存
        char[] chars = new char[20];
        int len;
        while ((len=inputStreamReader.read(chars))!= -1){
            String string = new String(chars, 0, len);
            System.out.println(string);
        }
        inputStreamReader.close();
    }
    @Test
    public void test4() throws IOException {
        /*
        此时处理异常任然使用tyr-catch,为了方便阅读，就懒得该了
        * 综合使用InputStreamReader和OutputStreamReader
        * */
        //1. 造文件、造流
        File srcFile = new File("hello.txt");
        File descFile = new File("hellogbk.txt");

        FileInputStream fileInputStream = new FileInputStream(srcFile);
        FileOutputStream fileOutputStream = new FileOutputStream(descFile);

        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"utf-8");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream,"gbk");
        //2. 读写过程
        char[] chars = new char[20];
        int leng;
        while ((leng=inputStreamReader.read(chars))!=-1){
            outputStreamWriter.write(chars,0,leng);
        }
        inputStreamReader.close();
        outputStreamWriter.close();
    }

  public static void main(String[] args) throws IOException {
    //
      /*
       * 1. 标准的输入、输出流
       * 1.1 System.in:标准的输入流，默认从键盘输入
       *     System.out:标准的输出流，默认从键盘输出
       * 1.2 System类的setIn(InputStream is)/setOut(PrintStream ps)方式重新指定输入和输出的流
       *
       * 1.3 联系：
       * 从键盘输入字符串，要求将读取到的整行字符串转为大写输出。然后继续进行输入操作，直至输入e,或者exit,退出程序
       * */

      InputStreamReader inputStreamReader = new InputStreamReader(System.in);
      BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
      while (true){
          String s = bufferedReader.readLine();
          if (s.equalsIgnoreCase("e")||s.equalsIgnoreCase("exit")){
              System.out.print("program stop");
              break;
          }
          System.out.println(s.toUpperCase());
      }
      bufferedReader.close();
    }
}
