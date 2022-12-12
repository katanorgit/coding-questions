
public class ReverseBits {
public static void main(String[] args) {
	int n = 15;
	int result = 0;
	for (int i = 0; i < 32; i++) {
		result <<= 1;
		result += n % 2;
		n >>>= 1;
	}
	System.out.println(result);
}
}
