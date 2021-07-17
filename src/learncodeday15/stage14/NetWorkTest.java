package learncodeday15.stage14;

/**
 * @author: chenwei
 * @date: 2021/7/17 22:34
 * 代理模式
 */
public class NetWorkTest {
    public static void main(String[] args){
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.browse();
    }
}
interface NetWork{
  /**
   * 浏览
   * */
  public void browse();
}

//代理类

class Server implements NetWork{
    @Override
    public void browse() {
        System.out.println("真实的服务器访问网络");
    }
}
//代理类

class ProxyServer implements NetWork{
    private NetWork work;
    public ProxyServer(NetWork work){
        this.work = work;
    }
    public void check(){
        System.out.println("联网之前的检查工作");
    }
    @Override
    public void browse() {
        check();
        work.browse();
    }
}