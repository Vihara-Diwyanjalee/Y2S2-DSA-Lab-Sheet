package labSheet02;

public class QueueX {

	private int[] queueArr;
	private int maxSize;
	private int rear;
	private int front;
	private int noItems;
	
	public QueueX(int s) {
		this.maxSize = s;
		this.queueArr = new int[maxSize];
		this.rear = -1;
		this.front = 0;
		this.noItems = 0;
	}
	
	public boolean isEmpty() {
		return (noItems == 0);
	}
	
	public boolean isFull() {
		return (rear == maxSize - 1);
	}
	
	public void insert(int j) {
		if(!isFull()) {
			queueArr[++rear] = j;
			noItems++;
		}else 
			System.out.println("Queue is full");	
	}
	
	public int remove() {
		if(!isEmpty()) {
			noItems--;
			return queueArr[front++];
		}else {
			System.out.println("Queue is Empty");
			return -99;
		}	
	}
	
	public int peekFront() {
		if(!isEmpty()) {
			return queueArr[front];
		}else {
			System.out.println("Queue is Empty");
			return -99;
		}	
	}
}

package labSheet02;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		QueueX mainQueue = new QueueX(5);
		
		for(int i=0; i< 5; i++) {
			System.out.print("Enter transaction ID " + (i+1) + ": ");
			int printerQueue = sc.nextInt();
			mainQueue.insert(printerQueue);
		}
		
		QueueX evenQueue = new QueueX(5);
		QueueX oddQueue = new QueueX(5);
		
		while(!mainQueue.isEmpty()) {
			int x = mainQueue.remove();
			if(x%2 == 0) {
				evenQueue.insert(x);
			}else {
				oddQueue.insert(x);
			}
		}
		
		System.out.println();
		System.out.println("pc 1");
		
		while(!evenQueue.isEmpty()) {
			System.out.println("Transaction " + evenQueue.remove());
		}
		
		System.out.println("pc 2");
		
		while(!oddQueue.isEmpty()) {
			System.out.println("Transaction " + oddQueue.remove());
		}

	}

}

