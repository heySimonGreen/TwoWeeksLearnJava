package learncode20210706day10basic;

/**
 * @author: chenwei
 * @date: 2021/7/7 13:58
 */
public class Person {
    private int age;
    private String name;
    public void setAge(int age){
        if(age <= 130){
            this.age = age;
        }else {
            System.out.println("设置年龄不合法,大于了130岁");
            this.age = 0;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return this.age;
    }

    public Person(){
        this.age = 18;
        this.name = "chenwei";
    }
}
