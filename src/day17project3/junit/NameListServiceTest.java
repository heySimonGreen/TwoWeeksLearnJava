package day17project3.junit;

import day17project3.domain.Employee;
import day17project3.service.NameListService;
import day17project3.service.TeamException;
import org.junit.Test;

import javax.swing.plaf.PanelUI;

/**
 * @author: chenwei
 * @date: 2021/7/27 12:36
 */
public class NameListServiceTest {
    @Test
    public void testGetAllEmployees(){
        NameListService nameListService = new NameListService();
        Employee[] employees = nameListService.getAllEmployees();
        for (int i=0;i<employees.length;i++){
            System.out.println("employees[i].toString() = " + employees[i].toString());
        }
    }

    @Test
    public void testGetEmployee() {
        NameListService nameListService = new NameListService();
        int id = 1;
        id = 101;
        try {
            Employee employee = nameListService.getEmployee(id);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }
}
