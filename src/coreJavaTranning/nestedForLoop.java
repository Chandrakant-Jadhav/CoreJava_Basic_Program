package coreJavaTranning;

public class nestedForLoop {

	public static void main(String[] args) 
	{
		for (int i = 1; i < 4; i++) 
			
		{
		System.out.println("Outer loop started");
			for (int j = 1; j <= 4; j++) 
			{
				System.out.println("Inner loop ");
			}
			System.out.println("Outer loop ended");
		}
		

	}

}
