package practice;

public class DrinkTest {

	public static void main(String[] args) {
		//default constructor로 객체 만들기
		Drink a = new Drink();
		a.name = "포카리";
		a.price = 1000;
		
		Drink b = new Drink("박카스", 800);
		
		System.out.println(a.toStr());
		System.out.println(b.toStr());
	}

}

class Drink{
	//field
	String name;
	int price;
	
	//default constructor
	Drink() {
	}
	//constructor
	Drink(String n, int p){
		name = n;
		price = p;
	}
	//mehtod
	String toStr() {
		return String.format("Drink { name: %s,  price: %d원 }", name, price);
	}
}