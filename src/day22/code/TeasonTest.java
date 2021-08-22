package day22.code;

/**
 * @author: chenwei
 * @date: 2021/8/20 20:12
 * @description:  使用enum定义的枚举类继承于java.lang.Enum
 *
 */
public class TeasonTest {
  public static void main(String[] args) {
    Teason teason = Teason.SPRING;
    System.out.println(teason.getClass().getSuperclass());
      Teason[] values = Teason.values();
      System.out.println("***********");
      for (int i=0;i<values.length;i++){
      System.out.println(values[i]);
      values[i].show();
      }
      System.out.println("***********");
      //values方法，返回枚举类的所有对象，数组形式呈现
      Thread.State[] values1 = Thread.State.values();
      //java线程6中状态，新建状态、运行状态、阻塞状态、等待、超时等待、死亡
      for (int i=0;i<values1.length;i++){
      System.out.println(values1[i]);
      }
      //valueOf(String objName):返回枚举类中对象名是objName的对象。如果没有objName则抛出异常
      Teason teason1 = Teason.valueOf("SPRING");
      System.out.println(teason1);
      System.out.println("*******");
      teason1.show();
  }
}
interface SeaTeInfo{
    void show();
}
//使用enum关键字枚举类
enum Teason implements SeaTeInfo{
    //1. 提供当前枚举类的对象，多个对象之间用逗号隔开，末尾对象分号结束
    SPRING("春天","春暖花开"){
        @Override
        public void show() {
            System.out.println("春天呀");
        }
    },
    SUMMER("夏天","热"){
        @Override
        public void show() {
            System.out.println("夏天呀");
        }}
    ,
    AUTUMN("秋天","凉快"){
        @Override
        public void show() {
            System.out.println("秋天呀");
        }}
    ,
    WINTER("冬天","冷"){
            @Override
            public void show() {
                System.out.println("冬天呀");
            }}
            ;

    //1、 声明Season对象的的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //2. 私有化的构造器，并给对象赋属性
    private Teason(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

}
