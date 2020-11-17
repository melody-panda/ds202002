/* 문제 1
  형수는 스택과 큐를 이용해서 숫자들을 정렬하는 것을 만들어보려고 합니다.
  다음과 같은 알고리즘으로 숫자들 정렬하는 것을 수행합니다.
	a) 큐와 스택을 생성합니다.
	b) 숫자 n을 입력받습니다.
	c) 큐에 n개의 랜덤한 숫자들을 넣습니다. 랜덤한 숫자는 0~10000 범위로 합니다.
	d) 큐에서 숫자 하나를 꺼냅니다.
	e) 스택 최상위 숫자가 큐에서 꺼낸 숫자보다 작은 경우, 스택에서 숫자를 꺼내 큐에 넣습니다.
	f) 스택이 비어있거나 스택 최상위 숫자가 큐에서 꺼낸 숫자보다 클때까지 e)를 반복합니다.
	g) 스택에 큐에서 꺼낸 숫자를 넛습니다.
	h) 큐가 비어있지 않다면 d)로 가서 수행을 계속합니다.
	i) 스택에 있는 데이터를 하나씩 꺼내면서 데이터를 출력합니다.
*/

import java.util.*;

public class hw1_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 큐 생성
		Queue <Integer> queue = new LinkedList<>();
		
		// 스택 생성
		Stack <Integer> stack = new Stack <>();
		
		// 숫자 n 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.println("생성할 데이터 개수 n을 입력하세요 : ");
		int n = sc.nextInt();
		
		// n개의 랜덤한 숫자(0~10000) 생성하고 큐에 넣기
		Random random = new Random();
		
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			int r = random.nextInt(10000) + 1; // 1~10까지 랜덤으로 데이터 생성
			array[i] = r;
			int count = 0;
			for(int j=0; j<i; j++) {
				if(array[j]==array[i]) {
					count +=1;
				}
			}
			if(count==2) {
				i-=1;
			}
		}
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		// 큐에서 숫자 하나 꺼내기
		
		
		
	}

}
