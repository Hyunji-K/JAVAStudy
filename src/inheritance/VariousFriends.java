package inheritance;

public class VariousFriends {
	  public static void main(String[] args) {
	    // ��ü ����
	    Artist kim = new Artist("������ �达");
	    Architect lee = new Architect("���డ �̾�");
	    Devel park = new Devel("������ �ھ�");
	    Lawyer choi = new Lawyer("��ȣ�� �־�");

	    // �׷�ȭ: �������̽� ����
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
			System.out.println(string +"-> Ī�� ���̰�!");
		}
	}

	class Architect implements Friend{
		String string;
		public Architect(String string) {
			this.string = string;
		}

		@Override
		public void dearFriend() {
			System.out.println(string +"-> Ī�� ���̰�!");
			
		}

	}

	class Devel implements Friend{
		String string;
		public Devel(String string) {
			this.string = string;
		}

		@Override
		public void dearFriend() {
			System.out.println(string +"-> Ī�� ���̰�!");
			
		}
	  
	}

	class Lawyer implements Friend{
		String string;
		public Lawyer(String string) {
			this.string = string;
		}

		@Override
		public void dearFriend() {
			System.out.println(string +"-> Ī�� ���̰�!");
			
		}

	}