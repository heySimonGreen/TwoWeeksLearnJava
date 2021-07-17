package learncodeday15.stage;

/**
 * @author: chenwei
 * @date: 2021/7/16 22:49
 */
public abstract class Employee {
    private String name;
    private int number;
    private MyDate myDate;

    private static int init = 1000;

    public Employee(String name, MyDate myDate) {
        this.name = name;
        this.myDate = myDate;
        number = init++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }
  /**
   * 攒钱
   * 返回工资
   * */
  public abstract double earnings();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", myDate=" + myDate +
                '}';
    }
}
