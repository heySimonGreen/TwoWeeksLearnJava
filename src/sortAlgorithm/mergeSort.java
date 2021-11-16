package sortAlgorithm;

import java.util.Arrays;

/**
 * @author: chenwei
 * @date: 2021/10/21 17:02
 * @description: 描述
 */
public class mergeSort {
	public static void main(String[] args) {
		int n=10;
		int[] array = new int[n];
		for (int i=0;i<n;i++){
			array[i]=(int)(Math.random()*100);
		}
		for (int i=0;i<n;i++){
			System.out.println(array[i]);
		}
	}
	public static void mg(int[] array,int l,int r){

	}

	//将两个有序数组合并为一个
	public static void merge(int[] array,int l,int r,int mid){
		int[] arr1 = Arrays.copyOfRange(array,l,mid);
		int[] arr2 = Arrays.copyOfRange(array,mid+1,r);
	}
}
