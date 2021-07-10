package learncodeday12.homework1;

/**
 * @author: chenwei
 * @date: 2021/7/9 16:23
 */
public class KidsTest {
    public static void main(String[] args){
        Kids someKid = new Kids();
        someKid.setSex(1);
        someKid.setSalary(4000);
        someKid.setYearsOld(22);
        someKid.employed();
        someKid.printAge();
        someKid.manOrWoman();
    }
}
