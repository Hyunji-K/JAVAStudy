package inheritance;

import java.util.ArrayList;

public class CartTest {
		  public static void main(String[] args) {
		    /* 1. ���� ��ǰ ��ü�� �����ϼ���. */
		    Item shirt = new Item("shirt",49900);
		    Item pants = new Item("pants",58900);
		    Item shoes = new Item("shoes",46900);
		    /* 2. ��ٱ��Ͽ� ��ǰ�� ��������. */
		    Cart myCart = new Cart();
		    myCart.add(shirt);
		    myCart.add(pants);
		    myCart.add(shoes);
		    
		    // ���� ���
		    System.out.printf("����: %d��", myCart.totalPrice());
		  }
		}

		class Cart {
		  private ArrayList<Item> list;
		  
		  public Cart() {
		    this.list = new ArrayList<Item>();
		  }
		  
		  public void add(Item item) {
		    list.add(item);
		  }
		  
		  /* 3. ��ٱ��� ���� �޼ҵ带 �ϼ��ϼ���. */
		  public int totalPrice() {
		    int sum = 0;
		    for(int i=0; i<list.size();i++) {
		    	sum += list.get(i).getPrice();
		    }
		    return sum;
		  }
		}

		class Item {
		  private String name;
		  private int price;
		  
		  public Item(String name, int price) {
		    this.name = name;
		    this.price = price;
		  }

		  public int getPrice() {
		    return price;
		  }  
		}