package LearnCode.day1128;

/**
 * @author: chenwei
 * @data: 2020/11/28 20:11
 */
class Value{
    int i;
}
public class EqualsMethod2 {
    public static void main(String[] args) {
        //在比较基本类型时，我们可以使用==号来比较。但是比较两个对象的引用时，==比较的是两个引用是否引用的同一个对象。
        Value v1 = new Value();
        Value v2 = new Value();
        Value v3 = v2;
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
        System.out.println(v1==v2);
        System.out.println(v3==v2);
    }
}
