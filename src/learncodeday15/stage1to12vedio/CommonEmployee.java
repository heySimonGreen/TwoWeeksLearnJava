package learncodeday15.stage1to12vedio;

/**
 * @author: chenwei
 * @date: 2021/7/16 16:34
 */
public class CommonEmployee extends Employee{
    public CommonEmployee(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(double salary) {
        super.setSalary(salary);
    }

    @Override
    public void work() {
        System.out.println("CommonEmployee work");
    }

}
