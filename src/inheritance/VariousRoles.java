package inheritance;

public class VariousRoles {

	public static void main(String[] args) {
		    HongPark park = new HongPark();

		    // 각 직업으로 변신
		    Developer devPark = park;
		    Instructor instPark = park;
		    Masseur masPark = park;
		    
		    /* 3. 직업별 메소드를 호출하여 코드를 완성하세요. */
		    devPark.programming("JAVA");
		    instPark.teach("자료구조");
		    masPark.massage();
		  }
		}

		interface Developer {
		  public void programming(String lang);
		}

		interface Instructor {
		  public void teach(String subject);
		}

		interface Masseur {
		  public void massage();
		}

	class HongPark implements Developer, Instructor, Masseur{
		private String name = "홍팍";

		@Override
		public void massage() {
			System.out.println(name+" -> 마사지 중!");
		}

		@Override
		public void teach(String subject) {
			System.out.println(name+" -> "+subject+" 수업 중!");
		}

		@Override
		public void programming(String lang) {
			System.out.println(name+" -> "+lang+" 프로그래밍 중!");
		}
	}