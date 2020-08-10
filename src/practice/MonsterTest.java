package practice;

import java.util.ArrayList;

public class MonsterTest {

	public static void main(String[] args) {
		
		ArrayList<Monster> list = new ArrayList<Monster>();

		Monster slime = new Monster("슬라임", 1);
		Monster orc = new Monster("오크", 3);
		Monster golem = new Monster("골렘", 8);
		
		list.add(slime);
		list.add(orc);
		list.add(golem);
		
		System.out.println("===변경 전===");
		for(Monster i : list) {
			System.out.println(i);
		}
		
		Monster rabbit = new Monster("토끼", 21);
		
		list.set(0, rabbit);
		System.out.println("===변경 후===");
		for(Monster i : list) {
			System.out.println(i);
		}
	}

}
class  Monster{
	private String name;
	private int level;
	
	public Monster(String name, int level) {
		this.name = name;
		this.level = level;
	}
	
	public String toString() {
		return String.format("Monster { name:  %s,   level:  %d }", name, level);
	}
}