package day27io;

import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author: chenwei
 * @date: 2021/9/15 3:12
 * @description: 描述
 */
public class UrlTest {
    @Test
    public void test1(){
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            URL url = new URL("https://img.lianzhixiu.com/uploads/allimg/202105/9999/4e03dfd67e.jpg");
            HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
            httpURLConnection.connect();
            //这下面没有使用缓冲流包这两个inputStream和fileOutputStream，正常情况下应该会使用缓冲流的吧
            InputStream inputStream = httpURLConnection.getInputStream();
            bufferedInputStream = new BufferedInputStream(inputStream);

            FileOutputStream fileOutputStream = new FileOutputStream("mv.jpg");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] bytes = new byte[512];
            int leng;
            while ((leng=bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,leng);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
