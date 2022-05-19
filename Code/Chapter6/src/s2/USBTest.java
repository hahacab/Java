package s2;

public class USBTest {
    public static void main(String[] args) {
        //1.创建接口的非匿名实现类的非匿名对象
        Computer computer = new Computer();
        Flash flash = new Flash();
        computer.transferData(flash);

        //2.创建接口的非匿名实现类的匿名对象
        computer.transferData(new Printer());

        //2.创建接口的匿名实现类的非匿名对象
        USB phone = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };
        computer.transferData(phone);
        //2.创建接口的匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3开始工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });
    }


}
class Computer{
    public void transferData(USB usb){
        usb.stop();

        System.out.println("具体传输数据的字节");

        usb.stop();
    }
}
interface USB{
    //常量，定义长、宽、最大最小的传输速率等

    void start();

    void stop();
}
class Flash implements USB{

    @Override
    public void start() {
        System.out.println("U盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("U盘结束工作");
    }
}

class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}