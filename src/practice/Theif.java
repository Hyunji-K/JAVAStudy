package practice;

public class Theif {

	public static void main(String[] args) {

		Wallet wallet = new Wallet(30000);
		System.out.print(wallet.toString());

		Theif.steal(wallet);
		System.out.println(" -> " + wallet.toString());
	}
	
	public static void steal(Wallet target) {
	// money가 private이기 때문에 바꾸지 못함.
	//	target.money = 0;  
	}
}

class Wallet{
	private int money;
		
	public int getMoney() {
		return money;
	}

	public Wallet(int i) {
		money = i;
	}
	
	public String toString() {
		return String.format("Wallet { money: %d }", money);
	}
}