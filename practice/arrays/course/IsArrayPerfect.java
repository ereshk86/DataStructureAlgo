package practice.arrays;

public class IsArrayPerfect {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 3, 2, 1 };
		boolean isPerfect = isArrayPerfect(nums);
		if (isPerfect)
			System.out.println("PERFECT");
		else
			System.out.println("NOT PERFECT");

	}

	private static boolean isArrayPerfect(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			if (nums[left] == nums[right]) {
				left++;
				right--;
			} else {
				return false;
			}

		}
		return true;
	}
}
