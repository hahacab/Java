package s2;
/*
代理模式是Java开发中使用较多的一种设计模式。代理设计就是为其他对象提供一种代理以控制对这个对象的访问。

 */
public class NetWorkTest {
    public static void main(String[] args) {
        Server server = new Server();
        ProxyServer proxyServer = new ProxyServer(server);
        proxyServer.brose();

    }
}
interface NetWork{
    void brose();
}
class Server implements NetWork{

    @Override
    public void brose() {
        System.out.println("真实的服务器访问网络");
    }
}
class ProxyServer implements NetWork{
    private NetWork work;
    public ProxyServer(NetWork work){
        this.work = work;
    }

    void check(){
        System.out.println("联网之前的检查工作");
    }
    @Override
    public void brose() {
        check();
        work.brose();
    }
}