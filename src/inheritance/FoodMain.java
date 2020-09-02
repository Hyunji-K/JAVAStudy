package inheritance;

public class FoodMain {

	public static void main(String[] args) {

		
		ChinaFood chinaFood = new ChinaFood();
		
		GlobalFood globalFood = new GlobalFood();
		//GlobalFood�� �ܺ�class(KoreaFood,ChinaFood)�� �����ϰ� �ִ�
		//��ü�� �����ϰ� �ʿ��� ���� �־���. = ���� ��ü
		globalFood.makeFood(new KoreaFood());
		globalFood.makeFood(chinaFood);
	}

}

class GlobalFood{
	
	public GlobalFood() {
		System.out.println("--- GlobalFood() Construct ---");
	}
	
	public void makeFood(IFood food) {
		System.out.println("--- makeFood() START ---");
		food.makeFood();
	}
}

class KoreaFood implements IFood{

	@Override
	public void makeFood() {
		System.out.println("make KoreaFood!");
	}
	
}
class ChinaFood implements IFood{

	@Override
	public void makeFood() {
		System.out.println("make ChinaFood!");		
	}
	
}