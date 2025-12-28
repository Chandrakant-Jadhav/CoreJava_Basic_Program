package day11;

public class StudentMain {

	public static void main(String[] args) { 
		
		/*student stu=new student();
		
		//1) Using Object reference
		stu.sid=101;
		stu.sname="Chandu QA";
		stu.grade='A';
		
		stu.PrintStuData();
		
		//2) using method 
		stu.setData(105, "QA CJ", 'B');
		stu.PrintStuData();
		
		
		*/
		
		//3) Using Constructor 
		student stu=new student(105, "Construct CJ", 'c');
		stu.PrintStuData(); 

	}

}
