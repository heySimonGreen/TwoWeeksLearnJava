package day27io;
import org.junit.Test;
import java.io.*;

/**
 * @author: chenwei
 * @date: 2021/9/14 2:00
 * @description: 描述
 */
public class Test1 {
    @Test
    public void test1(){
        /**
         * 处理流-数据流
         * */
        DataOutputStream dataOutputStream = null;
        try {
            FileOutputStream outputStream = new FileOutputStream(new File("dataOutPutStream.txt"));
            dataOutputStream = new DataOutputStream(outputStream);
            String chenwei = new String("chenwei");
            int id = 34234;
            dataOutputStream.writeBytes(chenwei);
            dataOutputStream.flush();
            dataOutputStream.writeInt(id);
            dataOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                dataOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2(){
        /**
         * Person类需要满足一下条件才可以序列化
         * 1. 需要实现接口：Serializable
         * 2. 当前类提供一个全局常量：SerialVersionUID
         * 3. 除了当前Person类需要实现Serializable接口之外，还需要保证其内部所有属性也必须是可序列化的(默认情况下，基本数据类是可序列化的)
         * 补充：ObjectOutPutStream和ObjectInPutStream不能序列化static和transient修饰的成员
         * 下面是序列化的过程，即是写入到文件中
         * 面试可能问到的问题：为什么需要SerialVersionUID
         *
         * */

        ObjectOutputStream objectInputStream = null;
        try {
            Person chenwei = new Person("chenwei", 234);
            FileOutputStream fileOutputStream = new FileOutputStream(new File("ObjectOutPutStream.txt"));
            objectInputStream = new ObjectOutputStream(fileOutputStream);
            objectInputStream.writeObject(chenwei);
            objectInputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                objectInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test3() throws IOException, ClassNotFoundException {
        /**
         *
         * 反序列化，就是从文件夹中读到内存中
         */
        FileInputStream fileInputStream = new FileInputStream(new File("ObjectOutPutStream.txt"));
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        Person person = (Person) object;
        System.out.print(person);
    }

    @Test
    public void test4(){
        /**
         * RandomAccessFile 随机存取文件流的使用：
         * 1. RandomAccessFile直接继承于java.lang.object类，实现了DataInput和DataOutput接口
         * 2. RandomAccessFile既可以作为输入流也可以作为输出流
         * 3. 如果RandomAccessFile作为输出流时，写出到的文件如果不存在，则在执行过程中自动创建，
         * 4. 可以通过相关的操作，使用 RandomAccessFile 实现插入的操作
         *    如果写出到的文件存在，则会对源文件内容进行覆盖(默认情况下从头覆盖)。
         * 下面是一个例子：使用RandomAccessFile实现文件的复制操作
         * */
        RandomAccessFile randomAccessFile1 = null;
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile1 = new RandomAccessFile(new File("D:\\io\\randomaccessfile.avi"), "r");
            randomAccessFile = new RandomAccessFile(new File("D:\\io\\randomaccessfile2.avi"), "rw");
            byte[] bytes = new byte[1024];
            int leng;
            while ((leng=randomAccessFile1.read(bytes))!=-1){
                randomAccessFile.write(bytes,0,leng);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (randomAccessFile1 != null) {
                    randomAccessFile1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test5() throws IOException {
        RandomAccessFile rw = new RandomAccessFile(new File("hello5.txt"), "rw");
        //将指针调到下表为3的位置，那么将会覆盖下表为3后面的内容写入多个个字节的位置的数据，后面没有写入的数据不会覆盖
        rw.seek(3);
        rw.write("xyz".getBytes());
        rw.close();
    }

    @Test
    public void test6() throws IOException {
        /**
         * 使用 RandomAccessFile 实现插入的操作
         * */
        RandomAccessFile rw = new RandomAccessFile(new File("hello5.txt"), "rw");
        //指针指向3的位置，在3的位置插入数据
        rw.seek(3);
        byte[] bytes = new byte[2];
        int leng;
        //读取下表3位置后面的数据到stringBuilder，用于存储
        StringBuilder stringBuilder = new StringBuilder((int) (new File("hello5.txt").length()));
        while ((leng=rw.read(bytes))!=-1){
            stringBuilder.append(new String(bytes,0,leng));
        }
        System.out.println(stringBuilder);
        rw.seek(3);
        rw.write("CHENWEI".getBytes());
        rw.write(stringBuilder.toString().getBytes());
        rw.close();
    }
}
