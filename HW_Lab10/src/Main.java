// <HW> 히스토그램에서 최대 직사각형 넓이 구하기
// LabDatabase Lab10 문제 풀기

import java.util.Scanner;

public class Main {
	
	//	분할정복을 위한 함수
	//	배열 v에서 범위 (a, b) 구간에서 최대 크기의 직사각형 넓이 반환
	static int histo(int[] v, int a, int b) {
		
		if(a==b) {
			return v[a];
		}
		int c = (a+b)/2;
		
		/*
		int r=2;
		int min = (v[c]<v[c+1])?v[c]:v[c+1];
		int max = min*r;
		*/

		int max = Math.max(histo(v,a,c), histo(v,c+1,b));
		
		int i = c-1;
		int j = c+2;
		
		int h = Math.min(v[c], v[c+1]);
		
		while(i>=a && j<=b) {
			if(v[i] >= v[j]) {
				h = Math.min(v[i], h);
				i--;
			} else {
				h = Math.min(v[j], h);
				j++;
			}
		}
		
		max = Math.max(max, h*(j-i-1));
		
		while(i>=a) {
			h = Math.min(v[i], h);
			i--;
		}
		while(j<=b) {
			h = Math.min(v[j], h);
			j++;
		}
		
		int k = h*(b-a+1);
		max = Math.max(max, k);
		return max;
	}
	
	//	히스토그램에서 최대의 직사각형 넓이를 계산해서 출력하는 함수
	//	v : 히스토그램의 샘플들의 도수들의 배열 (0 이상의 자연수)
	//	n : 샘플의 갯수
	static int histo(int[] v, int n) {
		//	v[0..n-1] 구간의 넓이를 구해서 그 값을 반환합니다.
		return histo(v, 0, n-1);
	}
	
	public static void main(String[] args) {
		//	입력을 위해서 스캐너 오브젝트 생성
		Scanner scan = new Scanner(System.in);
		//	샘플 갯수 N을 입력
		int n = scan.nextInt();
		//	n개의 공간을 갖는 배열을 생성
		int[] v = new int[n];
		//	n개의 배열 공간에 입력된 값을 넣는다.
		for(int i = 0; i < n; i++) {
			v[i] = scan.nextInt();
		}
		//	histo() 함수를 호출해서 그 결과 저장
		int r = histo(v, n);
		//	결과 출력
		System.out.println(r);
	}
}