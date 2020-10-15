import java.util.*;

public class hw1874 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Stack <Integer> stack = new Stack <>();
		int[] array = new int[n];
		
		for(int i=0; i<n; i++) {
			array[i] = sc.nextInt();
		}
		
		ArrayList <String> print = new ArrayList <>();
		
		int index = 0;
		
		for(int i=1; i<=n; i++) {
			stack.push(i);
			print.add("+");
			
			while(!stack.isEmpty() && array[index] == (int)stack.peek()) {
				index ++;
				stack.pop();
				print.add("-");
			}
		}
		if(!stack.isEmpty()) {
			System.out.println("NO");
		} else {
			for(int i=0; i<print.size(); i++) {
				System.out.println(print.get(i));
			}
		}
		sc.close();
	}
	
}	