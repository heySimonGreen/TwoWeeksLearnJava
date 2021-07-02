package sortAlgorithm;

/**
 * @author: chenwei
 * @date: 2021/7/2 23:36
 */
public class SelectSort {
    static int[] selectSort(int[] arr){
        for(int i = 0;i<arr.length -1;i++){
            int min = i;
            for(int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    min = j;
                }
            }
            if(min != i){
                int temp = arr[min];
                arr[min] =arr[i];
                arr[i] = temp;

            }
        }
        return arr;
    }
    public static void main(String[] a){
        int[] arr = new int[]{4,2,6,1,4,66,2};
        int[] res = selectSort(arr);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }

    }
}
