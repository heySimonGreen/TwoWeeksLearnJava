package LearnCode20210630.String;

/**
 * @author: chenwei
 * @date: 2021/7/5 21:11
 */
public class Day09SoftwareHomework {
    public static void main(String[] args){
        int[] arr = new int[]{12,3,3,34,56,77,432};
        double[] newArr = new double[arr.length];
        for(int i = 0;i<arr.length;i++){
            newArr[i] = arr[i]/(double)(arr[0]);
        }
        for(int i = 0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }
    }
}
