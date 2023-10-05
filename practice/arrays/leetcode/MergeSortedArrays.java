package practice.arrays.leetcode;

public class MergeSortedArrays {
	public static void main(String[] args) {
		int nums1[] = { 1, 2, 3, 0, 0, 0 };
		int nums2[] = { 2, 5, 6 };
		int m = 3;
		int n = 3;
		mergeSortedArrays(nums1, m, nums2, n);
	}

	private static void mergeSortedArrays(int[] nums1, int m, int[] nums2, int n) {
		int index = m + n - 1;
		while (n > 0) {
			if (m > 0 && nums1[m - 1] > nums2[n - 1]) {
				nums1[index] = nums1[m - 1];
				m--;
			} else {
				nums1[index] = nums2[n - 1];
				n--;
			}
			index--;
		}

		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + ",");
		}

	}

}
