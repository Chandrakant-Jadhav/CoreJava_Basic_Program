package day6;

public class TwoDimentionalArray {

	public static void main(String[] args) {
	
		//Declaring Array
		//Approach 
		
		/*int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		*/
		
		//Approach 2
		
		int a[][]= {{100,200},
				    {300,400},
				    {500,600}
				    };
		        
		//Find size of array
		
		System.out.println("Lenght of rows"+a.length); //to get the row 
		System.out.println("Lenght od column"+a[0].length);//to get the column 
		
		//read single value from an array
		System.out.println(a[2][1]);
		
		
		//Read all the rows and column 
		for(int r=0; r<=2; r++)
		{
			for(int c=0; c<=1; c++)
			{
				System.out.print(a[r][c]+ "  "); 
			}
			System.out.println();
		}
		

	}

}
