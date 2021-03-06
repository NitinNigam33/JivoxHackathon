import java.util.InputMismatchException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Implement_PriorityQueue extends Heap {
	PriorityQueue<Integer> pq;

	public Implement_PriorityQueue() {
		pq = new PriorityQueue<Integer>();
	}

	/**
	 * insert queue elements in minHeap orders so minimum value is the most high
	 * priority
	 * 
	 * @param Integer
	 *            array
	 */
	public void insert(Integer[] x) {
		Heap heapSort = new Heap();
		heapSort.sort(x);
		for (int i = 0; i < x.length; i++) {
			pq.offer(x[i]);
		}
	}

	public int peek() {
		return pq.peek();
	}

	public int extractMin() {
		return pq.poll();
	}

	public int getSize() {
		return pq.size();
	}

	public void print() {
		System.out.println(pq);
	}

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);

			Implement_PriorityQueue queue = new Implement_PriorityQueue();

			System.out
					.println("please enter the count of elements you wants to enter in priority queue");
			int range = sc.nextInt();
			Integer[] num = new Integer[range];
			for (int i = 0; i < range; i++) {
				num[i] = sc.nextInt();
			}
			queue.insert(num);

			System.out.println("front elem in priorityQueue :" + queue.peek());
			System.out.println("Size of PriorityQueue is :" + queue.getSize());
			System.out
					.println("------------------------------------------------------");
			System.out.print("Priority_queue is ");
			queue.print();

			System.out
					.println("Highest priority element in priority queue is : "
							+ queue.extractMin());
		} catch (InputMismatchException e) {
			System.out.println("please enter integer only" + e.getMessage());
		}

	}
}