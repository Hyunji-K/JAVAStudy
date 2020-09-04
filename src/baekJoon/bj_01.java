package baekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class bj_01 {

	public static void main(String[] args) {

			
			Scanner scanner = new Scanner(System.in);
			int[] num = new int[3];
			for(int i=0; i<3; i++) {
				num[i] =  scanner.nextInt();
			}
			Arrays.sort(num);
			System.out.println(num[1]);
		
	}

}
