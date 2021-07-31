package day17project3.domain;

/**
 * @author: chenwei
 * @date: 2021/7/27 0:31
 */
public class Designer extends Programmer{
    private double bonus;

    public Designer() {
    }

    public Designer(double bonus) {
        this.bonus = bonus;
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus().getNAME() + "\t" + bonus + "\t\t" + getEquipment().getDescription();
    }
    @Override
    public String toStringForTeamService(){
        return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t"  + getSalary() + "\t设计师\t" + getBonus();
    }
}
