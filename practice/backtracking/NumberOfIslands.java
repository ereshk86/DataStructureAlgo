public class NumberOfIslands {
	public static void main(String[] args) {
		char grid[][] = { { '1', '1', '1', '1', '0' }, { '1', '1', '0', '1', '0' }, { '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' } };
		int count = grids(grid);
		System.out.println(count);
	}

	private static int grids(char[][] grid) {
		int n = grid.length;
		int m = grid[0].length;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; ++j) {
				if (grid[i][j] == '1') {
					dfs(i, j, grid);
					++ans;
				}
			}
		}

		return ans;
	}

	private static void dfs(int i, int j, char[][] grid) {
		// TODO Auto-generated method stub
		if (i < 0 || j < 0 || i == grid.length || j == grid[0].length)
			return;
		if (grid[i][j] != '1')
			return;

		grid[i][j] = '2';

		dfs(i + 1, j, grid);
		dfs(i - 1, j, grid);
		dfs(i, j + 1, grid);
		dfs(i, j - 1, grid);

	}
}
