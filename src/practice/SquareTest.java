package practice;

public class SquareTest {

	public static void main(String[] args) {

		Square a= new Square();
		a.length=4;
		System.out.println("한 변의 길이가 "+a.length+"인 정사각형의 넓이는 "+a.area()+"입니다.");
	}

}

class Square{
	int length;
	
	int area(){
		return length * length;
	}
}