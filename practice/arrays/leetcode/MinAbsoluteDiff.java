
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinAbsoluteDiff {
	public static void main(String[] args) {
		int arr[] = { 4, 2, 1, 3 };
		List<List<Integer>> result = minimumAbsDifference(arr);
		System.out.println(result);

	}

	private static List<List<Integer>> minimumAbsDifference(int[] arr) {
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(arr);
		int sub = 0;
		if (arr[1] > arr[0]) {
			sub = arr[1] - arr[0];
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] - arr[i - 1] == sub) {
					result.add(Arrays.asList(arr[i - 1], arr[i]));
				}

			}

		}
		return result;

	}
}
