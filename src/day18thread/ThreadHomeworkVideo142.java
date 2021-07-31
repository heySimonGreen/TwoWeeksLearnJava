package day18thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: chenwei
 * @date: 2021/8/1 1:25
 * @description: 描述
 */
public class ThreadHomeworkVideo142 {
  public static void main(String[] args) {
      Account account = new Account(10000);
      Customer c1 = new Customer(account);
      Customer c2 = new Customer(account);
      c1.setName("c1");
      c2.setName("c2");
      c1.start();
      c2.start();

  }
}
class Account{
    private double balance;
    public Account(double balance){
        this.balance = balance;
    }
    public void deposit(double amt){
//    public synchronized void deposit(double amt){ 方法一 这里的this指定是？一定要注意不能是多个 这是使用的同一个this  account
        if (amt>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = balance + amt;
            System.out.println("deposite successful balance is " + balance +" " + Thread.currentThread().getName());
        }
    }
}
class Customer extends Thread{
    private Account account;
    public Customer(Account account){
        this.account = account;
    }

    //方式二 这里式用继承Thread类,所以创建的ReenTrantLock一定要加Static
    static ReentrantLock r = new ReentrantLock();
    @Override
    public void run() {
        for (int i=0;i<3;i++){

            try {
                r.lock();
                account.deposit(1000);
            } finally {
                r.unlock();
            }
        }
    }
}
