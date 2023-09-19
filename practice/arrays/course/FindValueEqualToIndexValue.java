public class FindValueEqualToIndexValue {
	public static void main(String[] args) {
		int nums[] = { 15, 2, 45, 12, 7 };
		int size = nums.length;
		int opValue = findValueEqualToIndexValue(nums, size);
		if (opValue == 0) {
			System.out.println("No Match");
		} else {
			System.out.println(opValue);
		}
	}

	private static int findValueEqualToIndexValue(int[] nums, int size) {
		for (int i = 0; i < nums.length; i++) {
			if (i+1 == nums[i])
				return nums[i];
		}
		return 0;
	}

}
