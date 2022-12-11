
public class ReverseString {
	public static void main(String[] args) {
		String str = "raj";
		revrese(str.toCharArray());
	}

// two pointers i & j -> start from i=0 and j=string.legth-1 .now swap i with j until i==j 
	private static void revrese(char[] charArray) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = charArray.length - 1;
		while (i != j) { // stop this while loop if i==j otherwise exit
			char temp = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = temp;
			i++;
			j--;

		}
		for (char c : charArray) {
			System.out.print(c);
		}
	}
}
