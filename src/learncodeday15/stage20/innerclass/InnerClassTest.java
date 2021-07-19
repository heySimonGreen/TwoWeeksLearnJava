package learncodeday15.stage20.innerclass;

/**
 * @author: chenwei
 * @date: 2021/7/19 23:17
 */
public class InnerClassTest {
    public static void main(String[] args){
        //创建Dog实例(静态的成员内部类):
        Person.Dog dog = new Person.Dog();
        dog.show();
        //创建Bird实例(非静态的成员内部类):
//        Person.Dog dog = new Person.Dog();错误的，要有外部的实例才可以
        Person p = new Person();
        Person.Bird bird = p.new Bird();
        bird.sing();

        System.out.println("*******");
        bird.display("黄鹂鸟");
    }
}
class Person{
    String name = "小明";
    int age;
    public void eat(){
        System.out.println("人：吃饭");
    }

    //静态成员内部类

    static class Dog{
        String name;
        int age;
        public void show(){
            System.out.println("卡拉 is a dog");
            //静态加载块，不能调用eat()方法
//            eat();
        }
    }
    //非静态成员内部类

    class Bird{
        String name = "杜鹃";
        public void sing(){

            System.out.println("我是一只小小鸟");
            eat();//这里省略了
            Person.this.eat();
        }
        public void display(String name){
            System.out.println(name);//方法的形参
            System.out.println(this.name);//内部类的属性
            System.out.println(Person.this.name);//外部类的属性
        }
    }
}
