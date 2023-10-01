package practice.arrays.leetcode;

import java.util.HashMap;

public class TwoSumInputArraySorted {
	public static void main(String[] args) {
		int numbers[] = { 2, 7, 11, 15 };
		int target = 9;
		int res[] = twoSumInputArraySorted(numbers, target);
		System.out.println(res[0]+","+res[1]);
	}

	private static int[] twoSumInputArraySorted(int[] numbers, int target) {
		int res[] = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			int req = target - numbers[i];
			if (map.containsKey(req)) {
				res[0] = map.get(req) + 1;
				res[1] = i + 1;
				return res;
			} else {
				map.put(numbers[i], i);
			}
		}
		return res;
	}
}
