import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public static void main(String[] args) {
			int arr[]= {3,2,3,2,3};
			System.out.println(majorityEle(arr));
	}

	private static int majorityEle(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		Integer max = Collections.max(map.values());
		for (Map.Entry<Integer, Integer> entries : map.entrySet()) {
			if (entries.getValue()==max) {
				return entries.getKey();
			}
		}
		return -1;
	}
}
