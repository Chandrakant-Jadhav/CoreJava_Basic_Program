package day10;

public class EmployeeMain {

	public static void main(String[] args) {
		Emoloyee emp1=new Emoloyee();
		emp1.eid=123;
		emp1.ename="Chandu";
		emp1.job="QA Test engg";
		emp1.sal=10000;
		emp1.display();
		
		
		Emoloyee emp2=new Emoloyee();
		emp2.eid=456;
		emp2.ename="QA CJ";
		emp2.job="Manager";
		emp2.sal= 500000;
		emp2.display();

	}

}
