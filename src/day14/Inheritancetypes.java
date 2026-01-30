package day14;

class A {
	int a = 100;

	void display() {
		System.out.println(a);

	}
}

class B extends A{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
}

class C extends B{
	int c=300;
	void print()
	{
		System.out.println(c);
	}
}



public class Inheritancetypes {

	public static void main(String[] args) {
		B obj = new B();
		obj.display(); // calling parent class method
		obj.show(); // calling child class method
		
		System.out.println(obj.a); // accessing parent class variable
		System.out.println(obj.b); // accessing child class variable
		
		
		C Cobj= new C();
		Cobj.display(); // calling grandparent class method
		Cobj.show(); // calling parent class method\
		Cobj.print(); // calling child class method
		
		
		Cobj.a=100;
		Cobj.b=200;
		Cobj.c=300;
		
		Cobj.display(); // accessing grandparent class variable
		Cobj.show(); // accessing parent class variable
		Cobj.print(); // accessing child class variable
		
		

	}

}
