package baekJoon;

import java.util.Scanner;
import java.util.Stack;

public class bj_06 {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		Scanner scanner = new Scanner(System.in);
		int N =scanner.nextInt();
		
		for(int i=0; i<N; i++) {
			String string = scanner.next();
			String num[] = string.split(" ");
			
			switch(num [0]) {
			case "push" :
				stack.push(Integer.parseInt(num[1]));
				break;
			case "pop" :
				if(stack.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.pop());
				}
				break;
			case "size" :
				System.out.println(stack.size());
				break;
			case "empty" :
				if(stack.isEmpty()) {
					System.out.println(1);
				}
				else {
					System.out.println(0);
				}
				break;
			case "top" :
				if(stack.isEmpty()) {
					System.out.println(-1);
				}
				else {
					System.out.println(stack.peek());
				}
				break;
			}
		}
	}

}
