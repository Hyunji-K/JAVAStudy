package baekJoon;

import java.util.Scanner;

public class bj_12 {
 //2161번
	public static void main(String[] args) {
		int[] res; // 버리는 카드를 받는 배열
		Scanner scanner = new Scanner(System.in);
		// N장의 카드 입력받기
		int n = scanner.nextInt(); 
		//입력받아 card 배열에 넣기
		int[] card = new int[n] ;
		for(int i=0; i<card.length; i++) {
			card[i] = i+1;
		}
		//[0]을 버리고 [1]을 맨 밑으로 [2]를 버린다. [3]을 맨 밑으로
		//card 한 개 남을 때 까지
		//버린 카드들 순서대로 출력->남은 card 출력
	}
}
