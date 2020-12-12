// TermProject3 ** ���� �˰��򺸴� �����ϱ� **
// �� ����

import java.io.*;
import java.util.*;

public class Main {
	static int N;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("N�� �Է��ϼ��� : ");
		N = sc.nextInt();

		// ���� �ð� ��� 1
		long t1 = System.currentTimeMillis();
		
		Random random = new Random();
		int[] array = new int[N];
		for(int i=0; i<array.length; i++) {
			int r = random.nextInt(N) + 1; // 1~N �������� ������ ����
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
		
		System.out.print("K�� �Է��ϼ��� : ");
		int K = sc.nextInt();
		
		// ���� �ð� ��� 2
		long t2 = System.currentTimeMillis();
		
		int from = 0;
		int to = 0;
		
		for(int i=0; i<K; i++) {
			from = random.nextInt(N) + 1; 	// 1~N ����
			to = random.nextInt(N-from+1) + from;	// from~N ����

			// �� �������� �ּҰ�, �ִ밪, �հ踦 ������ ����� �̿��ؼ� ���ϱ�
			System.out.println(from + " ~ " + to + " ����");

			int sum = 0;
			for(int q=(from-1); q<=(to-1); q++) {
				sum += array[q];
			}
	
		quickSort(array, from-1, to-1);
		
		System.out.println("���� ���"); // ���� ��� ���
		for (int p=(from-1); p<=(to-1); p++)
			System.out.print(array[p] + " ");
		
		System.out.println();
		System.out.println(" �ּҰ� : " + array[from-1]);
		System.out.println(" �ִ밪 : " + array[to-1]);		
		System.out.println(" �հ� : " + sum);

	}

		sc.close();
		
		// ������ ���� ���� �ð� ��� 2
		long f2 = System.currentTimeMillis();
		
		// ����ð�
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
