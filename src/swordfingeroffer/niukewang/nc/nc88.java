package swordfingeroffer.niukewang.nc;

/**
 * @author: chenwei
 * @date: 2021/8/11 14:36
 * @description: 描述
 */
public class nc88 {
  public static void main(String[] args) {
    int[] arr = {
            10,10,9,9,8,7,5,6,4,3,4,2
    };
    int n = arr.length;
    System.out.println(n);
    int k = 3;

    System.out.println(findKth2(arr, n, k));
    System.out.println(findKth(arr, n, k));
    System.out.println(findKth3(arr, n, k));
    System.out.println(findKth4(arr, n, k));
  }

  /*
  * 冒泡法1 一次冒泡得到一个最大的数，到第K次就得到结果并返回，冒
  * 泡算法是优化后的，一次冒泡过程中不交换元素即表明排序完成，这时直接取第a[n - mark]个元素即为第K大值
  * 但是在我的电脑上和在牛客网上提交得到的结果不一样，牛客网上通过不了
  * */
  public static int findKth(int[] a, int n, int K) {
    int mark = 0;
    for (int i = 0; i < n - 1; i++) {
      boolean flag = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (a[j] > a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          flag = true;
        }
      }
      mark = mark + 1;
      if (K == mark) {
        return a[n - mark];
      }
      if (flag == false) {
        return a[n - mark];
      }
    }
    return a[n - mark];
  }
  // 冒泡法2 直接使用冒泡排序，排序后直接取出第K-1个位置的数字，已通过
  public static int findKth2(int[] a, int n, int K) {
    int mark = 0;
    for (int i = 0; i < n - 1; i++) {
      boolean flag = false;
      for (int j = 0; j < n - i - 1; j++) {
        if (a[j] < a[j + 1]) {
          int temp = a[j];
          a[j] = a[j + 1];
          a[j + 1] = temp;
          flag = true;
        }
      }
      if (flag == false) {
        break;
      }
    }
    return a[K - 1];
  }

  /*
  * 选择排序法
  * 选择出第K个大的元素即可
  * */
  public static int findKth3(int[] a, int n, int K){
    int count=0;
    for (int i=0;i<n;i++){
      int max = 0;
      int index=0;
      for (int j=0;j<n-i;j++){
        if (a[j]>max){
          max=a[j];
          index = j;
        }
      }
      a[index] = a[n-1-i];
      a[n-1-i] = max;
      count++;
      if (count == K){
        return max;
      }
    }
    return 0;
  }
  /*
  * 快速排序思想解题
  * 在我看来像是一个类似二分查找,省了很多时间查找不必要的元素
  * */
  public static int findKth4(int[] a, int n, int K){
//    int[] arr = quickSort(a,0,a.length-1,K);
//    for (int i=0;i<arr.length;i++){
//      System.out.println(arr[i]);
//    }
    int res = quickSort(a,0,a.length-1,K);
    return res;
  }
  public static int quickSort(int[] a,int low,int high,int K){
    if (low<high){
      int pivot = partitions(a,low,high);
      if (pivot==a[a.length-K]){
        return a[pivot];
      }
      else if(pivot<a.length-K){
        quickSort(a,pivot+1,high,K);
      }else {
        quickSort(a,low,pivot-1,K);
      }
    }
    return a[a.length-K];
  }
  public static int partitions(int[] a,int low,int high){
    int pivot = a[low];
    while (low<high){
      while (low<high && a[high]>=pivot){
        --high;
      }
      a[low]=a[high];
      while (low<high && a[low]<=pivot){
        ++low;
      }
      a[high] = a[low];
    }
    a[low]=pivot;
    return low;
  }
}
