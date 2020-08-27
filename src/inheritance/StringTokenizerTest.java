package inheritance;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		String str ="ġŲ,����,����,����,�ʹ�,������,������";
		String delim = ",";
		//��ũ������ ��ü ����
		StringTokenizer st = new StringTokenizer(str, delim);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
