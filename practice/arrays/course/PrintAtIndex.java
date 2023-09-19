public class PrintAtIndex {
	public static void main(String[] args) {
		/*
		 * Input:
			7 4
			10 20 30 40 50 60 70
			Output:
			50
		*/
		int nums[] = { 10, 20, 30, 40, 50 };
		int length = nums.length;
		int key = 5;

		printAtIndex(nums, length, key);
	}

	private static void printAtIndex(int[] nums, int length, int key) {
		// TODO Auto-generated method stub
		if (key < length) {
			System.out.println(nums[key]);
		}else {
			System.out.println("Please enter valid key");
		}
			

	}

}
