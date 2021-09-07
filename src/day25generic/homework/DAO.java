package day25generic.homework;

import java.util.*;

/**
 * @author: chenwei
 * @date: 2021/9/4 3:46
 * @description: 描述
 */
public class DAO<T> {
    private Map<String,T> map = new HashMap<>();
    public void save(String id,T entity){
        map.put(id,entity);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entity){
        map.put(id,entity);
    }
    public List<T> list(){
        Set<String> strings = map.keySet();
        List<T> list = new ArrayList();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            T t = map.get(next);
            list.add(t);
        }
        return list;
    }
    public void delete(String id){
        map.remove(id);
    }
}
