package inheritance;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone phone = new SmartPhone("아이폰", "010-456-7852");
		phone.call("010-1234-5678");
		phone.ring();
		
	}

}
interface Phone{
	public void call(String targetNumber); // targetNumber로 전화를 건다
	
	public void ring(); //전화벨이 울린다
}

class SmartPhone implements Phone{
	protected String name;
	protected String phoneNumber;
	
	public SmartPhone(String name, String phoneNumber) {
		this.name  =  name;
		this.phoneNumber = phoneNumber;
	}

	@Override
	public void call(String targetNumber) {
		System.out.println(targetNumber + "로 전화를 겁니다.");
	}

	@Override
	public void ring() {
		System.out.println("전화벨이 울립니다.");
		
	}
	
}