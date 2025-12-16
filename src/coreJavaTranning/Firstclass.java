package coreJavaTranning;

public class Firstclass {
	
	public void getData()
	{
		System.out.println("I'm in the Method");
	}
	
	static int a=15;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println("Hello Chandu");
		
		Firstclass obj=new Firstclass();
		obj.getData();

	}

}
