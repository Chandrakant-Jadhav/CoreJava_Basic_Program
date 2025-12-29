package day12;

public class AdderMain {

	public static void main(String[] args) {
		Adder addobj=new Adder();
		
		addobj.sum(); //01
		
		addobj.sum(100, 200); //02
		
		addobj.sum(10.5, 20); //04
		
		addobj.sum(10, 20, 30); //05
		
		addobj.sum(12, 55.55); //03
		
		
	}

}
