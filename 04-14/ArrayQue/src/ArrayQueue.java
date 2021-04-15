interface Queue{
	boolean isEmpty(); 
	void enQueue(char item);
	char deQueue();
	void delete();
	char peek();
}

class ArrayQueue implements Queue{
	private int front;
	private int rear;
	private int queueSize;
	private char itemArray[];
	
	public ArrayQueue(int queueSize) {
		front = -1;
		rear = -1;
		this.queueSize = queueSize;
		itemArray = new char[this.queueSize];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return (front == rear);
	}
	
	public boolean isFull() {
		return (rear == this.queueSize-1);
	}
	
	
	@Override
	public void enQueue(char item) {
		// TODO Auto-generated method stub
		if(isFull()) {
			System.out.println("Inserting fail! Array Queue is full!!");
		}
		else {
			itemArray[++rear] = item;
			System.out.println("Inserted Item :"+ item);
		}
	}

	@Override
	public char deQueue() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Queue is empty!!");
			return 0;
		}
		else {
			return itemArray[++front];
		}
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! Array Queue is empty!!");
		}
		else {
			++front;
		}
	}

	@Override
	public char peek() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Peek fail! Array Queue is empty!!");
			return 0;
		}
		else 
			return itemArray[front+1];
	}
	public void printQueue() {
		if(isEmpty())
			System.out.printf("Array Queue is empty!! %n %n");
		else {
			System.out.printf("Array Queue>> ");
			for(int i=front+1; i<=rear; i++)
				System.out.printf("%c",itemArray[i]);
			System.out.println();System.out.println();
		}
	}

}
