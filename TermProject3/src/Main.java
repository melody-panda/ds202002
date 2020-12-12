// TermProject3 ** 기존 알고리즘보다 개선하기 **
// 퀵 정렬

import java.io.*;
import java.util.*;

public class Main {
	static int N;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N을 입력하세요 : ");
		N = sc.nextInt();

		// 현재 시간 기록 1
		long t1 = System.currentTimeMillis();
		
		Random random = new Random();
		int[] array = new int[N];
		for(int i=0; i<array.length; i++) {
			int r = random.nextInt(N) + 1; // 1~N 랜덤으로 데이터 생성
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
		
		System.out.print("K를 입력하세요 : ");
		int K = sc.nextInt();
		
		// 현재 시간 기록 2
		long t2 = System.currentTimeMillis();
		
		int from = 0;
		int to = 0;
		
		for(int i=0; i<K; i++) {
			from = random.nextInt(N) + 1; 	// 1~N 랜덤
			to = random.nextInt(N-from+1) + from;	// from~N 랜덤

			// 각 구간별로 최소값, 최대값, 합계를 기존의 방식을 이용해서 구하기
			System.out.println(from + " ~ " + to + " 구간");

			int sum = 0;
			for(int q=(from-1); q<=(to-1); q++) {
				sum += array[q];
			}
	
		quickSort(array, from-1, to-1);
		
		System.out.println("정렬 결과"); // 정렬 결과 출력
		for (int p=(from-1); p<=(to-1); p++)
			System.out.print(array[p] + " ");
		
		System.out.println();
		System.out.println(" 최소값 : " + array[from-1]);
		System.out.println(" 최대값 : " + array[to-1]);		
		System.out.println(" 합계 : " + sum);

	}

		sc.close();
		
		// 실행한 후의 현재 시간 기록 2
		long f2 = System.currentTimeMillis();
		
		// 경과시간
		System.out.println("Elapsed time is " + ((f1-t1)+(f2-t2)) + "ms.");
		
	}
	
	static void quickSort(int[] list, int left, int right) 
	{
		int pivot, i, j, temp;

		if (left < right) 
		{
			i = left;
			j = right;
			pivot = list[left];

			while (i < j) 
			{
				while (list[j] > pivot)
					j--;
				while (i < j && list[i] <= pivot)
					i++;

				temp = list[i];
				list[i] = list[j];
				list[j] = temp;
			}
			
			list[left] = list[j];
			list[j] = pivot;

			quickSort(list, left, j - 1);
			quickSort(list, j + 1, right);
			
		}
	}
}
