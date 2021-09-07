package day25generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chenwei
 * @date: 2021/9/4 0:15
 * @description:
 * 泛型方法：在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系。
 * 换句话说，泛型方法所属的类是不是泛型类都没有关系
 * 泛型方法可以声明为静态的。原因：泛型参数是在调用方法时确定的。并非在实例化类时确定
 */
public class GenericMethod {
    public <T> List<T> copyFromArrayToList(T[] arr){
        ArrayList<T> arrayList = new ArrayList<>();
        for (T t : arr){
            arrayList.add(t);
        }
        return arrayList;
    }
}
