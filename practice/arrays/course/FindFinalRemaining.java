package practice.arrays;

import java.util.Arrays;

public class FindFinalRemaining {
	int nums[] = {};

	public static void main(String[] args) {
		int nums[] = { 7, 8, 3, 4, 2, 9, 5 };
		int result = findFinalRemaining(nums);
		System.out.println(result);
	}

	private static int findFinalRemaining(int[] nums) {
		Arrays.sort(nums);
		if (nums.length == 1) {
			return nums[0];
		} else {
			int middleIndex = (nums.length - 1) / 2;
			return nums[middleIndex];
		}

	}

}
