package learncode20210708homeworkpraAccountAndCustomer2;

/**
 * @author: chenwei
 * @date: 2021/7/8 15:00
 */
public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    /*
    * @description：存钱
    *  */

    public void deposit(double amount){
        if(amount > 0){
            this.balance += amount;
            System.out.println("存钱成功");
        }
    }

    /*
    *  @description ：取钱
    * */

    public void withdraw(double amount){
        if(balance > amount){
            this.balance -= amount;
            System.out.println("取钱成功");
        }else {
            System.out.println("余额不足");
        }
    }
}
