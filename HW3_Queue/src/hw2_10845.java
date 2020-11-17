/* ���� 2 - ���� 10845 Ǯ��

  <ť> 	������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
  		����� �� ���� �����̴�.
  		
		- push X : ���� X�� ť�� �ִ� �����̴�.
		- pop : ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�.
   				���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
   		- size : ť�� ����ִ� ������ ������ ����Ѵ�.
   		- empty : ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
   		- front : ť�� ���� �տ� �ִ� ������ ����Ѵ�.
   			           ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		- back : ť�� ���� �ڿ� �ִ� ������ ����Ѵ�.
			         ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.

 <�Է�> 	ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����.
 		��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
 		�־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����.
 		������ �������� ���� ����� �־����� ���� ����.

 <���> 	����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 
 */

import java.util.Arrays;
import java.util.Scanner;

public class hw2_10845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("����� �� N�� �Է��ϼ��� : ");
		int N = sc.nextInt(); // 1 �� N �� 10,000
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
				if (queue[front] == -1) { // ���� �� -1
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
					System.out.println("1"); // ť�� ��������� 1
				} else {
					System.out.println("0"); // ť�� ������� ���� ��
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
