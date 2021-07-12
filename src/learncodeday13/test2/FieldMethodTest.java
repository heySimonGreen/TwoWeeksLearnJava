package learncodeday13.test2;

/**
 * @author: chenwei
 * @date: 2021/7/12 22:57
 */
class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;
    @Override
    public void display(){
        System.out.println(this.count);
    }
}

/**
 * @author 11839
 */
public class FieldMethodTest {
    public static void main(String[] args){
        Sub s= new Sub();
        System.out.println(s.count);
        s.display();
        Base b = s;
        System.out.println(b == s);
        System.out.println(b.count);
        b.display();
    }

}
