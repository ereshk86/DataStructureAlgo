public class SumAll {

	public static void main(String[] args) {
		int nums[] = { 5, 8, 3, 10, 22, 45 };
		int n = nums.length, sum = 0;
		for (int i = 0; i < n; i++) {
			sum = sum + nums[i];
		}
		System.out.println(sum);
	}

}
