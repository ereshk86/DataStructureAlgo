import java.util.Arrays;

public class SidingWindowMaximum {
	public static void main(String[] args) {
		int nums[] = { 1,-1 };
		int k = 1;
		int result[] = sidingWindowMaximum(nums, k);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] sidingWindowMaximum(int[] nums, int k) {
		int[] result = new int[(nums.length - k) + 1];
		if(nums.length == 1) return nums;
		int left = 0;
		int right = left + (k - 1);
		int r = 0;
		while (right < nums.length) {

			result[r] = max(nums, left, right);
			left++;
			right++;
			r++;

		}
		return result;
	}

	private static int max(int[] nums, int l, int r) {
		int max = Integer.MIN_VALUE;
		for (int i = l; i <= r; i++)
            max = Math.max(max, nums[i]);
		return max;
	}

}
