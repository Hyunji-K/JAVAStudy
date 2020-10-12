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
		Queue queue = new LinkedList();
		for(int i=0; i<n-1; i++) {
			queue.offer(i+1);
		}
		//[0]�� ������ [1]�� �� ������ [2]�� ������. [3]�� �� ������
		//card �� �� ���� �� ����
		//���� ī��� ������� ���->���� card ���
		while(!queue.isEmpty()) {
			Object one = queue.poll(); //Ȧ�� �� ����
			System.out.println(one+" "); //���
			
			if(queue.isEmpty()) { // ���� ������ ����
				break;
			}
			Object two = queue.poll(); //¦�� �� ����
			queue.offer(two); //queue�� �ٽ� ����
		}
	}
}
