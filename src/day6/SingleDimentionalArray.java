package day6;

public class SingleDimentionalArray {

	public static void main(String[] args) {
		
		//declaring Array
		
       //Approach
		
		/*int a[]=new int[5];
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		*/
		
		//Approach 2
		int a[]= {100,200,300,400,500};
		
		
		//find lenght of an array
		
		System.out.println("Lenght os an Array="+a.length);
		
		//Read single value from array
		//System.out.println(a[4]);
		
		
		
		//Reading all the values form Array
		//normal for loop 
		
		/*for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}*/
		
		
		//Enhanced for loop /for each loop
		
		for (int x:a) 
		{
			System.out.println(x);
		}
		

	}

}
