package practice;

public class MethodScope { //메소드 스코프 vs  클래스 스코프

	public static void main(String[] args) {

		int score = 88;
		System.out.printf("score = %d in main() \n", score);
		
		Record.foo(score);
		
		System.out.printf("score = %d in main() \n", score);
	}

}

class Record{
	
	public static void foo(int score) {
		score -= 10;
		System.out.printf("score = %d in foo() \n", score);
	}
}