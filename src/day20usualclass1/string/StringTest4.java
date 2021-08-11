package day20usualclass1.string;

/**
 * @author: chenwei
 * @date: 2021/8/9 2:25
 * @description: 这是一道面试题 String的不可变性和值传递机制考察
 * 基本数据类型传递的是数据
 * 引用数据类型传递的是地址值(不要记引用类型把地址传过去，把里面的值该了原来的也改了，这个是错的，比如这个String不可改)
 */
public class StringTest4 {
    String str = new String("good");
    char[] ch = {'t','e','s','t'};
    public void exchange(String str , char[] ch){
        str = "test ok";
        ch[0] = 'b';
    }
  public static void main(String[] args) {
        StringTest4 ex = new StringTest4();
        ex.exchange(ex.str,ex.ch);
        System.out.println(ex.str);
        System.out.println(ex.ch);
  }
}
