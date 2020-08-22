package inheritance;

public class ObjectGrouping {
	  public static void main(String[] args) {

		Bird bird = new Bird();
	    Helicopter copter = new Helicopter();
	    Rocket rocket = new Rocket();
	    //인터페이스 타입으로 그룹화
	    Flyable[] flyableThings = { bird, copter, rocket };
	    
	    for (int i = 0; i < flyableThings.length; i++) {
	      Flyable temp = flyableThings[i];
	      temp.fly();
	    }
	  }
	}

	interface Flyable {
	  public void fly();
	}

	class Bird implements Flyable {

		@Override
		public void fly() {
			System.out.println("<새>가 날아갑니다.");
		}
	}

	class Helicopter implements Flyable {

		@Override
		public void fly() {
			System.out.println("<헬기>가 날아갑니다.");
		}
	}

	class Rocket implements Flyable {

		@Override
		public void fly() {
			System.out.println("<로켓>이 날아갑니다.");
		}
	}
