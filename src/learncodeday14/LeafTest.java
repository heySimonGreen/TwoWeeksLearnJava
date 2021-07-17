package learncodeday14;

import java.sql.SQLSyntaxErrorException;

/**
 * @author: chenwei
 * @date: 2021/7/15 22:50
 * 总结：由父及子，静态先行
 */
public class LeafTest {
    public static void main(String[] args){
        new Leaf();
        System.out.println();
        new Leaf();
    }
}
class Root{
    static {
        System.out.println("root的静态初始化块");
    }
    {
        System.out.println("root的普通初始化块");
    }
    public Root(){
        System.out.println("root的无参数构造器");
    }
}
class Mid extends Root{
    static {
        System.out.println("mid的静态初始化块");
    }
    {
        System.out.println("mid的普通初始化块");
    }
    public Mid(){
        System.out.println("mid的无参数的构造器");
    }
    public Mid(String msg){
        this();//通过this调用同一类中重载的构造器
        System.out.println("mid的带参数构造器，其参数值： " + msg);
    }
}
class Leaf extends Mid{
    static {
        System.out.println("leaf的静态初始化代码块");
    }
    {
        System.out.println("leaf的普通初始化代码块");
    }
    public Leaf(){
        super();
        System.out.println("Leaf的构造器");
    }
}
