package day27io;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author: chenwei
 * @date: 2021/9/15 1:48
 * @description: tcp网络编程练习3
 * 例题3：从客户端发送文件给服务器，服务器保存到本地。并返回“发送成功”给客户端，并关闭相应的流
 */
public class TcpTest3 {
    @Test
    public void client(){
        InetAddress inetAddress = null;
        try {
            inetAddress = InetAddress.getByName("127.0.0.1");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        Socket socket = null;
        BufferedOutputStream bufferedOutputStream = null;
        BufferedInputStream bufferedInputStream = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            socket = new Socket(inetAddress, 8988);

            OutputStream outputStream = socket.getOutputStream();
            bufferedOutputStream = new BufferedOutputStream(outputStream);

            FileInputStream fileInputStream = new FileInputStream("D:\\io\\tcpTest.avi");
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            byte[] bytes = new byte[512];
            int leng;
            while ((leng = bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,leng);
            }
            socket.shutdownOutput();

            inputStream = socket.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bytes1 = new byte[8];
            int leng1;
            while ((leng1=inputStream.read(bytes1))!=-1){
                byteArrayOutputStream.write(bytes1,0,leng1);
            }
            System.out.println(byteArrayOutputStream.toString());


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
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
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
        }
    }
    @Test
    public void server(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedInputStream bufferedInputStream = null;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            serverSocket = new ServerSocket(8988);
            socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();
            bufferedInputStream = new BufferedInputStream(inputStream);

            FileOutputStream fileOutputStream = new FileOutputStream("tcpTest001.avi");
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

            byte[] bytes = new byte[512];
            int leng;
            while ((leng = bufferedInputStream.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,leng);
            }

            //服务器给客户端的反馈，返回已经收到资料
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("图片已经收到，谢谢".getBytes());
            outputStream.close();


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
            if (socket != null) {
                try {
                    socket.close();
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
