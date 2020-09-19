package baekJoon;

import java.util.Scanner;

public class bj_09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] str = new String[n];
		boolean out = false; // true면 ? 출력
		for(int i=0; i<n; i++) { //n개의 이름 입력받기
			str[i] = scanner.next();
		}
		//비교하기
		for(int i=0; i<str[0].length(); i++) { //글자 수
			for(int j=0; j<n-1; j++) { //행
				if(str[j].charAt(i)!=str[j+1].charAt(i)) {
					out = true;
					break;
				}
			}
			if(out)
				System.out.print("?");
			else
				System.out.print(str[0].charAt(i));
		}
	}

}
