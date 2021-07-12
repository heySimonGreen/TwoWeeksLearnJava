package learncodeday12.homeworksuperclass;

/**
 * @author: chenwei
 * @date: 2021/7/11 21:15
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
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

    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }

    public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            System.out.println("取钱成功");
            balance -= amount;
        }else {
            System.out.println("取钱失败");
        }
    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("存钱成功");
        }else{
            System.out.println("存钱失败");
        }
    }
}
