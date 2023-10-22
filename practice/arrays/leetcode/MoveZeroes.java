
public class MoveZeroes {
	public static void main(String[] args) {
		int[] arr = { 0, 3, 0, 2, 4 };
		moveZeroes(arr);
	}

	public static void moveZeroes(int[] nums) {
		int i = 0;
		for (final int num : nums) {
			if (num != 0) {
				nums[i++] = num;
			}
		}
		while (i < nums.length) {
			nums[i++] = 0;
		}
		for (int i1 = 0; i1 < nums.length; i1++) {
			System.out.println(nums[i1]);
		}
	}

}
