package prac;

//Imp Note: Array contains value from 1 to length of array
public class FirstDuplicate {

	public static void main(String[] args) {
		int[] arr = {2,1,3,5,3,2};
		System.out.println(findFirstDup(arr));
	}

	private static int findFirstDup(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			if(Math.abs(arr[arr[i]]-1)<0) {
				return Math.abs(arr[i]);
			} else {
				arr[i] = -arr[i];
			}
			
		}
		return -1;
	}

}
