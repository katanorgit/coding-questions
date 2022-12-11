
public class PowerOf3 {
	public static void main(String[] args) {
		int n = 27;

		System.out.println(power3(n));

	}

	private static boolean power3(int n) {
		// TODO Auto-generated method stub

		while (n >= 4) {
			if (n % 4 != 0) {
				return false;
			} else {
				n = n / 4;
			}
		}
		if (n == 1) {
			return true;
		} else {
			return false;

		}

	}
}
