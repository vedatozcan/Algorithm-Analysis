
public class Test {
	static Algoritms obj = new Algoritms();
	static int n = 1000;
	static int[] arr = new int[n];
	static long startTime;
	static long endTime;
	static double duration;

	public static void heapEqual() {
		equalIntegers(arr);
		startTime = System.nanoTime();
		obj.heapSort(arr);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of heapSort for equal integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void heapRandom() {
		randomIntegers(arr);
		startTime = System.nanoTime();
		obj.heapSort(arr);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of heapSort for random integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void heapIncreasing() {
		increasingIntegers(arr);
		startTime = System.nanoTime();
		obj.heapSort(arr);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of heapSort for increasing integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void heapDecreasing() {
		decreasingIntegers(arr);
		startTime = System.nanoTime();
		obj.heapSort(arr);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of heapSort for decreasing integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void dualPivotEqual() {
		equalIntegers(arr);
		startTime = System.nanoTime();
		obj.dualPivotQuickSort(arr, 0, arr.length - 1);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of dualPivotQuickSort for equal integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void dualPivotRandom() {
		randomIntegers(arr);
		startTime = System.nanoTime();
		obj.dualPivotQuickSort(arr, 0, arr.length - 1);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of dualPivotQuickSort for random integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void dualPivotIncreasing() {
		increasingIntegers(arr);
		startTime = System.nanoTime();
		obj.dualPivotQuickSort(arr, 0, arr.length - 1);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of dualPivotQuickSort for increasing integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void dualPivotDecreasing() {
		decreasingIntegers(arr);
		startTime = System.nanoTime();
		obj.dualPivotQuickSort(arr, 0, arr.length - 1);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of dualPivotQuickSort for decreasing integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void shellEqual() {
		equalIntegers(arr);
		startTime = System.nanoTime();
		obj.shellSort(arr);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of shellSort for equal integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void shellRandom() {
		randomIntegers(arr);
		startTime = System.nanoTime();
		obj.shellSort(arr);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of shellSort for random integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void shellIncreasing() {
		increasingIntegers(arr);
		startTime = System.nanoTime();
		obj.shellSort(arr);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of shellSort for increasing integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void shellDecreasing() {
		decreasingIntegers(arr);
		startTime = System.nanoTime();
		obj.shellSort(arr);
		endTime = System.nanoTime();
		duration = (endTime - startTime) / 1000000d;
		System.out.println("Total running time of shellSort for decreasing integers is: " + duration + " milliseconds");
		System.out.println();

	}

	public static void equalIntegers(int[] arr) {
		int random = (int) (Math.random() * 10000);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random;
		}
	}

	public static void randomIntegers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10000);// take 10000 for max value
		}
	}

	public static void increasingIntegers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
	}

	public static void decreasingIntegers(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
		}

	}

	public static void printArray(int[] arr) { // The first unsorted array

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		heapEqual();
		dualPivotEqual();
		shellEqual();

		heapRandom();
		dualPivotRandom();
		shellRandom();

		heapIncreasing();		
		dualPivotIncreasing();  	
    	        shellIncreasing();
		
		heapDecreasing(); 	
    	        dualPivotDecreasing();	
    	        shellDecreasing();	

	}
}
