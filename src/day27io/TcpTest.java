package day27io;
import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author: chenwei
 * @date: 2021/9/14 19:04
 * @description: 客户端发送内容给服务器，服务器将内容打印到控制台。
 */
public class TcpTest {
    @Test
    public void client() {
        /**
         * 客户端
         * */
        OutputStream outputStream = null;
        Socket socket = null;
        try {
            //1. 创建socket对象，指明服务器端的ip和端口号
            InetAddress localHost = InetAddress.getByName("127.0.0.1");
            socket = new Socket(localHost, 8899);
            //2. 获取一个输出流，用于输出数据
            outputStream = socket.getOutputStream();
            //3. 写出数据的操作
            outputStream.write("chenwei".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 资源的关闭
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void server(){
        /**
         * 服务端
         * */
        ServerSocket serverSocket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        Socket accept = null;
        try {
            //1. 创建serverSocket对象，指明自己的端口号
            serverSocket = new ServerSocket(8899);
            //2. 调用accept()表示接收来自于客户端的socket
            accept = serverSocket.accept();
            //3. 获取输入流
            inputStream = accept.getInputStream();
            //4. 读取输入流中的数据，注意这里使用的是ByteArrayOutputStream，将字节流堆在一起，最后一起显示出来
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes = new byte[5];
            int leng;
            while ((leng = inputStream.read(bytes))!=-1){
                byteArrayOutputStream.write(bytes,0,leng);
            }
            System.out.println(byteArrayOutputStream.toString());
        } catch (IOException e) {
        } finally {
            //5. 流的关闭
            if (byteArrayOutputStream != null) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (accept != null) {
                try {
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (serverSocket != null) {
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
