package learncodeday14;

/**
 * @author: chenwei
 * @date: 2021/7/14 22:26
 */
public class StaticTest {

    public void StaticTest1(){

    }
    public static void main(String[] args){
        Chinese chinese = new Chinese();
        chinese.name="姚明";
        chinese.age=40;

        Chinese chinese1 = new Chinese();
        chinese1.name="马龙";
        chinese1.age = 30;

        chinese.nation ="CHN";
        chinese1.nation = "CHINA";

        System.out.println(chinese.nation);
    }
}
class Chinese{
    String name;
    int age;
    static String nation;
}