package practice;

public class AccountTransfer {

	public static void main(String[] args) {

		Account1 A = new Account1("123-45", 10000);
		Account1 B = new Account1("678-10", 10000);
		
		boolean result = true;
		while(result) {
			result = A.transfer(B, 3000);
		}
		System.out.println("A계좌 잔액 : "+A.balance +"원");
		System.out.println("B계좌 잔액 : "+B.balance +"원");
	}

}
class Account1{
	String num; //계좌번호
	int balance; // 잔액
	
	public Account1(String n, int i) {
		num = n;
		balance = i;
	}
	
	public boolean transfer(Account1 target, int amount) {
		if(balance < amount) {
			return false;
		}else {
			balance -= amount;
			target.balance += amount;
			return true;
		}
	}
}