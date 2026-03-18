package day16_Interface.copy.copy.copy;

interface Shape
{
	int lenght=20;
	int width=30;
	
	void circle(); //abdtract method
	
	default void square() {
		System.out.println("This is sqaure - Default method");
		
	}
	
	static void rectangle()
	{
		System.out.println("This is sqaure - Static method");

	}
}

public class InterfaceDemo implements Shape {
	
	
	public void circle()
	{
		System.out.println("This is cricle");
	}

	public static void main(String[] args) {
		//scenario 01
//		InterfaceDemo ts =new InterfaceDemo();
//		ts.circle(); //abstract method
//		ts.square(); //default method
//		
//		Shape.rectangle(); //static method can directly call by interface name
		
		//scenario:02
		Shape s = new InterfaceDemo(); //upcasting - parent reference can hold child object
		s.circle(); //abstract method
		s.square(); //default method
		
		Shape.rectangle(); //static method can directly call by interface name
	}

}
