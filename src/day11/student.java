package day11;

public class student {
	
	int sid;
	String sname;
	char grade;
	
	void PrintStuData()
	{
		System.out.println(sid +" "+ sname + " "+ grade);
	}
	
	
	void setData(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grade=gr;
	}
	


        student(int id, String name, char gr) {
		sid=id;
		sname=name;
		grade=gr;
	}

}
