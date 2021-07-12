package learncodeday12.homeworksuperclass;

/**
 * @author: chenwei
 * @date: 2021/7/11 21:49
 */
public class CheckAccountTest {
    public static void main(String[] args){
        CheckAccount checkAccount = new CheckAccount(1122,20000,0.045,5000);
        checkAccount.withdraw(5000);
        System.out.println("余额：" + checkAccount.getBalance() + " 可透支额度："+checkAccount.getOverdraft());
        System.out.println("---------------------------------");
        checkAccount.withdraw(18000);
        System.out.println("余额：" + checkAccount.getBalance() + " 可透支额度："+checkAccount.getOverdraft());
        System.out.println("---------------------------------");
        checkAccount.withdraw(3000);
        System.out.println("余额：" + checkAccount.getBalance() + " 可透支额度："+checkAccount.getOverdraft());
        System.out.println("---------------------------------");
    }
}
