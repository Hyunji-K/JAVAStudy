package inheritance;

import java.util.ArrayList;

public class TotalChicken {

	public static void main(String[] args) {

		ArrayList<Chicken> order = new ArrayList<Chicken>();
		
		order.add(new Chicken("�ν�Ʈ ġŲ",9900));
		order.add(new Chicken("�Ĵ� ġŲ",12900));
		order.add(new Chicken("���� ġŲ",13900));
		
		int sum = 0;
		
		for(int i=0; i<order.size();i++) {
			sum += order.get(i).getPrice();
		}
		
		System.out.println("����: "+ sum+ "��");
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