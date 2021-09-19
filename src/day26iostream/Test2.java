package day26iostream;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author: chenwei
 * @date: 2021/9/13 12:17
 * @description: 描述
 */
public class Test2 {

    /**
     * @descrip : 将文件夹a中的以.xml结尾的文件移动到父目录下的名为xml文件夹中
     */
    @Test
    public void test1(){
    // 遍历文件夹：java项目+SpringBoot+vue-锋迷商城-2021最新，
        String originPath = new String("F:\\workspace\\python-youget\\java项目+SpringBoot+vue-锋迷商城-2021最新");
        File originPathFile = new File(originPath);
        File xmlFile = new File(originPathFile, "xml");
        if (xmlFile.mkdir()) {
            System.out.println("创建xmlFile成功");
        }else {
            System.out.println("创建xmlFile失败");
        }
        File[] fileList = originPathFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String string = pathname.toString();
                String s = string.toLowerCase();
                String endWith1 = new String(".xml");
                if (s.endsWith(endWith1)){
                    return true;
                }
                return false;
            }
        });
        for (int i=0;i<fileList.length;i++){
            System.out.println(fileList[i].toString());
            try {
                Files.move(fileList[i].toPath(),new File(xmlFile,fileList[i].getName()).toPath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
