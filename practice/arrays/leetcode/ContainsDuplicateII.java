package practice.arrays.leetcode;

import java.util.HashMap;

public class ContainsDuplicateII {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 1 };
		int k = 3;
		boolean result = containsNearByDuplicate(nums, k);
		System.out.println(result);
	}

	private static boolean containsNearByDuplicate(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (i - map.getOrDefault(nums[i], -1000000000) <= k) {
				return true;
			} else {
				map.put(nums[i], i);
			}
		}
		return false;
	}

}
