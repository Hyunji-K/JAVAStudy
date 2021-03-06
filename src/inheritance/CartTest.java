package inheritance;

import java.util.ArrayList;

public class CartTest {
		  public static void main(String[] args) {
		    /* 1. 구매 상품 객체를 생성하세요. */
		    Item shirt = new Item("shirt",49900);
		    Item pants = new Item("pants",58900);
		    Item shoes = new Item("shoes",46900);
		    /* 2. 장바구니에 상품을 담으세요. */
		    Cart myCart = new Cart();
		    myCart.add(shirt);
		    myCart.add(pants);
		    myCart.add(shoes);
		    
		    // 총합 출력
		    System.out.printf("총합: %d원", myCart.totalPrice());
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
		  
		  /* 3. 장바구니 총합 메소드를 완성하세요. */
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