//https://practice.geeksforgeeks.org/problems/restrictive-candy-crush--141631/1
package practice.stack;

public class RestrictiveCandyCrush {
	public static void main(String[] args) {
		int k = 2;
		String s = "geeksforgeeks";

		String result = reducedString(k, s);
		System.out.println(result);
	}

	private static String reducedString(int k, String s) {
		if(k==1) return "";
		StringBuilder result = new StringBuilder(s);
		boolean flag = true;
		
		while(flag){
			flag = false;
			int cnt=1;
			for (int i = 1; i < result.length(); i++) {
				if(result.charAt(i) == result.charAt(i-1)) {
					cnt++;
					if(cnt == k) {
						result.delete(i-k+1, i+1);
						i=i-k+1;
						cnt=1;
						flag=true;
					}
				}else {
					cnt=1;
				}
			}
			if(!flag) {
				break;
			}
		}
		
		return result.toString();
	}
}
