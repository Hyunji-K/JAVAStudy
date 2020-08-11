package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimpleLottoTest {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<46; i++) { // 45개 공 만들기
			list.add(i);
		}
		
		Collections.shuffle(list); //무작위 섞기
		
		int[] arr = new int[6];  // 앞 6개 숫자 배열에 넣기
		for(int i=0; i < 6; i++) {
			arr[i] = list.get(i);
		}
		String result = Arrays.toString(arr); //배열을 문자열로 바꾸기
		
		System.out.println("자동 생성 번호: "+ result ); //결과 출력
		
	}

}
