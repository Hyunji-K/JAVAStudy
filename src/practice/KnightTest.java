package practice;

public class KnightTest {

	public static void main(String[] args) {
		Knight one = new Knight("돈키호테", 30);
		
		System.out.println("[객체 생성]");
		System.out.println("Knight { name: " + one.getName()+", hp: "+ one.getHp()+" }");
		
		one.setHp(60);
		System.out.println("[체력 증가 +30]");
		System.out.println("Knight { name: " + one.getName()+", hp: "+ one.getHp()+" }");
	}

}

class Knight{
	
	private String name;
	private int hp;
	
	public Knight(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}