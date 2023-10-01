public class ThreeConsecutiveOdd {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 34, 3, 4, 5, 7, 23, 12 };
		boolean result = threeConsecutiveOdds(arr);
		System.out.println(result);

	}

	private static boolean threeConsecutiveOdds(int[] arr) {
			int count = 0;
	        for(int i:arr){
	            if(i%2 == 1) {
	                count++;
	                if(count == 3){
	                    return true;
	                }
	            }
	            else{
	                count = 0;
	            }
	        }
	        return false;
	}
}
