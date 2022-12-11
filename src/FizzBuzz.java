import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static void main(String[] args) {
		int n = 15;

		List<String> fiZZBuZZ = fiZZBuZZ(n);
		System.out.println(fiZZBuZZ);

	}

	private static List<String> fiZZBuZZ(int n) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				list.add("FizzBuzz");
			} else if (i % 3 == 0) {
				list.add("Fizz");

			} else if (i % 5 == 0) {
				list.add("Buzz");
			} else {
				list.add("" + i);
				
			}
		}
		return list;

	}
}
