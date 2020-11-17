/* 문제 2 - 백준 10845 풀기

  <큐> 	정수를 저장하는 큐를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
  		명령은 총 여섯 가지이다.
  		
		- push X : 정수 X를 큐에 넣는 연산이다.
		- pop : 큐에서 가장 앞에 있는 정수를 뺴고, 그 수를 출력한다.
   				만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
   		- size : 큐에 들어있는 정수의 개수를 출력한다.
   		- empty : 큐가 비어있으면 1, 아니면 0을 출력한다.
   		- front : 큐의 가장 앞에 있는 정수를 출력한다.
   			           만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		- back : 큐의 가장 뒤에 있는 정수를 출력한다.
			         만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

 <입력> 	첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
 		둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
 		주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
 		문제에 나와있지 않은 명령이 주어지는 경우는 없다.

 <출력> 	출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.
 
 */

import java.util.Arrays;
import java.util.Scanner;

public class hw2_10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("명령의 수 N을 입력하세요 : ");
		int N = sc.nextInt(); // 1 ≤ N ≤ 10,000
		int [] queue = new int[10000];
		Arrays.fill(queue, -1);

		int front = 0;
		int back = 0;
		
		System.out.println();
		
		String temp;
		for(int i=0; i<N; i++) {
			temp = sc.next();
			if (temp.equals("push")) {
				queue[back] = sc.nextInt();
				back++;
			} else if (temp.equals("pop")) {
				System.out.println(queue[front]);
				if (queue[front] == -1) { // 없을 때 -1
				} else {
					queue[front] = -1;
					front++;
				}
			} else if (temp.equals("size")) {
				if(back == 0) {
					System.out.println("0");
				} else {
					System.out.println(back - front);
				}
			} else if (temp.equals("empty")) {
				if (back == 0 || back <= front) {
					System.out.println("1"); // 큐가 비어있을때 1
				} else {
					System.out.println("0"); // 큐가 비어있지 않을 때
				}
			} else if (temp.equals("front")) {
				System.out.println(queue[front]);
			} else if (temp.equals("back")) {
				if (back == 0) {
					System.out.println("-1");
				} else {
					System.out.println(queue[back-1]);
				}
			}
		
		}
		
		sc.close();
		
	}
}

/*
import java.util.Scanner;

public class hi {
    static public class Que {
        private int[] queue;
        private int back;
        private int front;
        
        public Que() {
            queue = new int[10000];
            back = -1;
            front = -1;
        }
        
        public void pushX(int x) {
            queue[++back] = x;   
        }

        public int size() {
            return back-front;
        }
        
        public int empty() {
            if(back == front){
                return 1;
            } else {
                return 0;
            }
        }
        
        public int front() {
            if(empty() == 1) {
                return -1;
            } else {
                return queue[front +1];
            }
        }
        
        public int back() {
            if(empty() == 1){
                return -1;
            } else {
                return queue[back];
            }
        }
        
        public int pop() {
            if (empty() ==1){
                return -1;
            }
            int temp = queue[front +1];
            queue[front +1] = -1;
            front++;
            return temp;
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        Que queue = new Que();
        int count = sc.nextInt();
        
        for(int i=0; i<count; i++){
            String input = sc.next();
            
            if(input.contains("push")){
                int x = sc.nextInt();
                queue.pushX(x);
            } else if (input.contains("pop")){
                System.out.println(queue.pop());
            } else if (input.contains("front")){
                System.out.println(queue.front());
            } else if (input.contains("back")){
                System.out.println(queue.back());
            } else if (input.contains("size")){
                System.out.println(queue.size());
            } else if (input.contains("empty")){
                if(queue.empty() == 1){
                    System.out.println(1);   
                } else {
                    System.out.println(0); }
            }           
        }
        return;
    }
} */
