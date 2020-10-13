package baekJoon;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj_12 {
 //2161번
	public static void main(String[] args) {
		int[] res; // 버리는 카드를 받는 배열
		Scanner scanner = new Scanner(System.in);
		// N장의 카드 입력받기
		int n = scanner.nextInt(); 
		//FIFO인 Queue사용, Queue의 인터페이스 구현체인 LinkedList 사용
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}
		//[0]을 버리고 [1]을 맨 밑으로 [2]를 버린다. [3]을 맨 밑으로
		//card 한 개 남을 때 까지
		//버린 카드들 순서대로 출력->남은 card 출력
		while(!queue.isEmpty()) {
			int one = queue.poll(); //홀수 값 버림
			System.out.print(one+" "); //출력
			
			if(queue.isEmpty()) { // 값이 없으면 멈춤
				break;
			}
			int two = queue.poll(); //짝수 값 꺼냄
			queue.offer(two); //queue에 다시 저장
		}
	}
}
