package learncodeday15.stage1to12vedio;

/**
 * @author: chenwei
 * @date: 2021/7/16 17:13
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee employee = new CommonEmployee("CHENWEI",3000.0);
        System.out.println(employee.getName());
        System.out.println(employee.getSalary());
        System.out.println(employee.getId());
        employee.work();

        Employee employee2 = new Manager("chenda",5000,50000);
        System.out.println(employee2.getName());
        System.out.println(employee2.getSalary());
        System.out.println(employee2.getId());
        employee2.work();

    }
}
