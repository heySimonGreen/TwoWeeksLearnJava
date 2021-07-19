package learncodeday15.stage20.innerclass;

/**
 * @author: chenwei
 * @date: 2021/7/19 23:17
 */
public class InnerClassTest {
}
class Person{
    String name;
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
        String name;
        public void sing(){

            System.out.println("我是一只小小鸟");
            eat();//这里省略了
            Person.this.eat();
        }
    }
}
