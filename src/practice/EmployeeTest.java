package practice;

public class EmployeeTest {

	public static void main(String[] args) {
		int[] hours1 = {2, 4, 3, 4, 5, 8, 8};
		int[] hours2 = {7, 3, 4, 3, 3, 4, 4};
		int[] hours3 = {3, 3, 4, 3, 3, 2, 2};
		int[] hours4 = {9, 3, 0, 7, 4, 5, 2};

		Employee e1 = new Employee("직원1", hours1);
		Employee e2 = new Employee("직원2", hours2);
		Employee e3 = new Employee("직원3", hours3);
		Employee e4 = new Employee("직원4", hours4);
		
		Employee[] employees = {e1, e2, e3, e4}; //객체 배열 만들기
		for(int i=0; i < employees.length; i++) {
			employees[i].printTotalHours();
			System.out.println();
		}
		
	}

}
//직원 클래스
class Employee{
	String name;
	int[] hours;
	
	Employee(String str, int[] arr){
		name = str;
		hours = arr;
	}
	
	void printTotalHours() {
		System.out.printf("%s -> %d 시간", name, totalHours());
	}
	
	int totalHours() {
		int sum = 0;
		for(int i=0; i < hours.length; i++) {
			sum += hours[i];
		}
		return sum;
	}
}