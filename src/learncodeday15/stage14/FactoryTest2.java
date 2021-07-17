package learncodeday15.stage14;

/**
 * @author: chenwei
 * @date: 2021/7/17 23:59
 * 简单工厂模式
 * 缺点：对于增加新产品，不修改代码的话，是无法拓展的。违反了开闭原则（对拓展开放；对修改封闭）
 * 造的事儿通过工厂帮我造好，自己不直接造对象
 */
public class FactoryTest2 {
    public static void main(String[] args){
        Car a = CarFactory.getCar("audi");
        a.run();
        Car b = CarFactory.getCar("byd");
        b.run();
        Car c =CarFactory.getCar("chen");
        c.run();
    }
}
interface Car2{
    /**
     * 跑 */
    void run();
}
class Audi2 implements Car2{
    @Override
    public void run() {
        System.out.println("audi running");
    }
}
class Byd2 implements Car2{
    @Override
    public void run() {
        System.out.println("byd running");
    }
}
class CarFactory{
    //方式1

    public static Car getCar(String type){
        String audi = "audi";
        String byd = "byd";
        if (audi.equals(type)){
            return new Audi();
        }else if(byd.equals(type)){
            return new Byd();
        }else {
            return null;
        }
    }
//    //方式2
//
//    public static Car getAudi(){
//        return new Audi();
//    }
//    public static Car getByd(){
//        return new Byd();
//    }
}