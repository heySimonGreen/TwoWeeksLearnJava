package learncodeday15.stage20;

/**
 * @author: chenwei
 * @date: 2021/7/19 15:50
 */
public class Test1 extends Bb implements Aa{
    public void printX(){
        //System.out.println(x);编译不通过，因为xS是不明确的

        System.out.println(super.x);
        System.out.println(Aa.x);
    }
}
interface Aa{
    int x=0;
}
class Bb{
    int x = 1;
}

