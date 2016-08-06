import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class TestComplexity extends Heap {
	public static void main(String[] args) {
		System.out.println("enter the range 0 to n for test the sorting algo");
		Scanner sc = new Scanner(System.in);
		BigInteger len = sc.nextBigInteger();
		int range = len.intValue();
		Integer[] arr =  new Integer[range];
		
		Random rn = new Random();
		
		for(int k = 0; k < range; k++) {
			arr[k] = rn.nextInt() % range;
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println( "Time before sorting from HeapSort " + dateFormat.format(date));
		Heap heapSort = new Heap();
		heapSort.sort(arr);
	
		DateFormat dateFormat1 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date1 = new Date();
		System.out.println( "Time after sorting from HeapSort " + dateFormat1.format(date1));
		
		DateFormat dateFormat11 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date11 = new Date();
		System.out.println( " Time before sorting from quickSort " + dateFormat11.format(date11));
		Quick_Sort qsort = new Quick_Sort();
		DateFormat dateFormat111 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date111 = new Date();
		System.out.println( " Time after sorting from quickSort " + dateFormat111.format(date111));
		
	}
}
