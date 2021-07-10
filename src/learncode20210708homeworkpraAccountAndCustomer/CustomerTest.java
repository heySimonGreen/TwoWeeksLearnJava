package learncode20210708homeworkpraAccountAndCustomer;

/**
 * @author: chenwei
 * @date: 2021/7/8 14:04
 */
public class CustomerTest {
    public static void main(String[] args){
        Customer customer = new Customer("Smith","Jane");
        Account account = new Account(1000,2000.0,1.23);
        customer.setAccount(account);
        account.deposit(100.0);
        account.withdraw(960.0);
        account.withdraw(2000.0);
        System.out.println("customer name: " + customer.getLastName() + " " + customer.getFirstName());
        System.out.println("customer account info: ");
        System.out.println("customer id': " + account.getId());
        System.out.println("customer Balance: " + account.getBalance());
        System.out.println("customer AnnualInterestRate: " + account.getAnnualInterestRate());
    }
}
