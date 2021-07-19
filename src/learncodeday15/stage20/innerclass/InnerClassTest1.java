package learncodeday15.stage20.innerclass;

import learncodeday15.stage20.CompareObj;

/**
 * @author: chenwei
 * @date: 2021/7/20 0:37
 */
public class InnerClassTest1 {
    //开发中很少见

    public void method(){
        //局部内部类

        class Aa{

        }
    }

    //返回一个实现了Compareable接口的类的对象

    public CompareObj getCompareable(){
        //创建一个实现了Compareable接口的类：局部内部类
        //方式一：有名

//        class MyCompareable implements CompareObj{
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }
//        return new MyCompareable();
        //方式二无名

        return new CompareObj() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
