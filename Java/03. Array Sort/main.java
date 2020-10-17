public class main {

	static void readA(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	static void sort(int array[]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] < array[j]) {
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int array[] = {3, 7, 2, 5, 4, 6, 1, 7, 12, 57, 52, 11};

		sort(array);
		readA(array);

	}
}
