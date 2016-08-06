import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quick_Sort implements Sorting {
	private static Integer[] arr;
	private static int high;

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter the size  of  array");
			high = sc.nextInt();
			arr = new Integer[high];
			System.out.println("please enter array elemts");
			for (int i = 0; i < high; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Before Sorting" + Arrays.toString(arr));
			Quick_Sort obj = new Quick_Sort();

			obj.sort(arr);
			System.out.println("After Sorting" + Arrays.toString(arr));
		} catch (InputMismatchException e) {
			System.out.println("please enter integer only" + e.getMessage());
		}
	}

	public static void quickSort(Integer[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;

		if (low >= high)
			return;

		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];

		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}

			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);

		if (high > i)
			quickSort(arr, i, high);
	}

	public void sort(Integer[] arr) {
		int low = 0;
		quickSort(arr, low, high - 1);

	}
}