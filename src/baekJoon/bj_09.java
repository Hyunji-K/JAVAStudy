package baekJoon;

import java.util.Scanner;

public class bj_09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] str = new String[n];
		boolean out = false; // true�� ? ���
		for(int i=0; i<n; i++) { //n���� �̸� �Է¹ޱ�
			str[i] = scanner.next();
		}
		//���ϱ�
		for(int i=0; i<str[0].length(); i++) { //���� ��
			for(int j=0; j<n-1; j++) { //��
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
