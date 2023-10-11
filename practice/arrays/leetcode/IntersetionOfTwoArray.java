package practice.arrays.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class IntersetionOfTwoArray {

	public static void main(String[] args) {
		int nums1[] = { 1, 2, 2, 1 };
		int nums2[] = { 2, 2 };
		int result[] = intersection(nums1, nums2);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static int[] intersection(int[] nums1, int[] nums2) {

		Arrays.sort(nums1);
		Arrays.sort(nums2);

		HashSet<Integer> tempList = new HashSet<>();
		int i = 0, j = 0;
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				tempList.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				i++;
			}
		}

		int result[] = tempList.stream().mapToInt(a -> a).toArray();
		return result;
	}
}
