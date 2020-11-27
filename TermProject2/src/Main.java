import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

// 02. ��������Ʈ ������ ������ �־����� �� ����
// ������� : 11�� 27��
// 1) N�� K�� �Է¹���
//  - N���� �����͸� �������� ����
//  - K���� ������ �������� ����
//	- �� �������� �ּҰ�, �ִ밪, �հ踦 ������ ����� �̿��ؼ� ���ϱ�
// 2) K�� �����ϰ� N�� ��ȭ��Ű�鼭 �׷��� �׸���
// 3) N�� �����ϰ� K�� ��ȭ��Ű�鼭 �׷��� �׸���
// 4) ���� N, K�� ���� �� �˰����� ������ ���ϱ�
// ���� : �ڹټҽ�, ǥ�� ���� N,K��ȭ�� �Ϳ� ���� �׷��� ���, �˰��� ������ �� ����


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// N �Է¹ޱ�
		System.out.print("N�� �Է��ϼ��� : ");
		int N = sc.nextInt();
		
		// ���� �ð� ��� 1
		long t1 = System.currentTimeMillis();
		
		// N���� ������ �������� ����
		Random random = new Random();
		int[] array = new int[N];
		for(int i=0; i<array.length; i++) {
			int r = random.nextInt(100) + 1; // 1~100 �������� ������ ����
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
		
		// ������ ���� ���� �ð� ��� 1
		long f1 = System.currentTimeMillis();
		
		// K �Է¹ޱ�
		System.out.print("K�� �Է��ϼ��� : ");
		int K = sc.nextInt();
		
		// ���� �ð� ��� 2
		long t2 = System.currentTimeMillis();
		
		// K���� ������ �������� ����
		int from = 0;
		int to = 0;
		
		for(int i=0; i<K; i++) {
			from = random.nextInt(N) + 1; 	// 1~N ����
			to = random.nextInt(N-from+1) + from;	// from~N ����

			// �� �������� �ּҰ�, �ִ밪, �հ踦 ������ ����� �̿��ؼ� ���ϱ�
			System.out.println(from + " ~ " + to + " ����");

			Arrays.sort(array, from-1, to);
			System.out.println(" �ּҰ� : " + array[from-1]);
			System.out.println(" �ִ밪 : " + array[to-1]);
			
			int sum = 0;
			for(int q=from-1; q<to; q++) {
				sum += array[q];
			}			
			System.out.println(" �հ� : " + sum);
			
		}
		
		// ������ ���� ���� �ð� ��� 2
		long f2 = System.currentTimeMillis();
		
		// ����ð�
		System.out.println("Elapsed time is " + ((f1-t1)+(f2-t2)) + "ms.");
		
	}

}
