package practice.backtracking;

public class WordSearch {
	public static void main(String[] args) {
		char board[][] = { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, { 'A', 'D', 'E', 'E' } };
		String word = "ZZZ";
		boolean exit = exit(board, word);
		System.out.println(exit);
	}

	private static boolean exit(char[][] board, String word) {
		int n = board.length;
		int m = board[0].length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (board[i][j] == word.charAt(0)) {
					boolean found = rec(i, j, 0, n, m, board, word);
					if (found == true) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private static boolean rec(int i, int j, int idx, int n, int m, char[][] board, String word) {
		// TODO Auto-generated method stub
		if (idx == word.length()) {
			return true;
		}
		if (i < 0 || j < 0 || i==n || j==m || board[i][j] != word.charAt(idx))
			return false;
		
		board[i][j] = '#';
		
		boolean c1 = rec(i+1, j, idx+1, n,m, board, word);
		boolean c2 = rec(i-1, j, idx+1, n,m, board, word);
		boolean c3 = rec(i, j+1, idx+1, n,m, board, word);
		boolean c4 = rec(i, j-1, idx+1, n,m, board, word);
		
		board[i][j] = word.charAt(idx);
		
		return (c1 || c2 || c3 || c4);
	}

}
