package day16;

public class ReverseStringTest {

	public static void main(String[] args) {
//		String s="Chandu";
//		
//		String rev="";
//		
//		for(int i=s.length()-1; i>=0; i--)
//		{
//			rev=rev+s.charAt(i); 
//		}
//		System.out.println("Reverse A String is:"+ rev);
//
		String s="Chandu";
		
		String rev="";
		
		char a[]=s.toCharArray();  //It is an method who can convert string into charctaer array
		
		for(int i= a.length-1; i>=0; i--)
		{
			rev=rev+a[i];
		}
		System.out.println("reverse of the string is :"+rev);
		
	}
	
	
	

}
