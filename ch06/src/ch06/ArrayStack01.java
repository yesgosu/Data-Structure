package ch06;


import java.util.EmptyStackException;

public class ArrayStack01<E> {
   private E s[];
   private int top;
   public ArrayStack01(){
      s = (E[]) new Object[1];
      top = -1;
   }
   public int size() {
      return top+1;
   }
   public boolean isEmpty() {
      return (top==-1);
   }
   public E peek() {
      if(isEmpty()) throw new EmptyStackException();
      return s[top];
   }
   public void resize() {
      
   }
   
   public void push(E newItem) {
      if(size() == s.length)
         resize(2*s.length);
      s[++top] = newItem;
   }
   public E pop() {
      if(isEmpty()) throw new EmptyStackException();
      E item = s[top];
      s[top--] = null;
      if(size() > 0 && size()==s.length/4)
         resize(s.length/2);
      return item;
   }
   public void resize(int newSize) {
	   Object[] t = new Object[newSize];
	   for (int i=0; i<size(); i++)
		   t[i] = s[i];
	   s = (E[]) t;
   }
   public void print() {
	   if(isEmpty()) System.out.print("������ �������");
	   else
		   for(int i=0; i<size(); i++)
			   System.out.print(s[i]+"/t");
	   System.out.println();
   }

}