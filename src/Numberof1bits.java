
public class Numberof1bits {
	public static void main(String[] args) {
		int n=5;
	System.out.println(	hammingWeight(n));
	}

	private static int hammingWeight(int n) {
		 int result=0;
			while(n!=0) {
				result+=(n%2)&1;
				n>>>=1;
			}
			return result;
	}
}
