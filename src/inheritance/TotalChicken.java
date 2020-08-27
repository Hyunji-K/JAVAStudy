package inheritance;

import java.util.ArrayList;

public class TotalChicken {

	public static void main(String[] args) {

		ArrayList<Chicken> order = new ArrayList<Chicken>();
		
		order.add(new Chicken("·Î½ºÆ® Ä¡Å²",9900));
		order.add(new Chicken("ÆÄ´ß Ä¡Å²",12900));
		order.add(new Chicken("¸¶´Ã Ä¡Å²",13900));
		
		int sum = 0;
		
		for(int i=0; i<order.size();i++) {
			sum += order.get(i).getPrice();
		}
		
		System.out.println("ÃÑÇÕ: "+ sum+ "¿ø");
	}

}
class Chicken{
	private String name;
	private int price;
	
	public Chicken(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}