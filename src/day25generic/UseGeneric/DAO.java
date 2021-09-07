package day25generic.UseGeneric;

import java.util.List;

/**
 * @author: chenwei
 * @date: 2021/9/4 0:49
 * @description: 对于具体要继承的类，一继承就具体了
 * 表的共性操作的dao
 */
public class DAO<T> {
    //对于具体要继承的类，一继承就具体了；表的共性操作的dao
    //增加一条数据
    public void add(T t){
    }
    //删除一条数据
    public boolean delete(int index){
        return false;
    }
    //查找一条数据
    public T getIndex(int index){
        return null;
    }
    //查询多条
    public List<T> getForList(int index){
        return null;
    }
    //泛型方法，举例子获取表中一共有多少条记录，获取最大的员工入职时间
    public <E> E getValue(){
        return null;
    }
}
