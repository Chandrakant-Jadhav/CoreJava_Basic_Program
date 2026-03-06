package day16;

import java.util.Scanner;

public class PratiseReverseString {

	public static void main(String[] args) {
		
		
		Scanner sc2=new Scanner (System.in);
		System.out.println("Enter a String");
		String sc=sc2.nextLine();
		String rev=" ";
		
		for(int i=sc.length()-1; i>0; i--)
		{
			rev=rev+sc.charAt(i);
		}
		System.out.println("Reverse A String is:"+ rev);
		sc2.close();
	}
	
	
}
