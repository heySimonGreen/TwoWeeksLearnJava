package learncodeday16;

/**
 * @author: chenwei
 * @date: 2021/7/20 12:32
 */
public class HomeWork3 {
    public static void main(String[]args){
        Person person = new Person() {
            @Override
            public void eat() {
                System.out.println("person eating");
            }
        };
        person.eat();
    }
}
