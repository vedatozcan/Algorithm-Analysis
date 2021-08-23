
public class Algoritms {
	public void heapSort(int arr[]) {
		int n = arr.length;
		for (int i = n / 2 - 1; i >= 0; i--)// Build heap
			heapify(arr, n, i);

		for (int i = n - 1; i >= 0; i--) {
			int temp = arr[0];
			arr[0] = arr[i];
			arr[i] = temp;

			heapify(arr, i, 0);// call max heapify
		}
	}

	public void heapify(int arr[], int n, int i) {
		int largest = i;
		int l = 2 * i + 1; // left
		int r = 2 * i + 2; // right

		if (l < n && arr[l] > arr[largest])// If left child is larger than root
			largest = l;

		if (r < n && arr[r] > arr[largest])// If right child is larger than largest so far
			largest = r;

		if (largest != i) {// If largest is not root
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;

			heapify(arr, n, largest);// Recursively heapify the affected sub-tree
		}
	}

	public void printHeapSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public void dualPivotQuickSort(int[] arr, int p, int r) {
		try {
			if (p < r) {
				int lp = partition(arr, p, r, p); // left pivot lp = partition(arr, p, 0, p);
				int rp = partition(arr, p, r, lp); // right pivot

				dualPivotQuickSort(arr, p, lp - 1); // recursively sorts the left,
				dualPivotQuickSort(arr, lp + 1, rp - 1); // middle, and right sub-arrays
				dualPivotQuickSort(arr, rp + 1, r); // created for algorithm
			}
		} catch (StackOverflowError ex) {
			System.gc();
		}
	}

	public int partition(int[] arr, int p, int r, int lp) {
		if (arr[p] > arr[r]) {
			int temp = arr[p];
			arr[p] = arr[r];
			arr[r] = temp;
		}

		int j = p + 1;
		int g = r - 1;
		int k = p + 1;
		int h = arr[p]; // left pivot
		int i = arr[r]; // right pivot

		while (k <= g) {

			// checks if element at k is less than the left pivot
			if (arr[k] < h) {
				int temp = arr[k];
				arr[k] = arr[j];
				arr[j] = temp;
				j++;
			}

			// checks if element at k is greater than or equal to the right pivot
			else if (arr[k] >= i) {
				while (arr[g] > i && k < g)
					g--;
				int temp = arr[k];
				arr[k] = arr[g];
				arr[g] = temp;
				g--;
				if (arr[k] < h) {
					temp = arr[k];
					arr[k] = arr[j];
					arr[j] = temp;
					j++;
				}
			}
			k++;
		}
		j--;
		g++;

		// puts pivots into their position in the array
		// left pivot
		int temp = arr[p];
		arr[p] = arr[j];
		arr[j] = temp;
		// right pivot
		temp = arr[r];
		arr[r] = arr[g];
		arr[g] = temp;

		// return indices of pivots
		lp = j; // resets left pivot (cannot return two elements for this method)
		return g;

	}

	public void printDualPivotQuickSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public int shellSort(int arr[]) {
		int n = arr.length;

		for (int gap = n / 2; gap > 0; gap /= 2) {// Start with a big gap, then reduce the gap
			for (int i = gap; i < n; i += 1) {

				int temp = arr[i];

				// shift earlier gap-sorted elements up until the correct location for a[i] is
				// found
				int j;
				for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
					arr[j] = arr[j - gap];

				// put temp (the original a[i]) in its correct location
				arr[j] = temp;
			}
		}
		return 0;
	}

	public void printShellSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
