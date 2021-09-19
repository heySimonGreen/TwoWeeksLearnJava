package tools;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author: chenwei
 * @date: 2021/9/10 0:42
 * @description: 使用Java调用cmd,并指定cmd的打开位置，然后在cmd中执行脚本，用来下载视频，这里使用的是python的you-get下载视屏
 */
public class YouGet implements Runnable{
  public static void main(String[] args) {
      YouGet runnable = new YouGet();
      Thread thread = new Thread(runnable);
      thread.start();
  }

    @Override
    public void run() {
        int N = 5;
        String descPath = "F:\\workspace\\python-youget";
        for (int i=1;i<N;i++){
            String url = "https://www.bilibili.com/video/BV1g5411c7xY?p=" + String.valueOf(i);
            System.out.println(url);
            String command = " start youget2.bat " + url;
            Tools.getVideo(command,descPath);
            while (Tools.watchFileChange(i-1,descPath)){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print("continue");
                continue;
            }
        }
    }
}
class Tools{
    public static void getVideo(String command,String descPath) {
        String [] cmd={"cmd","/C",command};
        try {
            Process exec = Runtime.getRuntime().exec(cmd,null,new File(descPath));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
    * @param fileNumber 未下载完成时，.flv文件结尾的文件数量
    * @param filePath 文件地址
    * @return fileNumber 与文件夹下以.flv结尾的文件数量相通返回false,不同返回true
    */
    public static synchronized boolean watchFileChange(int fileNumber, String filePath){
        File file = new File(filePath);
        String[] list = file.list();
        int count = 0;
        //遍历文件夹，找到以.flv结尾的文件count+1
        for (int i=0;i<list.length;i++){
            String videoName = list[i];
            String[] split = videoName.split("\\.");
            if (split[split.length-1].equals("flv")){
                count++;
            }
        }
        return fileNumber==count;
    }
}
