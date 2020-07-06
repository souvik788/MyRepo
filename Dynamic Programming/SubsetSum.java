package dp;

public class SubsetSum {

	public static void main(String[] args) {
		int[] arr = {2,5,7,3,9};
		int sum = 11;
		
		canSubsetSum(arr, sum);

	}

	private static void canSubsetSum(int[] arr, int sum) {
		int len = arr.length;
		boolean[][] dp = new boolean[len][sum+1];
		
		for(int j=0; j<sum+1; j++) {
			dp[0][j] = false;
			if(arr[0] == j) {
				dp[0][j] = true;
			}
		}
		for(int i=0; i<len; i++) {
			dp[i][0] = true;
		}
		
		for(int i=1; i<len; i++) {
			for(int j=1; j<=sum; j++) {
			if(arr[i] > j) {
				dp[i][j] = dp[i-1][j];
			} else {
				dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i]];
			}
		}
		}
		System.out.println();
		System.out.println(dp[len-1][sum]);
	}

}
