//https://leetcode.com/problems/next-greater-element-iii/description/
public class NextGreaterElementIII {

	public static void main(String[] args) {
		int n = 2147483486;
		int result = nextGreaterElement(n);
		System.out.println(result);
	}

	private static int nextGreaterElement(int n) {
		int result = 0;
		int pos = -1;
		String str = String.valueOf(n);
		char[] tempChar = str.toCharArray();

		for (int i = tempChar.length - 2; i >= 0; i--) {
			if (tempChar[i] < tempChar[i + 1]) {
				pos = i;
				break;
			}
		}
		if (pos == -1) {
			return -1;
		}
		int pos2 = 0;
		for (int i = tempChar.length - 1; i > pos; i--) {
			if (tempChar[i] > tempChar[pos]) {
				pos2 = i;
				break;
			}
		}
		// swap
		char temp = tempChar[pos];
		tempChar[pos] = tempChar[pos2];
		tempChar[pos2] = temp;
		// swap

		// reverse
		int left = pos + 1;
		int right = tempChar.length - 1;

		for (; left <= right; left++, right--) {
			char tmp = tempChar[left];
			tempChar[left] = tempChar[right];
			tempChar[right] = tmp;
		}
		// reverse
		try {
			result = Integer.parseInt(String.valueOf(tempChar));
		} catch (java.lang.NumberFormatException e) {
			return -1;
		}

		return result;
	}
}
