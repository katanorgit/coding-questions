
public class MissingNumber {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4,5 };
		int n = 5;
		// alogithm:
		/*
		 * do the sum of numbers and compare with formula n*(n+1)/2;
		 * 
		 */
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		int expected = 0;

		expected = n * (n + 1) / 2;

		System.out.println(expected - sum);

	}
}
