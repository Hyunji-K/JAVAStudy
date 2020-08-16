package practice;

import java.util.Random;

public class DieTest {  //주사위 A와 B를 동시에 100회 던진 결과의 합

	public static void main(String[] args) {

		  	int[] arr = new int[100];
		  	
		for(int i=0; i < arr.length; i++) {
			int a = DieA.roll();
			int b = DieB.roll();
			arr[i] = a+b;
			System.out.print((i+1) + "번째 던진 합 =>  "  );
			for(int s =0; s < arr[i]; s++) {
				System.out.print("#");
			}	
			System.out.println();
		}
	}

}
class DieA{
	public static int roll() {
		double r = Math.random()*6;
		int r1 = (int)r+1;
		return r1;
	}
}
class DieB{
	public static int roll() {
		int n = 6;
		Random random = new Random();
		int r = random.nextInt(n) +1;
		return r;
	}
}