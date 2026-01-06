package day13;

public class StaticMain {
	public static void main(String[] args) {
		//Accessing static members
		//Static methods can directly accessing the static stuff (Without Creating Object) 
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
		
		//Accessing non-static members
		//static method can access non static stuff through object
		
		StaticDemo sd = new StaticDemo();
		System.out.println(sd.b);
		sd.m2();
		
	}

}
