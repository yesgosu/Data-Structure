package dq;

public class DQueue {
	dqNode front;
	dqNode rear;
	
	public DQueue() {
		front = null;
		rear = null;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
	
	public void insertFront(char item) {
		dqNode newNode = new dqNode();
		newNode.data = item;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.rlink = null;
			newNode.llink = null;
		}
		else {
			front.llink = newNode;
			newNode.rlink = front;
			newNode.llink = null;
			front = newNode;
		}
		System.out.println("Front Inserted Item : " + item);
	}
	
	public void insertRear(char item) {
		dqNode newNode = new dqNode();
		newNode.data = item;
		if(isEmpty()) {
			front = newNode;
			rear = newNode;
			newNode.rlink = null;
			newNode.llink = null;
		}
		else {
			rear.llink = newNode;
			newNode.rlink = front;
			newNode.llink = null;
			rear = newNode;
		}
		System.out.println("Front Inserted Item : " + item);
	}
	
	public char deleteFront() {
		if(isEmpty()) {
			System.out.println("Front Deleting fail! DQueue is empty!!");
			return 0;
		}
		else {
			char item = front.data;
			if(front.rlink == null) {
				front = null;
				rear = null;
			}
			else {
				front = front.rlink;
				front.llink = null;
			}
			return item;
		}
	}
	
	public char deleteRear() {
		if(isEmpty()) {
			System.out.println("Rear Deleting fail! DQueue is empty!!");
			return 0;
		}
		else {
			char item = rear.data;
			if(rear.llink == null) {
				rear = null;
				front = null;
			}
			else {
				rear = rear.llink;
				rear.rlink = null;
			}
			return item;
		}
	}
	
	public void removeFront() {
		if(isEmpty()) {
			System.out.println("Front Removing fail! DQueue is empty!!");
		}
		else {
			if(front.rlink == null) {
				front = null;
				rear = null;
			}
			else {
				front = front.rlink;
				front.llink = null;
			}
		}
	}
	
	public void removeRear() {
		if(isEmpty()) {
			System.out.println("Rear Removing fail! DQueue is empty!!");
		}
		else {
			if(rear.rlink == null) {
				rear = null;
				front = null;
			}
			else {
				rear = rear.llink;
				rear.rlink = null;
			}
		}
	}
	
	public char peekFront() {
		if(isEmpty()) {
			System.out.println("Front Peeking fail! DQueue is empty!!");
			return 0;
		}
		else
			return front.data;
	}
	
	public char peekRear() {
		if(isEmpty()) {
			System.out.println("Rear Peeking fail! DQueue is empty!!");
			return 0;
		}
		else
			return rear.data;
	}
	
	public void printDQueue() {
		if(isEmpty())
			System.out.printf("DQueue is empty!! %n %n");
		else {
			dqNode temp = front;
			System.out.printf("DQueue>> ");
			while(temp != null) {
				System.out.printf("%c ", temp.data);
				temp = temp.rlink;
			}
			System.out.println(); System.out.println();
		}
	}
}
