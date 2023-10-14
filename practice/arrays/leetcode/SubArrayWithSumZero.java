package practice.arrays.leetcode;

import java.util.HashMap;

public class SubArrayWithSumZero {
	public static void main(String[] args) {
		int nums[] = { 5, 1, -2, -4, 10 };
		boolean result = subArrayWithSumZero(nums);
		System.out.println(result);
	}

	private static boolean subArrayWithSumZero(int[] nums) {
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if(sum == 0) {
				return true;
			}
			else if (map.containsKey(sum)) {
				return true;
			} else {
				map.put(sum, true);
			}
		}
		return false;
	}
}
