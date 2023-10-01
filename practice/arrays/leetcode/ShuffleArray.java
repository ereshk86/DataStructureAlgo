public class ShuffleArray {
	
	public static void main(String[] args) {
		int nums[] = {2,5,1,3,4,7}, n = nums.length/2;
		int ans[] = shuffle(nums, n);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+",");
		}
		System.out.println();
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+",");
		}
	}

	private static int[] shuffle(int[] nums, int n) {
		int ans [] = new int[nums.length];
        for(int i=0; i<n;i++ ){
            ans[2*i] = nums[i];
            ans[(2*i)+1] = nums[i+n];
        }
        return ans;
		
	}
}
