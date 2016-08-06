import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class TestComplexity extends Heap {
	public static void main(String[] args) {
		System.out.println("enter the range 0 to n for test the sorting algo");
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		Integer[] arr =  new Integer[range];
		
		Random rn = new Random();
		
		for(int k = 0; k < range; k++) {
			arr[k] = rn.nextInt() % range;
		}
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println( "before sorting " + dateFormat.format(date));
		Heap heapSort = new Heap();
		heapSort.sort(arr);
	
		Date date1 = new Date();
		System.out.println( " after sorting " +dateFormat.format(date1));
	}
}
