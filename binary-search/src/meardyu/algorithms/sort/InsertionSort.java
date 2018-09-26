package meardyu.algorithms.sort;

import meardyu.algorithms.Utils.Print;

public class InsertionSort {
	
	void sort(int arr[]) {
		int n = arr.length;
		
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
		}
	}

	public static void main(String[] args) {
		
		int arr[] = {12,23,1,3,123,4,2,4,51,422,2,42,21};
		InsertionSort insertion = new InsertionSort();
		
		insertion.sort(arr);
		
		Print.printArray(arr);
	}
}
