package practice.backtracking;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class NQueens {
	public static void main(String[] args) {
		int n = 4;
		List<List<String>> res = solveNQueens(n);
		int i = 1;
		for (List<String> it : res) {
			System.out.println("Arrangement " + i);
			for (String s : it) {
				System.out.println(s);
			}
			System.out.println();
			i += 1;
		}

	}

	private static List<List<String>> solveNQueens(int n) {
		char[][] board = new char[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				board[i][j] = '.';
			}
		}

		List<List<String>> res = new ArrayList<List<String>>();
		dfs(0, board, res);
		return res;
	}

	private static void dfs(int col, char[][] board, List<List<String>> res) {
		// TODO Auto-generated method stub
		if (col == board.length) {
			res.add(construct(board));
			return;
		}
		for (int row = 0; row < board.length; row++) {
			if (validate(board, row, col)) {
				board[row][col] = 'Q';
				dfs(col + 1, board, res);
				board[row][col] = '.';
			}
		}
	}

	private static boolean validate(char[][] board, int row, int col) {
		// TODO Auto-generated method stub
		int duprow = row;
		int dupcol = col;
		while (row >= 0 && col >= 0) {
			if (board[row][col] == 'Q')
				return false;
			row--;
			col--;
		}

		row = duprow;
		col = dupcol;
		while (col >= 0) {
			if (board[row][col] == 'Q')
				return false;
			col--;
		}

		row = duprow;
		col = dupcol;

		while (col >= 0 && row < board.length) {
			if (board[row][col] == 'Q')
				return false;
			col--;
			row++;
		}

		return true;
	}

	private static List<String> construct(char[][] board) {
		// TODO Auto-generated method stub
		List<String> res = new LinkedList<String>();
		for (int i = 0; i < board.length; i++) {
			String s = new String(board[i]);
			res.add(s);
		}
		return res;
	}
}
