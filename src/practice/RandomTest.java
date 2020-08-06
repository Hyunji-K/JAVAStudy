package practice;

import java.lang.Math;
import java.util.Random;

public class RandomTest {

	public static void main(String[] args) {
		int a = DiceA.roll();
		int b = DiceB.roll();
		
		System.out.println("A 주사위 : " + a);
		System.out.println("B 주사위 : " + b);
	}

}

 class DiceA { // Math 클래스 활용
	public static int roll() {
		double r = Math.random()*6; // 0 <= Math.random() < 1
		int  r1 = (int)r;
		return r1 +1;
	}
}

class DiceB { // Random 클래스 활용
	public static int roll() {
		int n =6;
		Random random = new Random();
		int r = random.nextInt(n); // 0 ~ n-1
		return r +1;
	}
}