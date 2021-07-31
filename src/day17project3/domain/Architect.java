package day17project3.domain;

/**
 * @author: chenwei
 * @date: 2021/7/27 0:34
 */
public class Architect extends Designer{
    private int stock;

    public Architect() {
    }

    public Architect(int stock) {
        this.stock = stock;
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    @Override
    public String toString() {
        return getDetails() + "\t设计师\t" + getStatus().getNAME() + "\t" + getBonus() + "\t"+ stock + getEquipment().getDescription();
    }
    @Override
    public String toStringForTeamService(){
        return getMemberId() + "/" + getId() + "\t" + getName() + "\t" + getAge() + "\t"  + getSalary() + "\t架构师\t" + getBonus() + "\t"+ getStock();
    }
}
