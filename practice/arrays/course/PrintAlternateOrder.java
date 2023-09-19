public class PrintAlternateOrder {
	public static void main(String[] args) {
		int inputArray[] = { 1, 2, 3, 4, 5 };
		int lenght = inputArray.length;
		printAlterateOrder(inputArray, lenght);
	}

	private static void printAlterateOrder(int[] inputArray, int lenght) {
		for (int i = 0; i < inputArray.length; i = i + 2) {
			System.out.println(inputArray[i]);
		}
	}

}
