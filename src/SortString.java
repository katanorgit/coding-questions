
public class SortString {
	public static void main(String[] args) {
		char ch[] = { 'b', 'a', 'z', 'a' };

		for (int i = 0; i < ch.length - 1; i++) {

			if (ch[i] < ch[i + 1]) {
				char temp = ch[i];
				ch[i] = ch[i + 1];
				ch[i + 1] = temp;
				i = -1;
			}

		}

		for (char c : ch) {
			System.out.print(" " + c);
		}

	}
}
