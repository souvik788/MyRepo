package prac;

public class PrimeNumber {

	public static void main(String[] args) {
		findPrimeNumbers(50);
	}

	private static void findPrimeNumbers(int num) {
		boolean[] isPrime = new boolean[num + 1];
		for (int i = 0; i < num; i++)
			isPrime[i] = true;

		for (int i = 2; i * i <= num; i++) {
			if (isPrime[i]) {
				for (int j = i * i; j <= num; j += i) {
					isPrime[j] = false;
				}
			}
		}

		for (int i = 20; i <= num; i++) {
			if (isPrime[i] == true)
				System.out.print(i + " ");
		}
	}
}
