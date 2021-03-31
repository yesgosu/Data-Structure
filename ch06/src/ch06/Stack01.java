package ch06;

public class Stack01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack01<String> stack = new ArrayStack01<String>();
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		System.out.println(stack.peek());
		stack.push("grape");
		stack.print();
		
	}

}
