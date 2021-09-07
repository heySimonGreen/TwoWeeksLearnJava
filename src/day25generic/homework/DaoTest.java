package day25generic.homework;

import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * @author: chenwei
 * @date: 2021/9/4 3:56
 * @description: 描述
 */
public class DaoTest {
    @Test
    public void test1(){
        DAO<User> dao = new DAO();
        dao.save("009",new User(2,3,"chendada"));
        dao.save("004",new User(2,3,"chendada"));
        dao.save("002",new User(2,3,"chendada"));
        dao.save("005",new User(2,3,"chendada"));
        User chenwei = new User(1, 3, "chenwei");
        dao.delete("001");
        List<User> list = dao.list();
        Iterator<User> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
