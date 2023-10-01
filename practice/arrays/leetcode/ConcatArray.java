package practice.arrays.leetcode;

public class ConcatArray {
	public static void main(String[] args) {
		int nums[] = {1,2,1};
		
		int ans[] = concatArray(nums);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}

	private static int[] concatArray(int[] nums) {
		int ans[] = new int[2*nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = nums[i];
			ans[i+(nums.length)] = nums[i];
		}
		return ans;
	}
}
