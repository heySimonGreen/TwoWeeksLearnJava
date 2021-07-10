package learncode20210708homeworkpraAccountAndCustomer;

import java.awt.font.TextHitInfo;

/**
 * @author: chenwei
 * @date: 2021/7/8 12:53
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    /*
    *  Description: 取钱
    * */

    public void withdraw(double amount){
        if(balance < amount){
            System.out.println("余额不足");
        }else {
            this.balance = this.balance - amount;
            System.out.println("取款成功" + amount + "yuan");
        }
    }

    public void deposit(double amount){
        this.balance = this.balance + amount;
        System.out.println("存款成功");
    }
}
