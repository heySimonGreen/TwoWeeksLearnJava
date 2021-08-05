package day18thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * @author: chenwei
 * @date: 2021/8/6 1:11
 * @description: 创建线程的方式4 线程池 真正开发中都是先用的线程池，因为那几个好处
 * 使用线程池的好处：
 * 1.提高响应速度（减少了创建新线程的时间）
 * 2.降低资源消耗(重复利用线程池中的线程，不需要每次都创建)
 * 3.便于线程管理(corePoolSize:核心线程的大小 maximumPoolSize:最大线程数 keepAliveTime:线程没有任务时最多保持多长时间后会终止)
 *
 * 面试题：创建多线程有几种方式？
 *
 * */
public class ThreadPool {
  public static void main(String[] args) {
      //1.提供指定数量的线程池
      ExecutorService executorService = Executors.newFixedThreadPool(10);
    // 设置线程池的属性
        System.out.println(executorService.getClass());
      ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor)executorService;
      threadPoolExecutor.setCorePoolSize(15);

      //2.执行指定的线程的操作，需要提供实现Runnable接口或Callable接口实现类的对象(Runnable用execute,Callable用submit)
      //适用于runnable接口
      executorService.execute(new ThreadPoolRunnable());
      executorService.execute(new ThreadPoolRunnable2());
      //3.关闭连接池
      executorService.shutdown();
      //适用于callable接口
      //executorService.submit();
  }
}
class ThreadPoolRunnable implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if (i%2 == 0){
                System.out.println(Thread.currentThread().getName()+  " " + i);
            }
        }
    }
}
class ThreadPoolRunnable2 implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            if (i%2 != 0){
                System.out.println(Thread.currentThread().getName()+  " " + i);
            }
        }
    }
}
