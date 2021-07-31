package learncodeday16;

/**
 * @author: chenwei
 * @date: 2021/7/26 13:02
 */
public class MyExcepiton extends RuntimeException{
    static final long serialVersionUID = -7034897190745766939L;

    public MyExcepiton(String message) {
        super(message);
    }

    public MyExcepiton() {
    }
}
