package baekJoon;

import java.util.Scanner;

public class bj_11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String str = scanner.next();
			if(str.equals("0")) {
				break;
			}
			StringBuffer sb = new StringBuffer();
			sb.append(str).reverse();
			if(str.equals(sb.toString())) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

}
