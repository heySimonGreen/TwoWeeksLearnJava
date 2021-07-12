package learncodeday12.homeworksuperclass;

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

        Person person2 = new Woman();
    }
}
