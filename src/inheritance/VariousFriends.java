package inheritance;

public class VariousFriends {
	  public static void main(String[] args) {
	    // 객체 생성
	    Artist kim = new Artist("뮤지션 김씨");
	    Architect lee = new Architect("건축가 이씨");
	    Devel park = new Devel("개발자 박씨");
	    Lawyer choi = new Lawyer("변호사 최씨");

	    // 그룹화: 인터페이스 기준
	    Friend[] friends = { kim, lee, park, choi };
	    for (Friend f : friends) {
	      f.dearFriend();
	    }
	  }
	}

	interface Friend {
	
		void dearFriend();
		
	}

	class Artist implements Friend{
		String string;
		public Artist(String string) {
			this.string = string;
		}

		@Override
		public void dearFriend() {
			System.out.println(string +"-> 칭구 아이가!");
		}
	}

	class Architect implements Friend{
		String string;
		public Architect(String string) {
			this.string = string;
		}

		@Override
		public void dearFriend() {
			System.out.println(string +"-> 칭구 아이가!");
			
		}

	}

	class Devel implements Friend{
		String string;
		public Devel(String string) {
			this.string = string;
		}

		@Override
		public void dearFriend() {
			System.out.println(string +"-> 칭구 아이가!");
			
		}
	  
	}

	class Lawyer implements Friend{
		String string;
		public Lawyer(String string) {
			this.string = string;
		}

		@Override
		public void dearFriend() {
			System.out.println(string +"-> 칭구 아이가!");
			
		}

	}