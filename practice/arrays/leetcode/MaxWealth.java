public class MaxWealth {
	public static void main(String[] args) {
		int nums[][] = { { 1, 2, 3 }, { 3, 4 }, { 4, 2, 3 } };
		int wealth = maxWealth(nums);
		System.out.println(wealth);
	}

	private static int maxWealth(int[][] accounts) {
		int wealth = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < accounts.length; i++) {
			for (int j = 0; j < accounts[i].length; j++) {
				sum += accounts[i][j];
			}
			if (wealth <= sum) {
				wealth = sum;
			}
			// System.out.println(sum);
			sum = 0;
		}

		return wealth;
	}
}
