import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class TestComplexity {
	public static void main(String[] args) {
		System.out.println("enter the range 0 to n for test the sorting algo");
		Scanner sc = new Scanner(System.in);
		BigInteger len = sc.nextBigInteger();
		int range = len.intValue();
		Integer[] arr =  new Integer[range];
		Integer[] arr2 =  new Integer[range];
		
		Random rn = new Random();
		
		for(int k = 0; k < range; k++) {
			arr[k] = rn.nextInt() % range;
			arr2[k] = arr[k];
		}

		
		Heap heapSort = new Heap();
		long start = System.nanoTime();
		heapSort.sort(arr);
	
		long end = System.nanoTime();
		long microseconds = (end - start) / 1000;
		System.out.println(" time taken to complete sorting from heapSort :" +microseconds + " (nanoSec)");

		
		
		Quick_Sort qsort = new Quick_Sort();
		long start1 = System.nanoTime();
		qsort.sort(arr2);
		long end1 = System.nanoTime();
		long microseconds1 = (end1 - start1) / 1000;
		System.out.println(" time taken to complete sorting from quickSort :" +microseconds1 + " (nanoSec)");
		
	}
}
