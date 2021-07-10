package LearnCode20210630.String;

/**
 * @author: chenwei
 * @date: 2021/7/3 13:34
 */
public class YangHuiTriangle {
    public static void main(String[] a){
        int[] arr = new int[]{1,1};
        System.out.println(1);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 3;i<=10;i++){
            int[] arrNew = new int[i];
            arrNew[0] =1;
            arrNew[i-1] =1;
            for(int j=1;j<i-1;j++){
                arrNew[j] = arr[j-1]+arr[j];
            }
            arr = arrNew;
            for(int k = 0;k<arrNew.length;k++){
                System.out.print(arrNew[k]+" ");
            }
            System.out.println();
        }
    }
}
