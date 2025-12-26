package day9;

public class ReverseAString {

	public static void main(String[] args) {
		
		/*Approach 1
		String s="Welcome";
		
		String rev="";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev=rev+s.charAt(i); 
		}
		System.out.println("Reverse A String is:"+ rev);
		
		*/
		
		//Approach 2 - without using String methods
		
		/*
		String s="Welcome";
		
		String rev="";
		
		char a[]=s.toCharArray();  //It is an method who can convert string into charctaer array
		
		for(int i= a.length-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println("reverse of the string is :"+rev);
		
		*/
		
		//approach 03: Using StringBuffer class
		
		StringBuffer s=new StringBuffer("Welcome");
		System.out.println("The reverse a String"+ s.reverse());;
		
		
		//Approach 04: using StringBuilder
		
		StringBuilder s1=new StringBuilder("Welcome");
		System.out.println("The reverse a String: "+ s1.reverse());

	}

}
