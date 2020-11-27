import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

// 02. 텀프로젝트 구간이 여러개 주어졌을 때 문제
// 제출기한 : 11월 27일
// 1) N과 K를 입력받음
//  - N개의 데이터를 랜덤으로 생성
//  - K개의 구간을 랜덤으로 생성
//	- 각 구간별로 최소값, 최대값, 합계를 기존의 방식을 이용해서 구하기
// 2) K를 고정하고 N을 변화시키면서 그래프 그리기
// 3) N을 고정하고 K를 변화시키면서 그래프 그리기
// 4) 현재 N, K에 대한 이 알고리즘의 성능을 평가하기
// 제출 : 자바소스, 표지 포함 N,K변화한 것에 대한 그래프 결과, 알고리즘 성능평가 및 이유


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// N 입력받기
		System.out.print("N을 입력하세요 : ");
		int N = sc.nextInt();
		
		// 현재 시간 기록 1
		long t1 = System.currentTimeMillis();
		
		// N개의 데이터 랜덤으로 생성
		Random random = new Random();
		int[] array = new int[N];
		for(int i=0; i<array.length; i++) {
			int r = random.nextInt(100) + 1; // 1~100 랜덤으로 데이터 생성
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
			System.out.print(array[i] + " ");
		}
		
		System.out.println("");
		
		// 실행한 후의 현재 시간 기록 1
		long f1 = System.currentTimeMillis();
		
		// K 입력받기
		System.out.print("K를 입력하세요 : ");
		int K = sc.nextInt();
		
		// 현재 시간 기록 2
		long t2 = System.currentTimeMillis();
		
		// K개의 구간을 랜덤으로 생성
		int from = 0;
		int to = 0;
		
		for(int i=0; i<K; i++) {
			from = random.nextInt(N) + 1; 	// 1~N 랜덤
			to = random.nextInt(N-from+1) + from;	// from~N 랜덤

			// 각 구간별로 최소값, 최대값, 합계를 기존의 방식을 이용해서 구하기
			System.out.println(from + " ~ " + to + " 구간");

			Arrays.sort(array, from-1, to);
			System.out.println(" 최소값 : " + array[from-1]);
			System.out.println(" 최대값 : " + array[to-1]);
			
			int sum = 0;
			for(int q=from-1; q<to; q++) {
				sum += array[q];
			}			
			System.out.println(" 합계 : " + sum);
			
		}
		
		// 실행한 후의 현재 시간 기록 2
		long f2 = System.currentTimeMillis();
		
		// 경과시간
		System.out.println("Elapsed time is " + ((f1-t1)+(f2-t2)) + "ms.");
		
	}

}
