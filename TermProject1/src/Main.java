import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

// 01. 텀 프로젝트 구간에서 최소값 최대값 합계 구하기
// 제출기한 : 11월 10일
// N과 구간 a, b를 입력받고, 출력을 내는 프로그램을 작성
//  - n개의 데이터를 랜덤함수로 생성
//  - a, b구간의 최소값 최대값 합계를 구해서 출력
// 제출형식 : 자바소스


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// n개의 데이터 생성(랜덤으로)
		Scanner sc = new Scanner(System.in);
		System.out.print("생성할 데이터 개수 n을 입력하세요 : ");
		int n = sc.nextInt();
		
		Random random = new Random();
		
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			int r = random.nextInt(10) + 1; // 1~10까지 랜덤으로 데이터 생성
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
		
		// a, b구간 입력
		System.out.println("구간을 입력하세요");
		System.out.print(" - index[a] : ");
		int a = sc.nextInt();
		System.out.print(" - index[b] : ");
		int b = sc.nextInt();
		
		
		Arrays.sort(array,a,b+1);
		System.out.println("* index[a]~index[b] 구간의 최소값 : " + array[a] + ", 최대값 : " + array[b]);
		
		int sum=0;
		for(int i=a; i<b+1; i++) {
			sum+=array[i];
		}
		System.out.println("* index[a]~index[b] 구간의 합계 : " + sum);
		
	}

}
