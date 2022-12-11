
public class PowerOf3 {
	public static void main(String[] args) {
		int n = 25;
		int x=5;

		System.out.println(power3(n,x));

	}

	private static boolean power3(int n,int x) {
		// TODO Auto-generated method stub

		while (n >= x) {
			if (n % x != 0) {
				return false;
			} else {
				n = n / x;
			}
		}
		if (n == 1) {
			return true;
		} else {
			return false;

		}

	}
}
