import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	public static void main(String[] args) {

//		
//		//Algorithm
//				/**
//				 * 1. approach : take hashmap and store the duplicates and get the least repeated 
//				 */
//				
//				HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
//				for(int i=0;i<arr.length;i++) {
//					if(map.containsKey(arr[i])) {
//							map.put(arr[i], map.get(arr[i])+1);
//					}else{
//						map.put(arr[i], 1);
//					}
//				}
//				for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
//					int key=entry.getKey();
//					int value=entry.getValue();
//					if(value==1) {
//						System.out.println(key);
//					}
//				}
//		

		int arr[] = { 1, 1, 2, 2, 3, 3, 9 };

		// XOR
		// int x=3;
		// int y=3;

		// System.out.println(x^y);

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum ^ arr[i];
		}
		System.out.println(sum);

	}

}
