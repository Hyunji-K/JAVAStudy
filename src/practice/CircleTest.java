package practice;

public class CircleTest {

	public static void main(String[] args) {
		
		Circle c1 = new Circle(0, 0, 3);
		Circle c2 = new Circle(2, 3, 4);
		
		double area1 = Circle.area(c1);
		double area2 = Circle.area(c2);
		
		System.out.printf("%s => 넓이: %.2f\n", c1.toStr(), area1);
		System.out.printf("%s => 넓이: %.2f\n", c2.toStr(), area2);
	}

}

class Circle {
	int x; //원의 중심 x좌표
	int y; //원의 중심 y좌표
	int r; // 반지름
	
	Circle(int centerX, int centerY, int radius){
		x = centerX;
		y = centerY;
		r = radius;
	}
	//인스턴스 메소드(주체 객체를 생성해야 메소드 호출 가능)
	String toStr() {
		return String.format("Circle { 중심 : (%d, %d, 반지름: %d}", x, y, r);
	}
	//원의 넓이 구하는 클래스 메소드(클래스가 동작시키는 메소드)
	static double area(Circle c) {
		return Math.PI * c.r * c.r;
	}
}