package LearnCode.day1128;

/**
 * @author: chenwei
 * @data: 2020/11/28 20:07
 */
public class AutoInc {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i: " + i);
        System.out.println("++i: " + ++i); // 前递增
        System.out.println("i++: " + i++); // 后递增
        System.out.println("i: " + i);
        System.out.println("--i: " + --i); // 前递减
        System.out.println("i--: " + i--); // 后递减
        System.out.println("i: " + i);

        //== 和 != 比较的是对象引用，所以输出实际上应该是先输出 false，再输出 true（译者注：如果你把 47 改成 128，那么打印的结果就是这样，因为 Integer 内部维护着一个 IntegerCache 的缓存，默认缓存范围是 [-128, 127]，所以 [-128, 127] 之间的值用 == 和 != 比较也能能到正确的结果，但是不推荐用关系运算符比较
        Integer n1 = -128;
        Integer n2 = -128;
        System.out.println(n1 == n2);
        System.out.println(n1 != n2);
    }
}
