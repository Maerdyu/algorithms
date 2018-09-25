package meardyu.algorithms.sort;

import meardyu.algorithms.Utils.Exchange;
import meardyu.algorithms.Utils.Print;

public class BubbleSort {

	void sortFirst(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1])
					Exchange.swap(arr, j, j + 1);

	}

	//Good
	void sortSecond(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swaped = false;
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					Exchange.swap(arr, j, j + 1);
					swaped = true;
				}
			
			if (!swaped) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort bubble = new BubbleSort();
		int arr[] = { 12, 34, 2, 45, 1, 34, 4, 32, 2, 5334, 523, 4, 5, 32, 1 };

		bubble.sortSecond(arr);

		Print.printArray(arr);
	}
}
