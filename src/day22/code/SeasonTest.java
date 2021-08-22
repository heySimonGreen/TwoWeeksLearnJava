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
 * 三、enum类中的常用方法
 * values()方法：返回枚举类型的对象数组。该方法可以很方便地遍历所有的枚举值。
 * valueOf(String str)方法可以把一个字符串转为对应的枚举类型对象，要求字符串必须是枚举类型对应
 * toString()返回当前枚举类对象常量的名称
 * 四、使用enum关键字定义的枚举类实现接口的情况
 * 1. 实现接口，在enum类中实现抽象方法
 * 2. 让枚举类的对象分别实现接口中的抽象方法·
  */
public class SeasonTest {
}
class Season{
    //1、 声明Season对象的的属性：private final修饰
    String seasonName;
    String seasonDesc;

    //2. 私有化的构造器，并给对象赋属性
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //3. 提供当前枚举类的多个对象：public static final 的
    public static final Season SPRING;
    public static final Season SUMMER;
    public static final Season AUTUMN;
    public static final Season WINTER;

    static {
        SPRING = new Season("春天", "春暖花开");
        SUMMER = new Season("夏天", "烈日炎炎");
        AUTUMN = new Season("秋天", "秋风萧瑟");
        WINTER = new Season("冬天", "冰天雪地");
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //其他诉求

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
