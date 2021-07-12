package learncodeday12.homeworksuperclass;

/**
 * @author: chenwei
 * @date: 2021/7/11 21:39
 */
public class CheckAccount extends Account{
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount < getBalance()){
            super.withdraw(amount);
            System.out.println("取款成功");
        }else if (amount>getBalance()){
            double canOverDraft = amount - getBalance();
            super.withdraw(getBalance());
            if (canOverDraft <= overdraft){
                overdraft -= canOverDraft;
                System.out.println("透支取款成功");
            }else {
                System.out.println("取款超过可透支限额");
            }
        }

    }
}
