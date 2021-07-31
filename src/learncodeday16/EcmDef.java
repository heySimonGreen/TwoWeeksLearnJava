package learncodeday16;

/**
 * @author: chenwei
 * @date: 2021/7/26 13:54
 */
public class EcmDef {
    public static void main(String[] args){
        if (args.length<2){
            throw new RuntimeException("input less two args");
        }
        int number1=0;
        int number2=0;

        try {
            number1 = Integer.parseInt(args[0]);
            number2 = Integer.parseInt(args[1]);
            if (number1<0||number2<0){
                throw new Ecdef("input can not fushu");
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        ecm(number1,number2);

    }
    public static void ecm(int number1, int number2){
        System.out.println((double) (number1/number2));
    }
}
class Ecdef extends RuntimeException{
    static final long serialVersionUID = -7034897190745766939L;

    public Ecdef(String message) {
        super(message);
    }

    public Ecdef() {
    }
}
