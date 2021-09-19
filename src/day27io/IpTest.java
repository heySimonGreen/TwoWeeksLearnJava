package day27io;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author: chenwei
 * @date: 2021/9/14 18:35
 * @description: 描述
 */
public class IpTest {
  /**
   * 通信要素一:IP和端口号 1. IP唯一的表示Internet上的计算机（通信实体）
   * 2. 在Java中使用InetAddress代表IP
   * 3. IP分类IPv4和IPv6；万维网、局域网
   * 4. 域名：www.baidu.com www.mi.com
   * 5. 本地回路地址127.0.0.1对应着localhost
   * 6. 如何实例化InetAddress:两个方法：getByName(String name)、getLocalHost()
   *    两个常用方法：getHostName()/getHostAddress()
   * 7. 端口号：正在计算机上运行的进程。
   * 要求：不同的进程有不同的端口
   * 范围：被规定为16位的整数0~35535
   * 8. 端口号与IP地址的组合得出一个网络套接字：Socket
   */
  public static void main(String[] args) {
      try {
          InetAddress getByName = InetAddress.getByName("192.168.0.1");
          System.out.println(getByName);
          InetAddress byName = InetAddress.getByName("www.atguigu.com");
          System.out.println(byName);
          InetAddress byName2 = InetAddress.getByName("127.0.0.1");
          System.out.println(byName2);
      } catch (UnknownHostException e) {
          e.printStackTrace();
      }
  }
}
