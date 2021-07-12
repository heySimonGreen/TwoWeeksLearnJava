package learncodeday12.homeworksuperclass;

/**
 * @author: chenwei
 * @date: 2021/7/11 22:20
 */
public class Man extends Person{
    private boolean isSmoking;
    int id = 1002;
    public void earnMoney(){
        System.out.println("男人负责挣钱养家");
    }
    @Override
    public void eat(){
        System.out.println("男人多吃肉，长肌肉");
    }
    @Override
    public void walk(){
        System.out.println("男人霸气的走路");
    }

    public boolean isSmoking() {
        return isSmoking;
    }

    public void setSmoking(boolean smoking) {
        isSmoking = smoking;
    }
}
