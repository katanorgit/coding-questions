
public class MoveZerosToEnd {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 3 };
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
		for(int n:arr) {
				System.out.print(" "+ n);
		}
	}
}
