package sortAlgorithm;

/**
 * @Author chenwei
 * @Date 2021/6/30 22:26
 * @Version 1.0
 */

/*
* 冒泡排序，对已经有序的情况优化
* */
public class Bubbling {
    //这里必须加static，在静态方法main方法上才可以用，java: 无法从静态上下文中引用非静态 方法 bubble(int[])
    static int[] bubble(int[] l){
//        int[] l = {4,2,5,1,6,25,6,9};
        for(int i = 0;i < l.length;i++){
            boolean flag = true;
            for(int j = 0;j < l.length-1-i;j++){
                if(l[j]>l[j+1]){
                    int temp = l[j];
                    l[j] = l[j+1];
                    l[j+1] = temp;
                    flag = false;
                }
            }
            if(flag == true){
                break;
            }
        }
        for(int i = 0;i<l.length;i++){
            System.out.println(l[i]);
        }
        return l;
    }
    static int[] bubble2(int[] l){
        for(int i = 0;i < l.length;i++){
            for(int j = 0;j < l.length-1-i;j++){
                if(l[j]>l[j+1]){
                    int temp = l[j];
                    l[j] = l[j+1];
                    l[j+1] = temp;
                }
            }
        }
        for(int i = 0;i<l.length;i++){
            System.out.println(l[i]);
        }
        return l;
    }
    public static void main(String[] a){
        long startTime = System.nanoTime();
        int[] li = {2,5,2,6,8,2,5,7,12,63,7,4,55,46,23,5,236646,12,35,34,5,353,5};
        bubble(li);
        long endTime = System.nanoTime();
        System.out.println("programing used time is  " + (endTime - startTime) + " ns");

        int[] li2 = {2,2,2,4,5,5,5,5,5,6,7,7,8,12,12,23,34,35,46,55,63,353,236646};
        //有序没有使用flag优化程序运行时间计算
        long startTime2 = System.nanoTime();
        bubble2(li2);
        long endTime2 = System.nanoTime();
        System.out.println("programing used time is  " + (endTime2 - startTime2) + " ns");
        //对有序的数组使用flag优化后运行的时间
        long startTime1 = System.nanoTime();
        bubble(li2);
        long endTime1 = System.nanoTime();
        System.out.println("programing used time is  " + (endTime1 - startTime1) + " ns");

    }
}
