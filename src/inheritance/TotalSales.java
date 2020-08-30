package inheritance;

import java.util.ArrayList;

public class TotalSales {
  public static void main(String[] args) {

	  Menu bab = new Menu("±è¹ä",2000,57);
	  Menu don = new Menu("µ·±î½º",6000,29);
	  Menu cold = new Menu("³Ã¸é",5000,34);

	  Store totalSales = new Store();
	  totalSales.add(bab);
	  totalSales.add(don);
	  totalSales.add(cold);
	  
	  System.out.println("ÃÑ ¸ÅÃâ: "+totalSales.totalSales()+"¿ø");
  }
}

class Store {
  private ArrayList<Menu> list;
  
  public Store() {
    this.list = new ArrayList<Menu>();
  }
  
  public void add(Menu menu) {
    list.add(menu);
  }
  
  public int totalSales() {
	  int sum=0;
	  for(int i=0; i<list.size();i++) {
		  sum += list.get(i).getPrice()*list.get(i).getCount();
	  }
    return sum;
  }
}

class Menu {
  private String name; // ¸Þ´º¸í
  private int price;   // °¡°Ý
  private int count;   // ÇÏ·ç ÆÇ¸Å·®
  
  public Menu(String name, int price, int count) {
    this.name = name;
    this.price = price;
    this.count = count;
  }

public String getName() {
	return name;
}

public int getPrice() {
	return price;
}

public int getCount() {
	return count;
}
  
}