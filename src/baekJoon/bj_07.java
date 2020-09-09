package baekJoon;

import java.util.Scanner;

public class bj_07 {
	static int n;
	static int m;
	static int list[], check[];
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		n =scanner.nextInt();
		m = scanner.nextInt();
		check = new int[9];
		list = new int [9];
		dfs(0,0);
		
	}

	public static void dfs(int index, int cnt) {
		if(cnt == m) {
			for(int i=0; i<m; i++) {
				System.out.print(list[i]+" ");
			}
			System.out.println();
			return;
		}
		for(int i=index+1;i<=n; i++) {
			if(check[i]==1) continue;
			check[i]=1;
			list[cnt]=i;
			dfs(i, cnt+1);
			check[i]=0;
		}
	}
}
