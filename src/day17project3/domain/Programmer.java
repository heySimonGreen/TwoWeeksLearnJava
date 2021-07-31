package day17project3.domain;
import day17project3.domain.Status;

/**
 * @author: chenwei
 * @date: 2021/7/27 0:09
 */
public class Programmer extends Employee{
    @Override
    public String toString() {
        return super.toString() + "\t程序员\t" + status.getNAME() + "\t\t\t" + equipment.getDescription() + "\t";
    }
    public String toStringForTeamService(){
        return memberId + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t"  + getSalary() + "\t程序员";
    }

    private int memberId;
    private Status status = Status.FREE;
    private Equipment equipment;

    public Programmer(int id, String  name, int age, double salary ,Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public Programmer() {
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }
}
