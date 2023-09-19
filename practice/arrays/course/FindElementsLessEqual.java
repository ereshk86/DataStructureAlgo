public class FindElementsLessEqual {
	public static void main(String[] args) {
		int arrayA[] = {1, 2, 2, 2, 5, 7, 9};
		int size = arrayA.length;
		int elementX = 2;
		findElementsLessEqual(arrayA, size, elementX);
	}

	private static void findElementsLessEqual(int[] arrayA, int size, int elementX) {
		// TODO Auto-generated method stub
		int count = 0;
		if (size > 0) {
			for (int i = 0; i < size; i++) {
				if (arrayA[i] <= elementX)
					count++;
			}
		}

		System.out.println(count);

	}
}
