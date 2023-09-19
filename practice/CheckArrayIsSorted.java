public class CheckArrayIsSorted {
	public static void main(String[] args) {
		int nums[] = { 10, 1, 2, 3, 4 };
		int size = nums.length;

		boolean isSorted = checkArrayIsSorted(nums, size);
		if (isSorted == true) {
			System.out.println("Array is Sorted");
		} else {
			System.out.println("Array is Not Sorted");
		}
	}
	/*
	 * // Brute force approach private static boolean checkArrayIsSorted(int[] nums,
	 * int size) { boolean sorted = true; for (int i = 0; i < nums.length; i++) {
	 * for (int j = i + 1; j < nums.length; j++) { if(nums[i] > nums[j]) { sorted =
	 * false; break; } } } return sorted; }
	 */

	// Iterative approach
	/*
	 * private static boolean checkArrayIsSorted(int[] nums, int size) { if (size ==
	 * 0 || size == 1) return true;
	 * 
	 * for (int i = 1; i < size; i++) { if (nums[i] < nums[i - 1]) return false; }
	 * return true; }
	 */

	// Recursive approach
	private static boolean checkArrayIsSorted(int[] nums, int size) {
		if (size == 0 || size == 1)
			return true;
		return nums[size - 2] <= nums[size - 1] && checkArrayIsSorted(nums, size - 1);
	}

}
