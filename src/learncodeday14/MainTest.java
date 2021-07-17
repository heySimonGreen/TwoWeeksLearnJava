package learncodeday14;

/**
 * @author: chenwei
 * @date: 2021/7/15 21:15
 */
public class MainTest {
    public static void main(String[] args){
        Main.main(new String[100]);
    }
}
class Main{
    public static void main(String[] args){
        for (int i=0;i<args.length;i++){
            args[i] = "args" + i;
            System.out.println(args[i]);
        }
    }
}