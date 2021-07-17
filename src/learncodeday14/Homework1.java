package learncodeday14;

/**
 * @author: chenwei
 * @date: 2021/7/14 16:38
 */
public class Homework1 {

}
class User{
    String name;
    int age;
    @Override
    public boolean equals(Object obj){
        System.out.println(String.valueOf(99));
        if (this == obj){
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())){
            return false;
        }
        User u = (User)obj;
        return (u.age == age && u.name == name);
    }
}
