import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
	public static void main(String[] args) {
		String str = "hello";
		char uniqueChar = uniqueChar(str);
		System.out.println(uniqueChar);

	}

	private static char uniqueChar(String str) {
		// TODO Auto-generated method stub
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			} else {
				map.put(str.charAt(i), 1);
			}
		}
		System.out.println(map);
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
					char key=entry.getKey();
					int value=entry.getValue();
					if(value==1) {
						return key;
					}
		}
		
		return (char)0;
	}
}
