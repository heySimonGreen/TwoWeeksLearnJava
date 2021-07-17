package learncodeday15.stage1to12vedio;

/**
 * @author: chenwei
 * @date: 2021/7/16 18:59
 */
public class PersonTest {
    public static void main(String[] args){
        //创建抽象类的匿名子类对象
        Person person = new Person() {
            @Override
            public void sayName() {
                System.out.println("heoo");
            }
        };
    }
}
abstract class Person{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

  /**
   * 输出name
   * */
  public abstract void sayName();
}
class Worker extends Person{
    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void sayName() {
        System.out.println(getName());
    }
}
