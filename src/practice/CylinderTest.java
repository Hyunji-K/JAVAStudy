package practice;

public class CylinderTest {

	public static void main(String[] args) {

		Cylinder c = new Cylinder();
		c.radius = 4;
		c.height = 5;
		
		System.out.println(c.getVolume());
		System.out.println(c.getArea());
	}

}
class Cylinder{
	int radius;
	int height;
	
	public double getVolume() {
		return radius * radius * 3.14;
	}
	
	public double getArea() {
		return 2*(radius*radius)*3.14 + 2*radius*height*3.14;
	}
}