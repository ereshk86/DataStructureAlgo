package practice.arrays;

public class FindSumSeries {
	public static void main(String[] args) {
		int n = 10;
		int result = findNumsSeries(n);
		System.out.println(result);
	}

	private static int findNumsSeries(int n) {
		// TODO Auto-generated method stub
		int result = 0;
		if (n == 1)
			return 1;

		for (int i = 1; i <= n; i++) {
			result = result + i;
		}
		return result;
	}
}
