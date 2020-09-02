package inheritance;

public class FoodMain {

	public static void main(String[] args) {

		
		ChinaFood chinaFood = new ChinaFood();
		
		GlobalFood globalFood = new GlobalFood();
		//GlobalFood는 외부class(KoreaFood,ChinaFood)에 의존하고 있다
		//객체를 생성하고 필요한 곳에 넣어줌. = 의존 객체
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