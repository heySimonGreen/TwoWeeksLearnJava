package sortAlgorithm;

import org.junit.Test;

/**
 * @author: chenwei
 * @date: 2021/7/2 13:08
 * 主要两个方法，partition和quickSort,
 * partition：返回一个pivot
 */
public class QuickSort {
    static int partition(int arr[],int low,int high){
        int pivot = arr[low];
        while (low < high){
            while (low < high && arr[high] >= pivot){
                --high;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= pivot){
                ++low;
            }
            arr[high] = arr[low];
        }
        arr[low] = pivot;
        return low;
    }
    static int[] quickSort(int[] arr_quickSort,int low,int high){
        if(low < high){
            int pivot = partition(arr_quickSort,low,high);
            quickSort(arr_quickSort,low,pivot - 1);
            quickSort(arr_quickSort,pivot + 1,high);
        }
        return arr_quickSort;
    }
    public static void quickSortMethod(int[] arr){
//        int arr[] = {6,2,6,2,6,7,8,2,8,3,1,7,3};
        int[] ar = quickSort(arr,0,arr.length - 1);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }

        System.out.println("hei");
    }
    @Test
    public void test(){
        int[] ar = new int[]{3,5,7,2,5,3,6,7,9};
        QuickSort.quickSortMethod(ar);
    }
}
