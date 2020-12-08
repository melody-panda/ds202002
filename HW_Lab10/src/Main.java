// <HW> ������׷����� �ִ� ���簢�� ���� ���ϱ�
// LabDatabase Lab10 ���� Ǯ��

import java.util.Scanner;

public class Main {
	
	//	���������� ���� �Լ�
	//	�迭 v���� ���� (a, b) �������� �ִ� ũ���� ���簢�� ���� ��ȯ
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
	
	//	������׷����� �ִ��� ���簢�� ���̸� ����ؼ� ����ϴ� �Լ�
	//	v : ������׷��� ���õ��� �������� �迭 (0 �̻��� �ڿ���)
	//	n : ������ ����
	static int histo(int[] v, int n) {
		//	v[0..n-1] ������ ���̸� ���ؼ� �� ���� ��ȯ�մϴ�.
		return histo(v, 0, n-1);
	}
	
	public static void main(String[] args) {
		//	�Է��� ���ؼ� ��ĳ�� ������Ʈ ����
		Scanner scan = new Scanner(System.in);
		//	���� ���� N�� �Է�
		int n = scan.nextInt();
		//	n���� ������ ���� �迭�� ����
		int[] v = new int[n];
		//	n���� �迭 ������ �Էµ� ���� �ִ´�.
		for(int i = 0; i < n; i++) {
			v[i] = scan.nextInt();
		}
		//	histo() �Լ��� ȣ���ؼ� �� ��� ����
		int r = histo(v, n);
		//	��� ���
		System.out.println(r);
	}
}