package learncodeday12.homework1;

/**
 * @author: chenwei
 * @date: 2021/7/9 16:22
 */
public class Kids extends Mankind{
    private int yearsOld;
    public void printAge(){
        System.out.println(yearsOld);
    }

    public Kids() {
    }

    @Override
    public void employed() {
        System.out.println("Kids should study and no job");
    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }
}
