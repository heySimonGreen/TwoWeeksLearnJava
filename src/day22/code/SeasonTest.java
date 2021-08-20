package day22.code;

/**
 * @author: chenwei
 * @date: 2021/8/20 15:21
 * @description: 枚举类
 * 一、 枚举类的使用
 * 1. 枚举类的理解：类的对象只有有限个，确定的。我们称此类为枚举类
 * 2. 当需要定义一组常量时，强烈建议使用枚举类
 * 3. 如果枚举类中只有一个对象，则可以作为单例模式的实现方式
 * 二、 如何定义枚举类
 * 方式一、jdk5.0之前自定义枚举类
 * 方式二、jdk5.0之后，可以使用enum关键字定义枚举类
 */
public class SeasonTest {
}
class Season{
    //1、 声明Season对象的的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2. 私有化的构造器，并给对象赋属性
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3. 提供当前枚举类的多个对象：public static final 的
    public static final Season SPRING;
    public static final Season SUMMER;
    public static final Season AUTUMN;
    public static final Season ;

    static {
        SPRING = new Season("春天", "春暖花开");
    }
}
