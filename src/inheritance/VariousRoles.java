package inheritance;

public class VariousRoles {

	public static void main(String[] args) {
		    HongPark park = new HongPark();

		    // �� �������� ����
		    Developer devPark = park;
		    Instructor instPark = park;
		    Masseur masPark = park;
		    
		    /* 3. ������ �޼ҵ带 ȣ���Ͽ� �ڵ带 �ϼ��ϼ���. */
		    devPark.programming("JAVA");
		    instPark.teach("�ڷᱸ��");
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
		private String name = "ȫ��";

		@Override
		public void massage() {
			System.out.println(name+" -> ������ ��!");
		}

		@Override
		public void teach(String subject) {
			System.out.println(name+" -> "+subject+" ���� ��!");
		}

		@Override
		public void programming(String lang) {
			System.out.println(name+" -> "+lang+" ���α׷��� ��!");
		}
	}