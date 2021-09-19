package day27io;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author: chenwei
 * @date: 2021/9/15 2:48
 * @description: 描述
 * 接收和发送都是用的DatagramSocket
 */
public class UdpTest {
    @Test
    public void send() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket();
        //传输的数据，以byte[]的形式。
        String str = "wo shi chen wei";
        byte[] bytes = str.getBytes();
        //指定传输的地址
        InetAddress inetAddress = InetAddress.getLocalHost();
        //发送数据
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length,inetAddress,8888);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
    @Test
    public void receive() throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(8888);
        byte[] bytes = new byte[200];
        DatagramPacket datagramPacket = new DatagramPacket(bytes,0,bytes.length);
        //接收数据
        datagramSocket.receive(datagramPacket);
        //获取datagramPacket中的数据
        System.out.println(new String(datagramPacket.getData(),0,datagramPacket.getLength()));
        datagramSocket.close();
    }
}
