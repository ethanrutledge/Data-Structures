// Stack.java - generic class that implements a stack using an ArrayList
// Author: 
// Date: 
// Course: 
// Email: import java.util.ArrayList;

import java.util.ArrayList;

public class Stack<E> implements StackIF<E>{

	private ArrayList<E> theStack;

	public Stack(){
		theStack = new ArrayList<E>();
	}

	@Override
	/**
	 * push op on Run Time Stack
	 */
	public void push(E op) {
		// TODO Auto-generated method stub
		// STUDENT CODE HERE
		this.theStack.add(op);
	}

	@Override
	/**
	 * pop and return top Object from Run Time Stack
	 * If Stack empty, throw StackException("Popping from empty stack!");
	 */
	public E pop() throws StackException {
		// STUDENT CODE HERE
		if (this.isEmpty()) {
			throw new StackException("Popping from empty stack!");
		}
		return this.theStack.remove(this.theStack.size() - 1);
		
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		// STUDENT CODE HERE
		if (this.theStack.isEmpty()) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString(){
		// DO NOT CHANGE THIS CODE
		return theStack.toString();
	}

	public static void main(String[] args) throws StackException{
		// STUDENTS: feel free to change this code to test the methods
		Stack<Frame> st = new Stack<>();
		st.push(new Frame(1,3,1,3));
		st.push(new Frame(0,2,1,2));
		System.out.println("st: " + st);
		st.pop();
		System.out.println("st: " + st);
		st.pop();
		System.out.println("st: " + st);
		// wait for it ....  st.pop();
	}

}
