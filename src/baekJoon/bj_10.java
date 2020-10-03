package baekJoon;

import java.util.Scanner;

public class bj_10 {
	static int length = 64;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int cnt = 0; //막대 개수
		
		while(x>0) {
			if(x<length) {
				length = length/2;
			} else {
				cnt++;
				x = x-length;
			}
		}
		System.out.println(cnt);
	}

}
