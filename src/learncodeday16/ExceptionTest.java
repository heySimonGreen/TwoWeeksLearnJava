package learncodeday16;

import org.junit.Test;

import java.io.*;

/**
 * @author: chenwei
 * @date: 2021/7/21 23:53
 */
public class ExceptionTest {
    @Test
    public void test1(){
        String str = "123";
        str = "abc";
        /**
         * 1.finally 是可选的。
         * 2.使用try将可能出现异常代码包装起来，在执行过程中，一丹出现异常，
         * 就会生成一个对应异常类的对象，根据此对象的类型，去catch中进行匹配
         * 3.一旦try中的异常对象匹配到某一个catch时，就进入catch中进行异常的处理。
         * 一旦处理完成，就跳出当前的try-catch结构(在没有写finally的情况)。继续执行其后的代码
         * 4.catch中的异常类型如果没有子父类关系，则谁声明在上，谁声明在下无所谓。
         * catch中的异常类型如果满足子父类关系，则要求子类一定声明在父类的上面。否则，报错
         * 5.通常的异常对象处理的方式1.String getMessage() 2.printStackTrace()
         * 6.在try结构中声明的变量，在出了try结构以后，就不能再被调用
         *
         * 体会：1使用try-catch-finally处理编译时异常，使得程序在编程时就不报错，但是运行时仍可能报错
         * 相当于我们使用try-catch-finally将一个编译时可能出现的异常，延迟到运行时出现。
         * 体会：2开发中，由于运行时异常比较常见，所以我们通常就不针对运行时异常编写try-catch-finally了。
         * 针对于编译时异常，我们说一定要考虑异常的处理。
         *
         * 异常处理的方式二：throws+异常类型
         * 1.throws + 异常类型 卸载方法的声明出。指明此方法执行时，可能会抛出的异常类型。
         * 一旦当方法执行时，出现异常，仍会在异常代码处生成一个异常类的对象，此对象满足throw类型时
         * 就会被抛出。异常代码后续的代码，就不会再执行！
         * 2.体会：try-catch-finally:真正的将异常处理掉了。
         * throws的方式只是将异常抛给了方法的调用者。并没有真正将异常处理掉。
         * 3.开发中如何选择使用try-catch-finally，还是使用throws?
         * 3.1 如果父类中被重写的方法throws方式处理异常，则子类重写的方法也不能使用throws，
         * 意味着如果子类重写的方法中有异常，必须使用try-catch-finally方式处理
         * 3.2：执行的方法a中，先后又调用了另外的几个方法，这几个方法是递进关系执行的。
         * 我们建议这几个方法使用throws的方式进行处理。而执行的方法a可以考虑使用try-catch-finally的方式进行处理。
         *
         * */

        try{
            int num = Integer.parseInt(str);
        }catch (NumberFormatException e){
            System.out.println("出现数据转换异常了，不要着急");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("hello--------2");
    }

    @Test
    public void test2(){
        try{
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream(file);

            int data = fis.read();
            while (data != -1){
                System.out.println((char) data);
                data = fis.read();
            }
            fis.close();

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void test3(){
        FileInputStream fis= null;
        FileWriter fileWriter = null;
        try{
            File file = new File("hello.txt");
            fis = new FileInputStream(file);
            fileWriter = new FileWriter("hello2.txt");
            int data = fis.read();
            while (data != -1){
                System.out.println((char) data);
                fileWriter.write((char)data);
                data = fis.read();
            }

        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally{
            if (fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
