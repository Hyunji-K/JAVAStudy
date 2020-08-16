package practice;

public class LockTest { //private를 set을 이용해 변경

	public static void main(String[] args) {

		Lock lock = new Lock("123!@#");
		
		lock.setPassword("456!@#");
		
		System.out.println(lock.toString());
		
	}

}

class Lock{
	private String password;
	
	public Lock(String p) {
		password = p;
	}
	
	public String toString() {
		return String.format("Lock { password: %s }", password);
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
