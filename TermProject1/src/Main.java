import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

// 01. �� ������Ʈ �������� �ּҰ� �ִ밪 �հ� ���ϱ�
// ������� : 11�� 10��
// N�� ���� a, b�� �Է¹ް�, ����� ���� ���α׷��� �ۼ�
//  - n���� �����͸� �����Լ��� ����
//  - a, b������ �ּҰ� �ִ밪 �հ踦 ���ؼ� ���
// �������� : �ڹټҽ�


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// n���� ������ ����(��������)
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ������ ���� n�� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		Random random = new Random();
		
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			int r = random.nextInt(10) + 1; // 1~10���� �������� ������ ����
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
		
		// a, b���� �Է�
		System.out.println("������ �Է��ϼ���");
		System.out.print(" - index[a] : ");
		int a = sc.nextInt();
		System.out.print(" - index[b] : ");
		int b = sc.nextInt();
		
		
		Arrays.sort(array,a,b+1);
		System.out.println("* index[a]~index[b] ������ �ּҰ� : " + array[a] + ", �ִ밪 : " + array[b]);
		
		int sum=0;
		for(int i=a; i<b+1; i++) {
			sum+=array[i];
		}
		System.out.println("* index[a]~index[b] ������ �հ� : " + sum);
		
	}

}
