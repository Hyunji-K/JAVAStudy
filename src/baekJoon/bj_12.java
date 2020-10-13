package baekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_12 {
 //2161��
	public static void main(String[] args) {
		int[] res; // ������ ī�带 �޴� �迭
		Scanner scanner = new Scanner(System.in);
		// N���� ī�� �Է¹ޱ�
		int n = scanner.nextInt(); 
		//FIFO�� Queue���, Queue�� �������̽� ����ü�� LinkedList ���
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}
		//[0]�� ������ [1]�� �� ������ [2]�� ������. [3]�� �� ������
		//card �� �� ���� �� ����
		//���� ī��� ������� ���->���� card ���
		while(!queue.isEmpty()) {
			int one = queue.poll(); //Ȧ�� �� ����
			System.out.print(one+" "); //���
			
			if(queue.isEmpty()) { // ���� ������ ����
				break;
			}
			int two = queue.poll(); //¦�� �� ����
			queue.offer(two); //queue�� �ٽ� ����
		}
	}
}
