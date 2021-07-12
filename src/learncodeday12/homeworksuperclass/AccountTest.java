package learncodeday12.homeworksuperclass;

/**
 * @author: chenwei
 * @date: 2021/7/11 21:32
 */
public class AccountTest {
    public static void main(String[] args){
        Account account = new Account(1122,20000,0.045);
        account.withdraw(30000);
        System.out.println(account.getBalance());
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println(account.getBalance());
        System.out.println(account.getMonthlyInterest());
    }
}
