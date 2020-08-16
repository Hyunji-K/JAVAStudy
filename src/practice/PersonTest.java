package practice;

public class PersonTest { //private를 get을 이용해 출력

	public static void main(String[] args) {

		Person park = new Person("홍팍", "010-123-4567");
		
		System.out.println("이 름 :  " + park.getName());
		System.out.println("연락처:  " + park.getPhoneNumber());
	}

}

class Person{
	private String name;
	private String phoneNumber;
	
	public Person(String n, String p) {
		name = n;
		phoneNumber = p;
	}
	
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
}