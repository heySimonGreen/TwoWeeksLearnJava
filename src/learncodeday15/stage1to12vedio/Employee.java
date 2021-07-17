package learncodeday15.stage1to12vedio;/**
*   @author: chenwei
*   @date: 2021/7/16 16:26
*/
public abstract class Employee {
    private String name;
    private int id;
    private double salary;

    private static int init = 1000;
    private static int total = 0;

    public Employee() {
        id = init++;
        total++;
    }

    public Employee(String name, double salary) {
        this();
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    /**
   * 测认
   * */
  public abstract void work();
}
