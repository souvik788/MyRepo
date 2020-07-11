package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackWithGetMin {
	
	private Deque<Integer> stk;
	private Deque<Integer> minStk;
	
	public StackWithGetMin() {
		stk = new ArrayDeque<>();
		minStk = new ArrayDeque<>();
	}
	
	public void push(int num) {
		stk.add(num);
		if(minStk.isEmpty() || num<minStk.peek()) {
			minStk.add(num);
		}
	}
	
	public int pop() {
		if(stk.isEmpty()) {
			return -1;
		}
		int elem = stk.pop();
		if(elem == minStk.peek()) {
			minStk.pop();
		}
		return elem;
	}
	
	public int getMin() {
		if(minStk.isEmpty()) {
			return -1;
		}
		return minStk.peek();
	}

	public static void main(String[] args) {
		StackWithGetMin obj = new StackWithGetMin();
		obj.push(2);
		obj.push(5);
		obj.push(3);
		obj.push(9);
		obj.push(6);
		obj.push(7);
		
		System.out.println(obj.getMin());
	}

}
