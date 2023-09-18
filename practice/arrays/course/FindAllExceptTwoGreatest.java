package practice.arrays;

import java.util.Arrays;

public class FindAllExceptTwoGreatest {
	public static void main(String[] args) {
		// 7, -2, 3, 4, 9, -1
		// 2, 8, 7, 1, 5
		int nums[] = { 7, -2, 3, 4, 9, -1 };
		if (nums.length == 2) {
			System.out.println("Please provide array size 3");
		} else {
			findAllExceptTwoGreatest(nums);
		}

	}

	private static void findAllExceptTwoGreatest(int[] nums) {
		Arrays.sort(nums);
		int exceptLastTwo = nums.length - 2;
		for (int i = 0; i < exceptLastTwo; i++) {
			System.out.println(nums[i]);
		}
	}
}
