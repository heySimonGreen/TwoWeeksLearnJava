package day17project3.service;

/**
 * @author: chenwei
 * @date: 2021/7/27 12:22
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -3387516993124229948L;

    public TeamException(String message) {
        super(message);
    }

    public TeamException() {
    }
}
