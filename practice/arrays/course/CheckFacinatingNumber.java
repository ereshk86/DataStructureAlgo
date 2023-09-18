package practice.arrays;

public class CheckFacinatingNumber {
	public static void main(String[] args) {
		int input = 192;
		String concat = (Integer.toString(input) + Integer.toString(input * 2) + Integer.toString(input * 3));
		boolean flag = true;
		for (char c = '1'; c <= '9'; c++) {
			int count = 0;
			for (int i = 0; i < concat.length(); i++) {
				char ch = concat.charAt(i);
				if (ch == c)
					count++;
			}
			if (count > 1 || count == 0) {
				flag = false;
				break;
			}
		}
		if (flag) {
			System.out.println("Fascinatiing Number");
		} else {
			System.out.println("Not FascinatingNumber");
		}

	}
}
