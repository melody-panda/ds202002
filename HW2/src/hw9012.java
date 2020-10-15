import java.util.Scanner;
import java.util.Stack;

public class hw9012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		Stack<Character> stack = new Stack<>();
		String[] string = new String[T];
		
		for(int i=0; i<T; i++) {
			boolean isRight;
			isRight = true;
			string[i] = sc.nextLine();
			
			for(int k=0; k<string[i].length(); k++) {
				
				if(string[i].charAt(k)=='(') {
					stack.push(string[i].charAt(k));
				} else if (stack.isEmpty()) {
					isRight = false;
				} else {
					stack.pop();
			}
		}
			if(!stack.isEmpty()) {
				isRight = false;
			}
			
			if(isRight==true) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
	}
		sc.close();
	
	}

}
