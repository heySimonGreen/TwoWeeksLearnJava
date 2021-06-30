package LearnCode20210628.day210629.CodeExecutionProcess;

/**
 * @Author chenwei
 * @Date 2021/6/29 12:23
 * @Version 1.0
 */
public class Rumenz {
    private Integer id=100;
    private  static String name="入门小站";
    {
        System.out.println("构造代码块。。。");
        System.out.println("变量 id:"+id);
    }
    static {
        System.out.println("静态变量name:"+name);
        System.out.println("静态代码块。。。");
    }
    //构造方法调用前会先去调用构造代码块
    public Rumenz() {
        System.out.println("构造方法。。。。");
    }
    public static void main(String[] args) {
        Rumenz r=new Rumenz();
    }
}
