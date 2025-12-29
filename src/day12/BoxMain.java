package day12;

public class BoxMain {

	public static void main(String[] args) {
		Box b=new Box(); //1
		Box b1=new Box(10.5,20.5,30.6); //2
		Box b2=new Box(10.5); //3
		
		System.out.println(b2.volume());
	}

}
