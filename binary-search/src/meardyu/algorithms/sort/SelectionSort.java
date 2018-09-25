package meardyu.algorithms.sort;

import meardyu.algorithms.Utils.Exchange;
import meardyu.algorithms.Utils.Print;

public class SelectionSort {

	void sortWeb(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			
			int min = i;
			// find minimum element
			for (int j = i+1; j < n; j++)
				if (arr[min] > arr[j])
					min = j;
			// swap
			Exchange.swap(arr, i, min);

		}
	}
	
	//BAD
	void sortMyself(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if (arr[i] > arr[j])
					Exchange.swap(arr, i, j);

	}

	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int arr[] = { 23, 23, 12, 14, 35, 1, 3, 23 };

		sort.sortMyself(arr);

		Print.printArray(arr);
	}

}
