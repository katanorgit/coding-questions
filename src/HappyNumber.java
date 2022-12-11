import java.util.HashSet;

public class HappyNumber {
	public static void main(String[] args) {
		int n = 19;
		
		
	System.out.println(	happyNumber(n));
		

	}

	private static boolean happyNumber(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		HashSet<Integer> set = new HashSet<>();
		while (true) {
			while (n != 0) {
				sum += Math.pow(n % 10, 2);
				n = n / 10;
			}
			if (n == 1)
				return true;
			n = sum;

			if (set.contains(sum)) {
				return false;
			} else {
				set.add(sum);
			}

		}
	}
}
