package learncode20210706day10basic;

import javax.swing.plaf.synth.SynthSliderUI;

/**
 * @author: chenwei
 * @date: 2021/7/8 11:58
 */
public class Boy {
    private String name;
    private int age;
    public Boy(){
    }

    public Boy(String name, int age){
        this.name = name;
        this.age = age;
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

    public void marry(Girl girl){
        System.out.println("我也喜欢 " + girl.getName());
    }
    public void shout(){
        int legalAge = 22;
        if(age >= legalAge){
            System.out.println("你可以合法地去登记结婚了。");
        }else {
            System.out.println("先多谈恋爱吧。");
        }
    }
}
