package baekJoon;

import java.util.Scanner;
import java.util.Stack;

public class bj_02 {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int sum =0;
		int k = scanner.nextInt();
		
		for(int i=0; i<k ; i++ ) {
			int e = scanner.nextInt();
			if( e == 0 && !stack.isEmpty()) {
				stack.pop();
			} else if(e > 0) {
				stack.push(e);
			}
		}
		while(!stack.isEmpty()) {
			sum = sum + stack.pop();
		}
		
		System.out.println(sum);
	}


}
