package practice;

public class TwoPointTest {

	public static void main(String[] args) {

		Point p1 = new Point(0, 0);
		Point p2 = new Point(3, 4);
		
		double dist = Point.distance(p1, p2);
		
		System.out.printf("두 점 A%s, B%s 사이의 거리: %.2f", p1.toStr(), p2.toStr(), dist);
	}
}

class Point{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String toStr() {
		return String.format("(%d, %d)", x, y);
	}
	
	static double distance(Point a, Point b) {
		double distance = Math.sqrt(Math.pow(a.x- b.x,2) + Math.pow(a.y - b.y, 2));
		return distance;
	}
	
}