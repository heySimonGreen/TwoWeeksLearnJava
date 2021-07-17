package learncodeday14;

import com.sun.jmx.snmp.internal.SnmpSubSystem;

/**
 * @author: chenwei
 * @date: 2021/7/15 15:41
 */
public class AccountTest {
    public static void main(String[] args){
        Account account = new Account();
        Account account2 = new Account("CHENWEI",10000);
        System.out.println(Account.getInit());
        System.out.println(account.toString());
        System.out.println(account2.toString());
    }
}
