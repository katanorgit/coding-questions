import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
		int n = 5;
		System.out.println(pascal(n));
	}

	private static List<List<Integer>> pascal(int n) {
		// TODO Auto-generated method stub
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> first_row = new ArrayList<>();
		first_row.add(1);
		triangle.add(first_row);

		for (int i = 1; i <n; i++) {
			List<Integer> prev_row = triangle.get(i - 1);
			List<Integer> curr_row = new ArrayList<>();
			curr_row.add(1);
			for (int j = 1; j < i; j++) {
				curr_row.add(prev_row.get(j - 1) + prev_row.get(j));
			}
			curr_row.add(1);
			triangle.add(curr_row);
		}

		return triangle;
	}
}
