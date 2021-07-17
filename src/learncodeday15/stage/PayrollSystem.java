package learncodeday15.stage;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author: chenwei
 * @date: 2021/7/16 23:16
 */
public class PayrollSystem {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
    System.out.println("month = " + month);
        Employee[] employees =
                new Employee[]{
                        new HourlyEmployee("chenwei1",new MyDate("2021","3","14"),20.0,204.0),
                        new HourlyEmployee("chenwei2",new MyDate("2021","3","13"),29.0,222.0),
                        new HourlyEmployee("chenwei3",new MyDate("2021","7","16"),20.0,211.0),
                        new HourlyEmployee("chenwei4",new MyDate("2021","3","15"),20.0,230.0),
                        new SalariedEmployee("chenchunyang5",new MyDate("2021","6","4"),6000),
                        new SalariedEmployee("chenchunyang",new MyDate("2021","5","4"),6000),
                        new SalariedEmployee("chenchunyang7",new MyDate("2021","7","4"),6000),
                        new SalariedEmployee("chenchunyang8",new MyDate("2021","8","4"),6000),
                        new SalariedEmployee("chenchunyang9",new MyDate("2021","7","4"),6000)
                };
        for (int i=0;i<employees.length;i++){
            Employee employee = employees[i];
      System.out.println(
              "姓名： "+(employee.getName()
                  + " 编号： "+employee.getNumber()
                  + " 生日： "+employee.getMyDate().getYearMonthDay()));
        }
        for (int i=0;i<employees.length;i++){
            Employee employee = employees[i];
            System.out.println(
                    "姓名： "+(employee.getName()
                            + " 编号： "+employee.getNumber()
                            + " 生日： "+employee.getMyDate().getYearMonthDay()));
            if (employee.getMyDate().getMonth().equals(String.valueOf(month))){
                System.out.println("生日快乐"+employee.getName());
                System.out.println("   月工资为：" + (employee.earnings() + 100.0));
            }
        }

    }
}
