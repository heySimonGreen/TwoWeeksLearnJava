package learncodeday13.test1;

/**
 * @author: chenwei
 * @date: 2021/7/11 22:26
 */
public class PersonTest {
    public static void main(String[] args){
        Person person = new Person();
        person.eat();

        Man man = new Man();
        man.earnMoney();
        man.setAge(25);
        man.earnMoney();
        System.out.println("-------------------------");
        //对象的多态性：父类的引用指向子类的对象。
        Person person1 = new Man();
        //多态的使用：当调用子夫类同名同参数的方法时，实际执行的是子类重写父类的方法---虚拟方法调用
        person1.eat();
        person1.walk();
        System.out.println(person1.id);
        //person1.earnMoney();

        //不能调用子类所特有的方法、属性：编译时，person1是Person类型。

        person1.name = "chen";
//        person1.earnMoney();
//        person1.isSmoking();
        //有了对象的多态性以后，内存中实际上是加载了子类所特有的属性和方法，但是由于变量声明为父类类型，导致编译时，只能调用父类中声明的属性和方法。子类特有的方法不能调用。
        //如何才能调用子类特有的属性和方法？
        Man man1 = (Man) person1;
        man1.earnMoney();
        man1.isSmoking = true;
        //使用强转时，可能出现ClassCastException
//        Woman woman = (Woman) person1;
//        woman.goShopping();

        /*
        * instanceof关键字的使用
        * a instanceof A:判断对象a是否是类A的实例。如果是，返回true，如果不是，返回false.
        * 使用情景：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，
        * 先进行instanceof的判断，一旦返回true，就向下转向。如果返回false,不进行向下转型。game.
        * */

        if(person1 instanceof Woman){
            Woman woman1 = (Woman)person1;
            woman1.goShopping();
            System.out.println("******women**********");
        }
        if(person1 instanceof Man){
            Man woman1 = (Man)person1;
            woman1.earnMoney();
            System.out.println("******man**********");
        }
        if (person1 instanceof Person){
            System.out.println("******Person*******");
        }
        if (person1 instanceof Object){
            System.out.println("******Object*******");
        }

//        //练习
//        //问题一：编译时通过，运行时不通过
//        //举例一：
//        Person p3 = new Woman();
//        Man m2 = (Man)p3;   //这里要用instanceof
//
//        //举例二：
//        Person p4 = new Person();
//        Man m4 = (Man)p4;
//
//        //问题二：编译通过，运行也通过
//        Object obj = new Woman();
//        Person p = (Person)obj;
//
//        //编译不通过
//        Man m5 = new Woman();
    }
}
