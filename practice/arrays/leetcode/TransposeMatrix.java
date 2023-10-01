package practice.arrays.leetcode;

public class TransposeMatrix {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] result = transposeMatrix(arr);
		System.out.println();
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
	}

	private static int[][] transposeMatrix(int[][] arr) {
		int n = arr.length, m = arr[0].length;
		int[][] result = new int[m][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result[j][i] = arr[i][j];
			}
		}
		return result;
	}
}
