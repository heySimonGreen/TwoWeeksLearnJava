package day25generic.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author: chenwei
 * @date: 2021/9/4 18:22
 * @description: File类的使用
 * 1. File类的一个对象，代表一个文件或一个文件目录（俗称文件夹）
 * 2. File类声明在java.io包下
 * 3. File类中涉及到关于文件或文件目录的创建、删除、重命名、修改时间、文件大小等方法，并未涉及文件写入或读取的操作。如果需要读取或写入文件内容，必须使用IO流来完成
 * 4. 后续FiLe的对象常会作为参数传递到流的构造器中，指明读取写入的终点
 *
 * 路径分隔符和操作系统有关：
 * Windows和dos系统默认使用“\”来表示
 * UNIX和URL使用"/"来表示
 */
public class FileTest {
    /*
    * 如何创建File类的实例
    * 1.File(String FilePah)
    * 2.File(String parentPath,String child)
    * 3.File(File parentPath,String child)
    * */

    @Test
    public void test1(){
        //构造器1
        File file1 = new File("helleFile.txt");
        File file2 = new File("D:\\workspace\\TwoWeeksLearnJava\\src\\day25generic\\helleFile.txt");
        System.out.println(file1);
        System.out.println(file2);
        //构造器2
        File file3 = new File("D:\\workspace\\TwoWeeksLearnJava","src\\day25generic");
        System.out.println(file3);
        //构造器3
        File file4 = new File(file3,"helloFile.txt");
        System.out.println(file4);
    }
    @Test
    public void test2(){
        File file1 = new File("helloFile.txt");
        File file2 = new File("d:\\id\\helloFile.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(new Date(file1.lastModified()));

        System.out.println();
        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());

        System.out.println();
        File file3 = new File("D:\\workspace\\TwoWeeksLearnJava\\src\\day25generic\\homework");
        String[] list = file3.list();
        for (String str : list){
            System.out.println(str);
        }
        File[] files = file3.listFiles();
        for (File f : files){
            System.out.println(f);
        }
    }
    /*
     * boolean b = file1.renameTo(file2);
     * 把文件命名到指定的文件路径
     * 要想保证返回TRUE，需要file1在硬盘中存在file2在硬盘中不存在
     * */

    @Test
    public void test3(){
        File file1 = new File("helloFile.txt");
        File file2 = new File("D:\\io\\hedllFiles.txt");
        boolean b = file1.renameTo(file2);
        System.out.println(b);
    }
    @Test
    public void test4() throws IOException {
        /*
        1. boolean createNewFile() 创建文件。若文件存在，则不创建，返回false;
        2. boolean mkdir() 创建文件目录。若文件目录存在，就不创建，若此文件目录的上层不存在，也不创建；
        3. boolean mkdirs() 创建文件目录。如果上层文件目录不存在，一并创建；
        * */
        //creatNewFile
        File file = new File("test.txt");
        if (file.exists()){
            System.out.println("文件已存在");
        }else {
            file.createNewFile();
            System.out.println("creat successful");
        }
        System.out.println(file.getAbsolutePath());
        //mkdir
        File file1 = new File("D://iO/io1");
        if (file1.mkdir()) {
            System.out.println("creat filefolder successful");
        }
        File file2 = new File("D://iO/io2");
        if (file2.mkdirs()) {
            System.out.println("creat filefolder successful");
        }
    }
    @Test
    public void listRemoveIf(){
        List<Integer> integers = Arrays.asList(new Integer[]{2,1,5,7,8,33,55,26,62});
        integers.forEach(System.out::println);
    }
    @Test
    public void listRemove(){
        List<String> list =new ArrayList<String>();
        list.add("1");
        list.add("12");
        list.add("13");
        list.add("0");
        System.out.println("初始时："+ list.toString());
        list.removeIf(s -> s.matches("^((?!2).)*$"));
        System.out.println("过滤完：" + list.toString());
    }
}
