import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String[] args) {
		int numRows = 5;
		List<ArrayList<Integer>> result = generate(numRows);
		System.out.println(result);
	}

	private static List<ArrayList<Integer>> generate(int numRows) {

		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if (numRows <= 0)
			return result;
		ArrayList<Integer> first = new ArrayList<Integer>();
		first.add(1);
		result.add(first);
		for (int i = 1; i < numRows; i++) {
			ArrayList<Integer> before = result.get(i - 1);
			ArrayList<Integer> now = new ArrayList<Integer>();
			now.add(1);
			for (int j = 1; j < i; j++) {
				now.add(before.get(j - 1) + before.get(j));
			}
			now.add(1);
			result.add(now);
		}
		return result;
	}

}
