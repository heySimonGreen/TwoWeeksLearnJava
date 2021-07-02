package LearnCode20210630.String;

/**
 * @author: chenwei
 * @date: 2021/7/1 17:04
 */
public class LogicOperationSymbol {
    public static void main(String[] a){
        boolean x = true;
        boolean y = true;
        short z = 42;
        if((z++ == 42)&&(y = true))z++;
        if((x=false)||(++z==45))z++;
        System.out.println("z:" + z);
    }
}
