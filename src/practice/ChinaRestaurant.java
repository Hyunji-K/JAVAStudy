package practice;

public class ChinaRestaurant {

	public static void main(String[] args) {

		Menu jjajang = new Menu("짜장", 5000);
		Menu jjambbong = new Menu("짬뽕", 6000);
		Menu tangsook = new Menu("탕수육", 13500);
		
		Menu[] menuArr = { jjajang, jjambbong, tangsook };
		Order order = new Order(1, menuArr);
		
		System.out.println("주문 합계 : " + order.totalPrice()+"원");
		
		Menu[] arr2 = {jjajang, jjambbong};
		Order order2 = new Order(2, arr2);
		
		System.out.println("주문 합계 : " + order2.totalPrice()+"원");
	}

}
class Order{
	int orderNum;
	Menu[] menus;
	
	public Order(int i, Menu[] arr) {
		orderNum = i;
		menus = arr;
	}
	
	public int totalPrice() {
		int total =0;
		for(Menu a: menus) {
			total += a.price;
		}
		return total;
	}
}
class Menu{
	String name;
	int price;
	
	public Menu(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
}