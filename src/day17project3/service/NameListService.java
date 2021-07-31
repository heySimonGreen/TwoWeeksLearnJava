package day17project3.service;

import day17project3.domain.*;

import static day17project3.service.Data.*;

/**
 * @author: chenwei
 * @date: 2021/7/27 0:46
 */
public class NameListService {
    private Employee[] employee;

    /**
     * 1.根据项目提供的Data类构建相应大小的employee数组
     * 2.再更具Data类中的数据构建不同的对象，包括Employee,Programmer,Designer和Architect.
     * 3.将对象存于数组中
     * */
    public NameListService() {
        employee = new Employee[EMPLOYEES.length];
        for (int i=0;i<EMPLOYEES.length;i++){
            //获取员工类型
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            //获取员工的其他信息
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus;
            int stock;

            switch (type){
                case EMPLOYEE:
                    employee[i] = new Employee(id,name,age,salary);
                    break;
                case PROGRAMMER:
                    equipment = createEquipment(i);
                    employee[i] = new Programmer(id,name,age,salary,equipment);
                    break;
                case DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employee[i] = new Designer(id,name,age,salary,equipment,bonus);
                    break;
                case ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employee[i] = new Architect(id,name,age,salary,equipment,bonus,stock);
                    break;
                default:
                    System.out.println("default" + this.getClass());
            }
        }

    }
    /**
     * 获取指定位置员工
    * */
    private Equipment createEquipment(int i) {
        int key = Integer.parseInt(EQUIPMENT[i][0]);
        String modelOrName = EQUIPMENT[i][1];
        switch (key){
            /*21*/
            case PC:
                String display = EQUIPMENT[i][2];
                return new Pc(modelOrName,display);
                /*22*/
            case NOTEBOOK:
                double price = Double.parseDouble(EQUIPMENT[i][2]);
                return new Notebook(modelOrName,price);
                /*23*/
            case PRINTER:
                Printer printer = new Printer();
                String type = EQUIPMENT[i][2];
                return new Printer(modelOrName,type);
//                break;
            default:
                return null;
        }

    }

    /**
     * 获取当前所有员工
     * */
    public Employee[] getAllEmployees(){
        return employee;
    }
    /**
    * 获取指定id的员工
    * */
    public Employee getEmployee(int id) throws TeamException {
        for (int i=0;i<employee.length;i++){
            if (id == employee[i].getId()){
                return employee[i];
            }
        }
        throw new TeamException("getEmployee id error,can not find this id,employee not find");
    }
}
