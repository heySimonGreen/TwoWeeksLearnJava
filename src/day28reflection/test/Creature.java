package day28reflection.test;

import java.io.Serializable;

/**
 * @author: chenwei
 * @date: 2021/9/16 19:31
 * @description: 描述
 */
public class Creature<T> implements Serializable {
    private char gender;
    public double weight;
    private void breath(){
        System.out.println("creature breath");
    }
    public void eat(){
        System.out.println("creature eat");
    }
}
