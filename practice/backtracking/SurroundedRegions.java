package practice.backtracking;

public class SurroundedRegions {

	public static void main(String[] args) {
		char board[][] = { { 'X', 'X', 'X', 'X' }, { 'X', 'O', 'O', 'X' }, { 'X', 'X', 'O', 'X' },
				{ 'X', 'O', 'X', 'X' } };
		solve(board);

	}

	private static void solve(char[][] board) {

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (i * j == 0 || i == board.length - 1 || j == board[0].length - 1)
					dfs(board, i, j);
			}
		}
		
		for(char row[] : board)
			for(int i=0;i<row.length;++i)
				if(row[i] == '*')
					row[i] = 'O';
				else if (row[i] =='O')
					row[i] = '*';

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void dfs(char[][] board, int i, int j) {

		if (i < 0 || i == board.length || j < 0 || j == board[0].length) {
			return;
		}
		if (board[i][j] != 'O')
			return;
		
		board[i][j] = '*';
		dfs(board, i + 1, j);
		dfs(board, i - 1, j);
		dfs(board, i, j + 1);
		dfs(board, i, j - 1);
	}
}
