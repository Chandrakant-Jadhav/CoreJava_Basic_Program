package day14;


class Parent {

	void display(int a ) {
		
		System.out.println(a);

	}
}

class Child1 extends Parent {
	
	void show(int b) {
		System.out.println(b);
	}
}

class Child2 extends Parent {
	
	void print(int c) {
		System.out.println(c);
	}
}


public class HierarchyInheritance {
	public static void main(String[] args) {
		Child1 obj1 = new Child1();
		obj1.display(100); // calling parent class method
		obj1.show(200); // calling child1 class method
		
		Child2 obj2= new Child2();
		obj2.display(300); // calling parent class method
		obj2.print(400); // calling child2 class method
	}
	
}
