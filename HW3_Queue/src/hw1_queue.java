/* ���� 1
  ������ ���ð� ť�� �̿��ؼ� ���ڵ��� �����ϴ� ���� �������� �մϴ�.
  ������ ���� �˰������� ���ڵ� �����ϴ� ���� �����մϴ�.
	a) ť�� ������ �����մϴ�.
	b) ���� n�� �Է¹޽��ϴ�.
	c) ť�� n���� ������ ���ڵ��� �ֽ��ϴ�. ������ ���ڴ� 0~10000 ������ �մϴ�.
	d) ť���� ���� �ϳ��� �����ϴ�.
	e) ���� �ֻ��� ���ڰ� ť���� ���� ���ں��� ���� ���, ���ÿ��� ���ڸ� ���� ť�� �ֽ��ϴ�.
	f) ������ ����ְų� ���� �ֻ��� ���ڰ� ť���� ���� ���ں��� Ŭ������ e)�� �ݺ��մϴ�.
	g) ���ÿ� ť���� ���� ���ڸ� �ӽ��ϴ�.
	h) ť�� ������� �ʴٸ� d)�� ���� ������ ����մϴ�.
	i) ���ÿ� �ִ� �����͸� �ϳ��� �����鼭 �����͸� ����մϴ�.
*/

import java.util.*;

public class hw1_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// ť ����
		Queue <Integer> queue = new LinkedList<>();
		
		// ���� ����
		Stack <Integer> stack = new Stack <>();
		
		// ���� n �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ ���� n�� �Է��ϼ��� : ");
		int n = sc.nextInt();
		
		// n���� ������ ����(0~10000) �����ϰ� ť�� �ֱ�
		Random random = new Random();
		
		int[] array = new int[n];
		for(int i=0; i<array.length; i++) {
			int r = random.nextInt(10000) + 1; // 1~10���� �������� ������ ����
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
		
		// ť���� ���� �ϳ� ������
		
		
		
	}

}
