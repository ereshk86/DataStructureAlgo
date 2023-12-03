package practice.backtracking;

public class MaxAreaOfIsland {
	public static void main(String[] args) {
		int grid[][] = { { 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0 },
				{ 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0 } };
		int res = maxAreaOfIsland(grid);
		System.out.println(res);
	}

	private static int maxAreaOfIsland(int[][] grid) {
		int ans = 0;
		for (int i = 0; i < grid.length; ++i)
			for (int j = 0; j < grid[0].length; ++j)
				ans = Math.max(ans, count_island(grid, i, j));
		return ans;
	}

	private static int count_island(int[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i == grid.length || j == grid[0].length)
			return 0;
		if (grid[i][j] != 1)
			return 0;
		grid[i][j] = 2;

		return 1 + count_island(grid, i + 1, j) + count_island(grid, i - 1, j) + count_island(grid, i, j + 1)
				+ count_island(grid, i, j - 1);
	}

}
