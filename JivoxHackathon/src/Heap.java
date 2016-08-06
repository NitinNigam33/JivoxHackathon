import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Heap implements Sorting {

	private static int total;
	private static Integer[] arr;

	private static void swap(Integer[] arr, int a, int b) {
		Integer tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;
	}

	private static void heapify(Integer[] arr, int i) {
		int lft = (i * 2) + 1;
		int rgt = lft + 1;
		int grt = i;

		if (lft < total && arr[lft] > arr[grt])
			grt = lft;
		if (rgt < total && arr[rgt] > arr[grt])
			grt = rgt;
		if (grt != i) {
			swap(arr, i, grt);
			heapify(arr, grt);
		}
	}

	public void sort(Integer[] arr) {

		for (int i = (total + 1) / 2; i >= 0; i--)
			heapify(arr, i);

		for (int i = total - 1; i > 0; i--) {
			swap(arr, 0, i);
			total--;
			heapify(arr, 0);
		}
	}

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("please enter the size  of  array");
			total = sc.nextInt();
			arr = new Integer[total];
			System.out.println("please enter array elemts");
			for (int i = 0; i < total; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Before Sorting" + Arrays.toString(arr));
			Heap obj = new Heap();
			obj.sort(arr);
			System.out.println("After Sorting" + Arrays.toString(arr));
		} catch (InputMismatchException e) {
			System.out.println("please enter integer only" + e.getMessage());
		}

	}

}
