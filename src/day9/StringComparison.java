package day9;

public class StringComparison {

	public static void main(String[] args) {
		//case 01
		/*String s1="Welcome";
		String s2="Welcome";
		
		System.out.println(s1==s2);
		
		System.out.println(s1.equals(s2));
		
		*/
		
		//case 02
		/*
		
		String s1=new String("Welcome");
		String s2=new String("Welcome");
		
		
		System.out.println(s1==s2); //false ---> To compares the objects 
		
		System.out.println(s1.equals(s2)); //True ---> TO compares the values of objects 
		*/
		
		
		//case 03
		/*
		String s1="abc";
		String s2=new String ("abc");
		
		System.out.println(s1==s2);  //False ---> To compares the objects 
		System.out.println(s1.equals(s2)); //True   ---> TO compares the values of objects 
		
		*/
		//Case 04
		
		String s1="abc";
		String s2=new String ("abc");
		String s3=s2;
		
		System.out.println(s1==s2);// false 
		System.out.println(s1.equals(s2));//true
		
		System.out.println(s2==s3);//true, becoz objects are same/equal
		
		System.out.println(s2.equals(s3)); //true
		
		System.out.println(s1==s3); //false 
		
		System.out.println(s1.equals(s3)); //true 

	}

}
