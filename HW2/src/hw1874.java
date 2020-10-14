import java.util.EmptyStackException;
import java.util.Scanner;

public class hw1874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack <Integer> stack = new Stack<Integer>();
		int[] array = new int[n];
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		Stack <String> print = new Stack<String>();
		int index = 0;
		for(int i=1; i<n; i++) {
			stack.push(i);
			print.push("+");
			while(!stack.isEmpty() && array[index] == (int)stack.peek()) {
				index ++;
				stack.pop();
				print.push("-");
			}
		}
		if(!stack.isEmpty()) {
			System.out.println("NO");
		} else {
			for(int i=0; i<print.size(); i++) {
				System.out.println(print);
			}
		}
		sc.close();
	}
}	


class Stack<E> {
	E data[];
	int top;
	int size;
	public Stack() {
		data = (E[]) new Object[1];
		top = -1;
		size = 0;
	}
	public void push(E newItem) {
		top ++;
		data[top] = newItem;
		System.out.println("+");
	}
	public void pop() {
		data[top] = null;
		top--;
		System.out.println("-");
	}
	public E peek() {
		return data[top];
	}
	public int size() {
		return top+1;
	}
	public boolean isEmpty() {
		return top == -1;
	}
	
}