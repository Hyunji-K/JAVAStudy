package inheritance;

public class Machine {

public static void main(String[] args) {
		Juice j = new Juice();
		Coffee c = new Coffee();
		Beer b = new Beer();
		Water w = new Water();
		Tea t = new Tea();
		
		Drinks drinks[] = { j, c, b, w, t };
		
		for(Drinks d : drinks) {
			d.ordered();
		}
	}
}
class Drinks {
	 String name;
	 double price;
	 public void ordered() {
		 System.out.println("�ֹ��Ǿ����ϴ�.");
	 }
}
	
class Juice extends Drinks{
	 
	}

class Coffee extends Drinks{
	 
	}

class Beer extends Drinks{
	 
	}

class Water extends Drinks {
	
	}

class Tea extends Drinks{
	 
	}