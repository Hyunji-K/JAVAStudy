package baekJoon;

import java.util.Scanner;

public class bj_05 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		System.out.println(Fibonacci(N));
	}


public static int Fibonacci(int num) {
	
	if(num<=1)
		return num;
	else
		return Fibonacci(num-1)+Fibonacci(num-2); //Àç±Í
	
 }
}