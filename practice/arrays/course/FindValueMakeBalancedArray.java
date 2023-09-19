package practice.arrays;

public class FindValueMakeBalancedArray {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 1, 2, 1, 3 };
		int size = nums.length;

		int result = findValueMakeBalancedArray(nums, size);
		System.out.println(result);
	}

	private static int findValueMakeBalancedArray(int[] nums, int size) {
		int half = size / 2;
		int leftSum = 0;
		int balance = 0;
		for (int i = 0; i <= half - 1; i++) {
			leftSum += nums[i];
		}

		int rightSum = 0;
		for (int i = size - 1; i >= half; i--) {
			rightSum += nums[i];
		}
		if (leftSum == rightSum) {
			System.out.println("Sum of Left and right sum are equal");
		} else if (leftSum > rightSum) {
			balance = leftSum - rightSum;
		} else {
			balance = rightSum - leftSum;
		}

		return balance;
	}
}
