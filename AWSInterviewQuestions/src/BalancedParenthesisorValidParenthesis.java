import java.util.Stack;

public class BalancedParenthesisorValidParenthesis {

	public static void main(String[] args) {

		String str = "({})";
		if (validateTheParenthesis(str)) {
			System.out.println(true);
		} else {

			System.out.println(false);
		}
	}

	private static boolean validateTheParenthesis(String str) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				st.push(ch);
				
			} else {
				if (!st.empty() && ((st.peek() == '(' && ch == ')') || (st.peek() == '{' && ch == '}')
						|| (st.peek() == '[' && ch == ']'))) {
					st.pop();
				} 
				else {
					return false;
				}
			}
		}

		return st.empty();

	}
}
