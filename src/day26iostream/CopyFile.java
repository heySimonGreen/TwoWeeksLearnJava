package day26iostream;

import java.io.*;

/**
 * @author: chenwei
 * @date: 2021/9/8 3:20
 * @description: 复制文件到指定文件夹，并指定读取的字节数
 */
public class CopyFile {
    /*
    * @param src 源文件地址
    * @param desc 目标文件地址
    * @param bytesLength fileInputStream.Read的长度
    * */

    public static void copyFileFromSrcToDesc(String src,String desc,int bytesLength){
        File srcFile = new File(src);
        File descFile = new File(desc);
        long startTime = System.currentTimeMillis();
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(srcFile);
            fileOutputStream = new FileOutputStream(descFile);
            byte[] readBytes = new byte[bytesLength];
            int read = fileInputStream.read(readBytes);
            while (read!=-1){
                fileOutputStream.write(readBytes,0,read);
                read = fileInputStream.read(readBytes);
            }
            System.out.print("复制完成！");
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
        long endTime = System.currentTimeMillis();
        System.out.print("复制用时 "+(endTime - startTime)+" 毫秒");
    }
}
