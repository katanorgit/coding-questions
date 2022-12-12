import java.util.Stack;

public class ValidParantheses {
	public static void main(String[] args) {
		String str = "({})[";
		boolean validParan = validParan(str);
		System.out.println(validParan);
	}

	private static boolean validParan(String str) {
		Stack<Character> stack = new Stack<>();
		char[] charArray = str.toCharArray();
		for (char c : charArray) {
			if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		return stack.isEmpty();
	}
}
