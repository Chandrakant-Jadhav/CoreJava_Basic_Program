package day13;

public class StaticDemo {
	
	static int a=10; //static variable
	int b=20;   //Non-static variable
	
	
	static void m1()
	{
		System.out.println("This is m1 static method...");
	}
	
	void m2()
	{
		System.out.println("This is m2 non-static method...");
	}

	
	void m() //non-static method
	{
		//Accessing static members
		System.out.println(a);
		m1();
		
		//Accessing non-static members
		System.out.println(b);
		m2();
		
	}
	
	/*public static void main(String[] args) {
		//Accessing static members
		//Static methods can directly accessing the static stuff (Without Creating Object) 
		System.out.println(a);
		m1();
		
		//Accessing non-static members
		//static method can access non static stuff through object
		
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		

	}*/

}
