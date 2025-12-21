package day4;

import java.util.Scanner;

public class PositiveOrNigativeNumber {

	public static void main(String[] args) {
		System.out.println("Pls enter the number");
		
		Scanner sc = new Scanner(System.in);   // Scanner statement
        int num = sc.nextInt();                // read integer input
		if(num>0)
		{
			System.out.println("It's possitie number");
		}
		
		else if(num<0)
		{
			System.out.println("It's a Negative numner");
		}
		else
		{
			System.out.println("It a Zero");
		}

	}

}
