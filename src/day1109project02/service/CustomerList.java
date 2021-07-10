package day1109project02.service;

import day1109project02.bean.Customer;

/**
 * @author: chenwei
 * @date: 2021/7/8 21:46
 */
public class CustomerList {
    //用来保存客户对象的数组

    private Customer[] customers;
    //记录已保存客户对象的数量

    private int total;
    /*
    * 用来初始化customer数组，totalCustomer指定数组的最大空间。
    * */

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }
    //将指定的客户添加到数组中，成功返回true，失败返回false

    public boolean addCustomer(Customer customer){
        if(total<customers.length){
            customers[total++] = customer;
            System.out.println("插入CustomerList成功");
            return true;
        }else {
            System.out.println("插入CustomerList失败，数组已满");
            return false;
        }
    }
    //修改指定位置上的客户信息,成功返回true，失败返回false

    public boolean replaceCustomer(int index,Customer customer){
        if(index < 0 || index >= total){
            return false;
        }else {
            customers[index] = customer;
            return true;
        }
    }
    //删除指定位置上的客户信息,成功返回true，失败返回false

    public boolean deleteCustomer(int index){
        if(index<0 || index >= total){
            System.out.println("删除失败，删除位置不正确");
            return false;
        }else {
            for (int i=index;i<total;i++){
                customers[i] =customers[i + 1];
            }
            customers[--total] = null;
            return true;
        }
    }
    //获取所有的客户信息

    public Customer[] getAllCustomers(){
        Customer[] c = new Customer[total];
        for(int i = 0;i<total;i++){
            c[i] = customers[i];
        }
        return c;

    }
    //获取指定位置上的信息

    public Customer getCustomer(int index){
        if(index<0||index>=total){
            System.out.println("指定位置错误，没有这个位置。");
            return null;
        }else {
            return customers[index];
        }
    }

    public int getTotal(){
        return total;
    }
}
