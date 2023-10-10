
public class RangeSumQuery {
	public static void main(String[] args) {
		int nums[] = { -2, 0, 3, -5, 2, -1 };
		NumArray numsObj = new NumArray(nums);
		int range = numsObj.sumRange(0, 5);
		System.out.println(range);
	}

}

class NumArray {
	private int[] input;

	public NumArray(int[] nums) {
		input = new int[nums.length];
		System.arraycopy(nums, 0, input, 0, nums.length);
	}

	public int sumRange(int left, int right) {
		int temp = 0;
		for (int i = left; i <= right; i++) {
			temp = temp + input[i];
		}
		return temp;

	}
}
