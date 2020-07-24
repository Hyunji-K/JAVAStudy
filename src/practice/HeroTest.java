package practice;

public class HeroTest {
	
	public static void main(String[] args) {
		Hero ironMan = new Hero("아이언맨", 80);
		Hero thanos = new Hero("타노스", 160);
		Hero thor = new Hero("토르", 150);
		Hero groot = new Hero("그루트", 40);
		
		System.out.println(ironMan.toStr());
		System.out.println(thanos.toStr());
		System.out.println(thor.toStr());
		System.out.println(groot.toStr());
		
		thor.punch(thanos);  // 토르가 타노스에게 펀치
		System.out.println(thanos.toStr());
	}

}
class Hero {
	//field
	String name;
	int hp;
	
	//constructor
	Hero(String n, int h){
		name = n;
		hp = h;
	}
	//method
	String toStr() {
		return String.format("Hero { name: %s,  hp: %d }", name, hp);
	}
	
	void punch(Hero enemy) {
		System.out.printf("[%s]의 펀치!!",  name);
		System.out.println();
		System.out.printf("%s의 HP:  %d -> ", enemy.name, enemy.hp);
		enemy.hp -= 10; 
		System.out.println( enemy.hp);
	}
}