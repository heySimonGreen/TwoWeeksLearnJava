package day1109project02.ui;

import day1109project02.bean.Customer;
import day1109project02.service.CustomerList;
import day1109project02.util.CmUtility;

/**
 * @author: chenwei
 * @date: 2021/7/9 0:02
 */
public class CustomerView {
    private CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("陈伟",'男',23,"18896173420","1183928999@qq.com");
        customerList.addCustomer(customer);
    }

    //显示客户软件界面的方法

    public void enterMainMenu(){
        boolean loopFlag = true;
        while (loopFlag){
            System.out.println("\n-----------客户信息管理软件-----------");
            System.out.println("            1 添加客户");
            System.out.println("            2 修改客户");
            System.out.println("            3 删除客户");
            System.out.println("            4 客户列表");
            System.out.println("            5 退出");
            System.out.println("            请选择（1-5）");
            char menu = CmUtility.readMenuSelection();
            switch (menu){
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomer();
                    break;
                case '5':
                    System.out.println("是否确认推出（Y/N）");
                    char isExit = CmUtility.readConfirmSelection();
                    if(isExit == 'Y'){
                        loopFlag = false;
                    }
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + menu);
            }
        }
    }
    //添加客户

    public void addNewCustomer(){
        System.out.println("------------------添加客户------------------");
        System.out.println("姓名： ");
        String name = CmUtility.readString(10);
        System.out.println("性别： ");
        char gender = CmUtility.readChar();
        System.out.println("年龄： ");
        int age = CmUtility.readInt();
        System.out.println("电话");
        String phone = CmUtility.readString(13);
        System.out.println("邮箱：");
        String email = CmUtility.readString(30);
        //将上述信息封装到对象中

        Customer customer = new Customer(name,gender,age,phone,email);
        boolean isSuccess = customerList.addCustomer((customer));
        if(isSuccess){
            System.out.println("-------------添加完成-------------");
        }else {
            System.out.println("-------------客户目录已满，添加失败-------------");
        }
    }
    //更改客户

    public void modifyCustomer(){
        System.out.println("-----------------修改客户-----------------");
        Customer customer;
        int number;
        for(;;){
            System.out.println("请选择待修改客户的编号（-1推出）");
            number = CmUtility.readInt();
            if (number== -1){
                return;
            }
            customer=customerList.getCustomer(number-1);
            if (customer == null){
                System.out.println("无法找到指定客户");
            }else {
                break;
            }
        }
        //修改客户信息

        System.out.println("姓名（" + customer.getName() + "):");
        String name = CmUtility.readString(10,customer.getName());
        System.out.println("性别（" + customer.getGender() + "):");
        char gender = CmUtility.readChar(customer.getGender());
        System.out.println("年龄（" + customer.getAge() + "):");
        int age = CmUtility.readInt(customer.getAge());
        System.out.println("电话（" + customer.getPhone() + "):");
        String phone = CmUtility.readString(13,customer.getPhone());
        System.out.println("邮箱（" + customer.getEmail() + "):");
        String email = CmUtility.readString(30,customer.getEmail());

        Customer newCustomer = new Customer(name,gender,age,phone,email);
        boolean isReplaced = customerList.replaceCustomer(number - 1,newCustomer);
        if(isReplaced){
            System.out.println("修改成功");
        }else {
            System.out.println("修改失败");
        }
    }
    //删除客户

    public void deleteCustomer(){
        int number;
        Customer customer;
        System.out.println("---------------------删除客户---------------------");
        for (;;){
            System.out.println("选择待删除客户的编号（-1退出 ）");
            number = CmUtility.readInt();
            if(number == -1){
                return;
            }
            customer = customerList.getCustomer(number -1);
            if(customer == null){
                System.out.println("无法找到指定客户！");
            }else {
                break;
            }
        }
        System.out.print("是否确认删除（Y/N）：");
        char isDelete = CmUtility.readConfirmSelection();
        if (isDelete == 'Y'){
            boolean deleteSuccess = customerList.deleteCustomer(number -1);
            if (deleteSuccess) {
                System.out.println("-------------删除完成-------------");
            }else {
                System.out.println("-------------删除失败-------------");
            }
        }else {
            return;
        }
    }
    //显示客户链表

    public void listAllCustomer(){
        System.out.println("列出客户");
        System.out.println("---------------客户列表--------------");
         int total = customerList.getTotal();
         if(total == 0){
             System.out.println("没有客户信息");
         }else {
             System.out.println("编号\t姓名\t性别\t年龄\t电话\t邮箱");
             Customer[] customers = customerList.getAllCustomers();
             for (int i = 0;i<customers.length;i++){
                 Customer customer = customers[i];
                 System.out.println((i+1) + "\t" + customer.getName() + "\t" + customer.getGender()
                         + "\t" + customer.getAge() + "\t" + customer.getPhone()
                         + "\t" + customer.getEmail());
             }
         }
        System.out.println("---------------客户列表完成--------------");
    }
    public static void main(String[] args){
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
