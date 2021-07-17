package learncodeday15.stage;

/**
 * @author: chenwei
 * @date: 2021/7/16 22:59
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public SalariedEmployee(String name, MyDate myDate, double monthlySalary) {
        super(name, myDate);
        this.monthlySalary = monthlySalary;
    }


    @Override
    public double earnings() {
        return monthlySalary;
    }


    public void toStrings() {
    System.out.println(
        "(getName() + getNumber() + getMyDate()) = " + (getName() + getNumber() + getMyDate()));
    };
}
