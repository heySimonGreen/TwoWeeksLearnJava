package day18thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author: chenwei
 * @date: 2021/8/6 0:40
 * @description: 创建多线程的方式：实现callable方法 ---jdk5.0新增
 * 如何理解实现callable接口的方式创建多线程比实现Runnable接口创建多线程方式强大？
 * 1.call()可以有返回值
 * 2.call()可以抛出异常，被外面的操作捕获，获取异常信息
 * 3.Callable支持泛型
 */
public class ThreadMethod3 {
  public static void main(String[] args) {
      //3。创建Callable实现类的对象
      NumberThread numberThread = new NumberThread();
      //4.将此callable实现类的对象作为参数传递到FutureTask构造器中，创建FutureTask对象
      FutureTask futureTask = new FutureTask(numberThread);
      //5.将FutureTask的对象作为参数传递到Thread类的构造器中，创建Thread对象，并调用
      Thread thread = new Thread(futureTask);
      thread.start();
      try {
          //6.获取callable中call的返回值
          //get返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值
          Object o = futureTask.get();
          System.out.println("sum is : " + o );
      } catch (InterruptedException e) {
          e.printStackTrace();
      } catch (ExecutionException e) {
          e.printStackTrace();
      }
  }
}
//1.创建一个实现Callable的实现类
class NumberThread implements Callable{

    //2.实现call方法，将此线程需要执行的操作声明在call中
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i=0;i<=100;i++){
            if (i%2==0){
                System.out.println(i);
                sum =sum + i;
            }
        }
        return sum;
    }
}
