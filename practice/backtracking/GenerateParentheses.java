//https://leetcode.com/problems/generate-parentheses/
import java.util.LinkedList;
import java.util.List;

public class GenerateParentheses {
	public static void main(String[] args) {
		List<String> result = generateParenthesis(3);
		System.out.println(result);
	}

	public static List<String> generateParenthesis(int n) {
		LinkedList<String> list = new LinkedList<String>();
		if (n < 0)
			return list;
		dfs(n, 0, "", list);
		return list;
	}

	public static void dfs(int left, int right, String res, List<String> list) {
		if (left == 0 && right == 0) {
			list.add(res);
			return;
		}
		if (left > 0)
			dfs(left - 1, right + 1, res + "(", list);
		if (right > 0)
			dfs(left, right - 1, res + ")", list);
	}
}
