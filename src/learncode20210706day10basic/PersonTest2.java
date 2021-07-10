package learncode20210706day10basic;

import LearnCode20210628.day210629.CodeExecutionProcess.TestStatic;

/**
 * @author: chenwei
 * @date: 2021/7/7 20:37
 * this调用构造器 day1017
 * 如何在这个构造器中调用另外的构造器
 */
public class PersonTest2 {
    public static void main(String[] args){
        Person2 person2 = new Person2();
        person2.setAge(1);
        System.out.println(person2.getAge());
        person2.eat();
        System.out.println();


        Person2 person21 = new Person2("Jerry",20);
        System.out.println(person21.getAge() + "    " + person21.getName());

    }
}
class Person2{
    private String name;
    private int age;
    public Person2(){
        String info = new String("40行代码");
        System.out.println(info);
//        this.eat();
        //Person初始化时，需要考虑如下的1，2，3，4，、、、、（公40行代码）
    }
    public Person2(String name){
        this();
        this.name = name;
        //Person初始化时，需要考虑如下的1，2，3，4，、、、、（公40行代码）
    }
    public Person2(int age){
        this();
        this.age = age;
    }
    public Person2(String name,int age){
        this(age);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println("eat");
    }
}
