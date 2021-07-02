package sortAlgorithm;

/**
 * @author: chenwei
 * @date: 2021/7/2 13:08
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
    static int[] quickSot(int[] arr,int low,int high){
        if(low < high){
            int pivot = partition(arr,low,high);
            quickSot(arr,low,pivot - 1);
            quickSot(arr,pivot + 1,high);
        }
        return arr;
    }
    public static void main(String[] a){
        int arr[] = {6,2,6,2,6,7,8,2,8,3,1,7,3};
        int[] ar = quickSot(arr,0,arr.length - 1);
        for(int i=0;i<ar.length;i++){
            System.out.println(ar[i]);
        }

        System.out.println("hei");
    }
}
