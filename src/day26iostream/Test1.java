package day26iostream;

import LearnCode20210628.day210629.CodeExecutionProcess.TestStatic;
import org.junit.Test;

import java.io.*;
import java.time.LocalDateTime;

/**
 * @author: chenwei
 * @date: 2021/9/7 1:23
 * @description:
 * 一、流的分类
 * 1. 操作数据单位，字节流字符流
 * 2. 数据的流向:输入流、输出流
 * 3. 流的角色:节点流、处理流
 * 二、流的体系结构
 * 抽象基类        节点流(或文件流)    缓冲流(处理流的一种)
 * InputStream    FileInputStream  BufferedInputStream
 * InputStream    FileInputStream  BufferedInputStream
 * Reader         FileReader       BufferedReader
 * Writer         FileWriter       BufferedWriter
 */
public class Test1 {
    /*
    将iotest.txt文件的内容输出到控制台
    说明点：
    1. read的理解：返回读入的一个字符。如果达到文件末尾，返回-1
    2. 异常的处理：为了保证流资源一定可以执行关闭操作。需要使用tyr-catch-finally处理
    3. 读的文件一定要要存在，否则会报FileNotFound异常
    */


    @Test
    public void test1() throws IOException {
        //1. 实例化file类的对象，指明要操作的文件
        File file = new File("iotest.txt");
        //2. 提供具体的流
        FileReader fileReader = new FileReader(file);
        //3. 数据的读入
        int read = fileReader.read();
        while (read!=-1){
            System.out.print((char) read);
            read = fileReader.read();
        }
        //4. 流的关闭 一定要执行，只要new 了具体的流，就一定要关闭流，否则资源浪费。这里就有一个问题，使用throws 还是try-catch,这里就只能try-catch-finally了
        fileReader.close();
    }
    @Test
    public void test2(){
        FileReader fileReader = null;
        try {
            //1. 实例化file类的对象，指明要操作的文件
            File file = new File("iotest.txt");
            //2. 提供具体的流
            fileReader = new FileReader(file);
            //3. 数据的读入
            int read = fileReader.read();
            while (read!=-1){
                System.out.print((char) read);
                read = fileReader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流的关闭 一定要执行，只要new 了具体的流，就一定要关闭流，否则资源浪费。这里就有一个问题，使用throws 还是try-catch,这里就只能try-catch-finally了
            try {
                //如果在new file的时候出现异常，那么fileReader为null,直接close会出空指针异常
                if (fileReader!=null){
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test3(){
        File file = new File("iotest.txt");
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(file);
            char[] cbuf = new char[3];
            int len;
            while ((len = fileReader.read(cbuf)) != -1){
//                //1. 错误写法，每次cbuf都是3个字符，下次要读的重新写到cbuf内，当到末尾最后一次读的时候，后面剩余位置没有写入，就导致是上次的数据。类似于内存安全问题。
//                for (int i=0;i<cbuf.length;i++){
//                    System.out.print(cbuf[i]);
//                }

                for (int i=0;i<len;i++){
                    System.out.print(cbuf[i]);
                }
                //错误写法2,错误原因和上面类似，
//                String s = new String(cbuf);
//                System.out.println(s);
                //使用String的正确写法
//                String s = new String(cbuf,0,len);
//                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test4(){
        /*
        从内存中写出数据到磁盘中去
        说明；
        1. 输出操作，对应的File可以不存在。并不会报异常
        2. File对应的磁盘中的文件如果不存在，在输出的过程中，会自动创建此文件。
           File对应的磁盘中的文件如果存在：
                如果流使用的构造器是：FileWriter(file,false)或FileWriter(file)：对原有文件的覆盖
                如果流使用的构造器是：FileWriter(file,true):不会对原有文件的覆盖，而是在原有文件基础上追加内容

        */
        File file = new File("iotest.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file,true);
            fileWriter.write("我是陈伟，你是谁呢？\n");
            fileWriter.write("我是陈大大，你是谁呢？\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter!=null){
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void test5(){
        File srcFile = new File("filetest/test1/childFolder4/iotest.txt");
        File desFile = new File("filetest/test1/childFolder4/iotest2.txt");
        FileReader reader = null;
        FileWriter fileWriter = null;
        try {
            reader = new FileReader(srcFile);
            fileWriter = new FileWriter(desFile);
            int read = reader.read();
            while (read!=-1){
                fileWriter.write((char) read);
                read = reader.read();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader!=null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    @Test
    public void test6() {
        /*
        测试fileInputStream和fileOutputStream的使用
        结论
        1. 对于文本文件(.txt,.java,.c,.cpp),使用字符流处理
        2. 对于非文本文件(.jpg,.mp3,.mp4,.avi,.doc,.ppt......)使用字节流处理
        需要知道如果只是对文件复制，不在内存层面看的话，用字符流也是可以的
        */
        File srcFile = new File("filetest/test1/childFolder4/pic.jpeg");
        File desFile = new File("filetest/test1/childFolder4/pic2.jpeg");

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(desFile);

            int read = fileInputStream.read();
            while (read!=-1){
                fileOutputStream.write(read);
                read = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
    @Test
    public void test7(){
        File srcFile = new File("f://dist.zip");
        File descFile = new File("f://dist2.zip");
        long stratTime = System.currentTimeMillis();
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(descFile);
            byte[] readBytes = new byte[10240*4];
            int read = fileInputStream.read(readBytes);
            while (read!=-1){
                fileOutputStream.write(readBytes,0,read);
                read = fileInputStream.read(readBytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.print("复制完成！");
        }
        long endTime = System.currentTimeMillis();
        System.out.print((endTime - stratTime));

    }
    @Test
    public void test8(){
    CopyFile.copyFileFromSrcToDesc("F:\\iotest.avi", "F:\\iotest2.avi",1024*1024*4);
    }
}
