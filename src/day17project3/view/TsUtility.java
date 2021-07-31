package day17project3.view;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author: chenwei
 * @date: 2021/7/26 19:23
 */
public class TsUtility {
    private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection(){
        char c;
        for (;;){
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if (c!='1'&&c!='2'&&c!='3'&&c!='4'){
                System.out.println("input error please input one to four");
            }else{
                break;
            }
        }
        return c;
    }


    /**
    * @description:按回车继续
    */
    public static void readReturn(){
        System.out.println("enter backspace continue");
        readKeyBoard(100,true);
    }

    /**
     * @description:从键盘读取y或者N作为返回值
     * */
    public static char readConfirmSelection(){
        char c;
        for (;;){
            String str = readKeyBoard(1,false).toLowerCase();
            c = str.charAt(0);
            if (c =='y'||c=='n'){
                break;
            }else {
                System.out.println("input error please input y or n");
            }
        }
        return c;
    }

    public static int readInt(){
        int n;
        for (;;){
            String str = readKeyBoard(2,false);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.println("please input number");
                e.printStackTrace();
            }
        }
        return n;
    }
    private static String readKeyBoard(int limit,boolean blankReturn){
        String line = "";
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            if (line.length() == 0){
                if (blankReturn){
                    return line;
                }else {
                    continue;
                }
            }
            if (line.length()<1||line.length()>limit){
                System.out.println("input lenth less " + limit);
            }
            break;
        }
        return line;
    }
}
