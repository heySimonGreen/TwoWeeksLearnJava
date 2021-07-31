package day18thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: chenwei
 * @date: 2021/8/1 1:01
 * @description: 描述
 */
class BankH implements Runnable{
    private double money=10000.00;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void run() {
        ReentrantLock reentrantLock = new ReentrantLock();

        for (int i=0;i<3;i++){
            try {
                reentrantLock.lock();
                saveMoney();
            } finally {
                reentrantLock.unlock();
            }
        }

    }
    public void saveMoney(){
        money = money + 1000;
        System.out.println("余额为： " + money + " " +Thread.currentThread().getName());
    }
}
public class ThreadHomeworkVideo14 {
    public static void main(String[] args){
        BankH bankH = new BankH();
        Thread thread1 = new Thread(bankH);
        Thread thread2 = new Thread(bankH);
        thread1.start();
        thread2.start();

    }
}
