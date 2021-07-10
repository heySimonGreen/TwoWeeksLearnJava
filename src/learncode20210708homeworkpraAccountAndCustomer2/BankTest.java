package learncode20210708homeworkpraAccountAndCustomer2;

/**
 * @author: chenwei
 * @date: 2021/7/8 16:01
 */
public class BankTest {
    public static void main(String[] args){
        Bank bank = new Bank();
        bank.addCustomer("chen","wei");
        bank.getCustomer(0).setAccount(new Account(2000));
        bank.getCustomer(0).getAccount().withdraw(500);
        double balance = bank.getCustomer(0).getAccount().getBalance();
        System.out.println("客户：" + bank.getCustomer(0).getFirstName()+ bank.getCustomer(0).getLastName() + "的账户余额为：" + balance);

        System.out.println("*************************");
        bank.addCustomer("xu","lvhui");
        System.out.println("银行客户的个数为" + bank.getNumberOfCustomer());
    }
}
