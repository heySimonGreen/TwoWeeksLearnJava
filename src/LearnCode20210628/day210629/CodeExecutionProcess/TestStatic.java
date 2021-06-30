package LearnCode20210628.day210629.CodeExecutionProcess;

/**
 * @Author chenwei
 * @Date 2021/6/29 14:15
 * @Version 1.0
 */
//详解Java中静态方法 https://blog.csdn.net/qq_39990827/article/details/90378241
public class TestStatic {
    public static void main(String[]args){
        System.out.println(S.getStatic());//使用类名加前缀访问静态方法
        S s=new S();
        System.out.println(s.getStatic());//使用实例化对象名访问静态方法
        System.out.println(s.get());
    }
    public static class S
    {
        private static int a;
        private int t=0;

        //静态初始器：由static和{}组成，只在类装载的时候（第一次使用类的时候）执行一次，往往用来初始化静态变量。
        static{
            a=10;
        }

        //静态方法只能访问静态数据成员
        public static int getStatic()
        {
            return a;
        }

        public int getT()
        {
            return t;
        }

        //非静态方法可以访问静态方法和非静态方法
        public int get()
        {
            getT();
            getStatic();
            t=a;//非静态方法可以访问非静态数据成员和静态数据成员
            return t;
        }
    }
}
