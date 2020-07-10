package prac;

public class LongestSubArr {

	public static void main(String[] args) {
		int sum = 17;
		int[] arr = {1,4,7,0,6,3,2,9,2,2,1,1};
		
		int[] res = findMaxSubArray(arr, sum);
		System.out.println(res[0]+ " "+ res[1]);
	}

	private static int[] findMaxSubArray(int[] arr, int sum) {
		int[] best_so_far = {0,0};
		int current_sum = 0;
		int left = 0;
		int right = 0;
		
		while(right < arr.length) {
			current_sum += arr[right];
			while(left < right && current_sum > sum) {
				current_sum -= arr[left++];
			}
			if(current_sum == sum && best_so_far[1]-best_so_far[0] < right - left + 1) {
				best_so_far[0] = left;
				best_so_far[1] = right;
			}
			right++;
		}
		
		return best_so_far;
	}

}
