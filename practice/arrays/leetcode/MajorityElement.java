package practice.arrays.leetcode;

import java.util.Arrays;

public class MajorityElement {
	public static void main(String[] args) {
		int nums[] = { 8, 8, 7, 7, 7 };
		int result = majorityElement(nums);
		System.out.println(result);
	}

	private static int majorityElement(int[] nums) {
		int count = 0;
		int element = 0;
		Arrays.sort(nums);
		element = nums[(nums.length/2)];
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count > (nums.length / 2)) {
				element = nums[i];
			}
		}
		
		return element;
	}
}
