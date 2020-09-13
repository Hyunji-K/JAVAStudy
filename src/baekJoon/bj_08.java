package baekJoon;

import java.util.Scanner;

public class bj_08 {
	static int n;
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		Quadrant(x,y);
		System.out.println("점 (x,y)는 제"+n+"사분면에 속합니다.");
		
	}

	public static void Quadrant(int x, int y) {
		if(x>0) {
			if(y>0) {
				n=1;
			} else {
				n=4;
			}
		} else {
			if(y>0) {
				n=2;
			} else {
				n=3;
			}
		}
	}
}