package day25generic.UseGeneric;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author: chenwei
 * @date: 2021/9/4 1:11
 * @description: 描述
 */
public class DaoTest {
    @Test
    public void test1(){
        CustomerDao customerDao = new CustomerDao();
        customerDao.delete(1);
    }
    @Test
    public void test2(){
        /*
        * 1. 泛型在继承方面的体现
        * 类A是类B的父类，G<A>和G<b>二者不具备子父类关系，二者是并列关系
        * 补充：类A是类B的父类，A<G> 是 B<G>的父类，接口也是一样的，
        * */
        Object o = null;
        String str = null;
        o=str;
        List<Object> listObj = null;
        List<String> listStr = null;
        //编译报错，这是错误的.listObj和listStr不是子父类关系
        //listObj = listStr
    }
    @Test
    public void test3(){
        /*
        * 2. 通配符的使用
        * 通配符 ?
        * 类A是类B的父类，G<A>和G<b>二者没有关系，二者共同的父类是：G<?>
        * */
        List<Object> list= null;
        List<String> list1 =null;
        List<?> listf = null;
        listf = list;
        listf = list1;
        /*
        * 添加（写入）：对于List<?>就不嫩向其内部添加数据。
        * 除了添加null以外
        *
        * 获取（读取）：允许读取操作，返回类型为Object
        * */
    }
    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    @Test
    public void test4(){
        /*
        * 有条件限制的通配符的使用。
        *  ? extends A:理解为小于等于。
        *               <?  extends A>可以作为G<A>和G<B>的父类，其中B是A的子类。
        *  ? super A:理解为大于等于。
        *               <?  super A>可以作为G<A>和G<B>的父类，其中B是A的父类。
        * */
        List<? extends Person> list1 = null;
        List<? super Person> list2 = null;
        ArrayList<Customer> list3 = new ArrayList<>();
        ArrayList<Person> list4 = new ArrayList<>();
        ArrayList<Object> list5 = new ArrayList<>();
        list1 = list3;
        list1 = list4;
        //list1 = list5;
        //list2=list3;
        list2=list4;
        list2=list5;
        //读取数据
        list1 = list4;
        Person person = list1.get(0);
        //Customer customer = list1.get(0);错误编译不过，多态的理解
        list2=list4;
        //这里接收只能写Object接收
        Object object = list2.get(0);
        //写入数据小于等于的extends不可以，大于等于的super可以 子类可以赋给父类，父类不能赋给子类，就看？表示的范围
        //list1.add(new Customer())错误，这里？表示的比Customer类还小的话就是错误的
        //对于super可以
        boolean add = list2.add(new Person());
        boolean add1 = list2.add(new Customer());
    }
}
