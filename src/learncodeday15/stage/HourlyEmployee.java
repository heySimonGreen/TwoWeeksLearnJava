package learncodeday15.stage;

/**
 * @author: chenwei
 * @date: 2021/7/16 23:08
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private double hour;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public HourlyEmployee(String name, MyDate myDate, double wage,double hour) {
        super(name, myDate);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    public void toStrings(){
        System.out.println(
                "(getName() + getNumber() + getMyDate()) = " + (getName() + getNumber() + getMyDate()));
    }
}
