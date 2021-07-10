package LearnCode20210630.String;

import java.util.Arrays;

/**
 * @author: chenwei
 * @date: 2021/7/3 13:21
 */
public class ArrayTest {
    public static void main(String[] a){
        int[] arr1 = new int[]{3,6,2,7};
        int[] arr2 = new int[]{3,6,2,7};
        boolean isSame = Arrays.equals(arr1,arr2);
        System.out.println(isSame);
        System.out.println(Arrays.toString(arr1));
//        Arrays.fill(arr1,33);
//        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        int[] arr3 = new int[]{5,5,7,9,11,66,74,88};
        int index = Arrays.binarySearch(arr3,88);
        System.out.println(index);
        if ((index >= 0)) {
            System.out.println(index);
        } else {
            System.out.println("not fond");
        }
    }
}
