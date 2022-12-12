import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 2, 4, 3 };
		System.err.println(isDuplicate(arr));
	}

	private static boolean isDuplicate(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
			if (entries.getValue() != 1) {
				return false;
			}
		}
		return true;

		// TODO Auto-generated method stub

	}
}
