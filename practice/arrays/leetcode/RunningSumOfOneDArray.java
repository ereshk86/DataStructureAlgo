public class RunningSumOfOneDArray {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4 };
		int result[] = runningSum(nums);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + ",");
		}
	}

	public static int[] runningSum(int[] nums) {
		int ans[] = new int[nums.length];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			ans[i] = sum;
		}
		return ans;
	}
}
