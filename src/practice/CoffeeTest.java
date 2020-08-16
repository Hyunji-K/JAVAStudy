package practice;

public class CoffeeTest {

	public static void main(String[] args) {

		Coffee americano = new Coffee("아메리카노", 1500);
		System.out.printf("커피값 인상 전 =>  %s\n",americano.toString());
		
		//커피 값 인상
		americano.setPrice(2000);
		System.out.printf("커피값 인상 후 =>  %s\n", americano.toString());
		
	}

}

class Coffee {
	//필드 (인스턴스 변수)
	private String name;
	private int price;
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return String.format("Coffee { name: %s,  price: %d }", name, price);
	}
}