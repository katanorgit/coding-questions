import java.util.HashMap;

public class ValidAnagram {
	public static void main(String[] args) {
		String str1 = "aaj";
		String str2 = "uja";

		int[] arr = new int[26];

		for (char c : str1.toCharArray()) {
			int x=c-'a'; //gives you the alphabet position form ascii value eg: ascii for c is 114 from that we do -97=17
			arr[x]=arr[x]+1;
			//arr[c - 'a']++;
		}
		for (char c : str2.toCharArray()) {
			int z=c-'a';
			if(arr[z]==0) {
					System.out.println("false");
			}
			int x=c-'a';
			arr[x]=arr[x]-1;
		}

	}
}
