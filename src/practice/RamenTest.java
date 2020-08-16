package practice;

import java.util.ArrayList;

public class RamenTest {

	public static void main(String[] args) {

		int total = 0;
		ArrayList<Ramen> ramen = new ArrayList<Ramen>();
		Ramen sin = new Ramen("신라면", 1000);
		Ramen jin = new Ramen("진라면", 1200);
		Ramen bibim = new Ramen("비빔면", 800);
		
		ramen.add(sin);
		ramen.add(jin);
		ramen.add(bibim);
		
		for(Ramen a : ramen) {
			System.out.println(a);
		}
		
		System.out.println("총 "+ramen.size()+ "개");
		
		for(int i=0; i <ramen.size(); i++) {
			total += ramen.get(i).getPrice();
		}
		System.out.print("총 합계: " + total);
	}

}
class Ramen{
	private String name;
	private int price;
	
	public Ramen(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public String toString() {
		return String.format("Ramen { name:  %s,  price:  %d }", name, price);
	}
}