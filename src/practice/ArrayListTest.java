package practice;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Kim");
		list.add("Song");
		list.add("Na");
		
		for(String name :  list) {
			System.out.println(name);
		}
		System.out.println(list.size());
		
		String two = list.get(2);
		System.out.print(two);
	}

}
