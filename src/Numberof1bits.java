
public class Numberof1bits {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(hammingWeight(n));
	}

	private static int hammingWeight(int n) {
		int count = 0;
		for (int i = 0; i <= 32; i++) {
			count += (n % 2 == 0) ? 0 : 1;
			n >>>= 1;
		}
		return count;

	}
}
