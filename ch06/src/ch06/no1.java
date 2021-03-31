package ch06;

interface Stack{
	boolean isEmpty();
	void push(char item);
	char pop();
	void delete();
	char peek();
}

class StackNode{
	char data;
	StackNode link;
}
class LinkedStack implements Stack{
	private StackNode top;
	
	public boolean isEmpty() {
		return(top==null);
	}
	public void push(char item) {
		StackNode newNode = new StackNode();
		newNode.data = item;
		newNode.link = top;
		top = newNode;
		System.out.println("Inserted Item :"+ item);
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("Deleting fail! linked stack is empty!!");
			return 0;
		}else {
			char item = top.data;
			top = top.link;
			return item;
		}
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(isEmpty()) {
			System.out.println("Deleting fail! linked stack is empty!!");
		}
		else {
			top = top.link;
		}
	}
	@Override
	public char peek(){
		 if(isEmpty()){
		 System.out.println("Peeking fail! Linked Stack is empty!!");
		 return 0;
		 }
		 else
		 return top.data;
		 }


	public void printStack() {
		if(isEmpty()) 
			System.out.printf("Linked stack is empty!! %n %n");
		else {
			StackNode temp = top;
			System.out.println("linked stack>>");
			while(temp != null) {
				System.out.printf("\t %c \n",temp.data);
				temp = temp.link;
			}
			System.out.println();
		}
	}
	}



