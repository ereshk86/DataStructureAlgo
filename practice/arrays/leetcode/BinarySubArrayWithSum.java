
public class BinarySubArrayWithSum {
	public static void main(String[] args) {
		int N = 5;
		int target = 2;
		int arr[] = { 1, 0, 1, 0, 1 };

		int n = numberOfSubArrays(arr, N, target);
		System.out.println(n);
	}

	private static int numberOfSubArrays(int[] arr, int N, int target) {
		return fun(arr, N, target) - fun(arr, N, target - 1);
	}

	private static int fun(int[] arr, int N, int target) {
		int sum = 0, count = 0;
		int left = 0, right = 0;

		while (right < N) {
			sum += arr[right];
			while (sum > target) {
				sum -= arr[left];
				left++;
			}
			count += (right - left + 1);
			right++;
		}
		return count;
	}
}
