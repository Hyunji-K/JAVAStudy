package inheritance;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {

		String str ="Ä¡Å²,ÇÇÀÚ,º¸½Ó,Á·¹ß,ÃÊ¹ä,¶±ººÀÌ,ÅÁ¼öÀ°";
		String delim = ",";
		//ÅäÅ©³ªÀÌÀú °´Ã¼ »ı¼º
		StringTokenizer st = new StringTokenizer(str, delim);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
