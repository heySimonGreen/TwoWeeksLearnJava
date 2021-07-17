package learncodeday15.stage14;

/**
 * @author: chenwei
 * @date: 2021/7/17 13:51
 * 接口使用上也满足多态性
 * 本身接口又不能够去造对象，我们只能造它实现类的对象，体现了多态
 * 接口的使用也必须通过多态的方式使用
 * 接口，实际上就是定义了一种规范
 * 开发中体会面向接口编程
 */
public class UsbTest {
    public static void main(String[] args){
        Computer computer = new Computer();
        //1. 创建了接口的非匿名实现类的非匿名对象
        Flash flash = new Flash();
        //2. 创建了接口的非匿名实现类的非匿名对象
        computer.transferData(flash);
        //3. 创建了接口的匿名实现类的非匿名对象
        Usb phone = new Usb() {
            @Override
            public void start() {
                System.out.println("Phone start working");
            }

            @Override
            public void stop() {
                System.out.println("Phone stop working");
            }
        };
        computer.transferData(phone);
    // 4. 创建了接口的匿名实现类的匿名对象
    computer.transferData(
        new Usb() {
          @Override
          public void start() {
            System.out.println("mp3开始工作");
          }

          @Override
          public void stop() {
            System.out.println("mp3停止工作");
          }
        });
    }
}
interface Usb{
  /**
   * 开始
   * */
  void start();

  /**
   * 停止
   * */
  void stop();
}
class Flash implements Usb{

    @Override
    public void start() {
    System.out.println("flash start");
    }

    @Override
    public void stop() {
        System.out.println("flash stop");
    }
}

class Printer implements Usb{
    @Override
    public void start() {
        System.out.println("Printer start");
    }

    @Override
    public void stop() {
        System.out.println("Printer stop");
    }
}

class Computer{
    public void transferData(Usb usb){
        usb.start();
        System.out.println("具体传输数据的细节");
        usb.stop();
    }
}