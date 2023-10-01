public class ThreeConsecutiveOdd {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 34, 3, 4, 5, 7, 23, 12 };
		boolean result = threeConsecutiveOdds(arr);
		System.out.println(result);

	}

	private static boolean threeConsecutiveOdds(int[] arr) {
		boolean result = false;

		for (int i = 0; i < arr.length - 2; i++) {
			if ((arr[i] % 2 != 0) && (arr[i + 1] % 2 != 0) && (arr[i + 2] % 2 != 0)) {
				result = true;
			}
		}
		return result;
	}
}
