package learncode20210708homeworkpraAccountAndCustomer2;

import java.util.Arrays;

/**
 * @author: chenwei
 * @date: 2021/7/8 15:20
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];
    }

    /*
    * @description:添加客户
    *
    * */

    public void addCustomer(String firstName,String lastName){
        Customer customer = new Customer(firstName,lastName);
        customers[numberOfCustomer] = customer;
        numberOfCustomer++;
    }

    /*
     * @description:获取客户数量
     *
     * */

    public int getNumberOfCustomer(){
        return numberOfCustomer;
    }

    /*
     * @description:获取指定客户
     *
     * */

    public Customer getCustomer(int index){
        if(index >=0 && index <numberOfCustomer){
            return customers[index];
        }
        return null;
    }
}
