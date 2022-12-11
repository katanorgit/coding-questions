import java.util.HashSet;

public class IntersectionOfArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 5, 9, 8, 7 };
		int[] arr2 = { 2, 4, 6, 1, 9 };

		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> interset = new HashSet<>();

		for (int i : arr1) {
			set.add(i);
		}
		for (int j : arr2) {
			if (set.contains(j)) {
				interset.add(j);
			}
		}
		System.out.println(interset);
	}
}
