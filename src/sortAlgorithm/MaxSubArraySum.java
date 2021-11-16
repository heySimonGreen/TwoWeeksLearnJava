package sortAlgorithm;

/**
 * @author: chenwei
 * @date: 2021/10/16 15:04
 * @description: 描述
 */
public class MaxSubArraySum {
	public static void main(String[] args) {
		int[] array = new int[]{30,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSum(array));
	}
	public static int maxSum(int[] array){
		int[] dp=new int[array.length+5];
		int max =0;
		for (int i=1;i<array.length;i++){
			dp[i] = Math.max(dp[i],dp[i-1]+array[i]);
			if (max<dp[i]){
				max=dp[i];
			}
		}
		return max;
	}
}
