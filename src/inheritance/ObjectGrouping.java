package inheritance;

public class ObjectGrouping {
	  public static void main(String[] args) {

		Bird bird = new Bird();
	    Helicopter copter = new Helicopter();
	    Rocket rocket = new Rocket();
	    //�������̽� Ÿ������ �׷�ȭ
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
			System.out.println("<��>�� ���ư��ϴ�.");
		}
	}

	class Helicopter implements Flyable {

		@Override
		public void fly() {
			System.out.println("<���>�� ���ư��ϴ�.");
		}
	}

	class Rocket implements Flyable {

		@Override
		public void fly() {
			System.out.println("<����>�� ���ư��ϴ�.");
		}
	}
