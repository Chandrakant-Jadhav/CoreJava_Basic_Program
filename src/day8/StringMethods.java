package day8;

public class StringMethods {

	public static void main(String[] args) {
		String s="Welome";
		
		String s1=new String ("Welcome");
		
		//lenght
		System.out.println(s1.length());
		
		//concat() method
		
		String s3="To java";
		
		System.out.println(s3.concat(s1).concat(s));
		
		//trim()  remove spacess right amd left side
		
		s="   welcome    ";
		System.out.println(s.trim());
		
		//CharAt() - retruns a charcters from a String based on index 
	    System.out.println(s.charAt(2));
	    
	    //Contains - Retruns true/false 
	    
	    System.out.println(s.contains("wel"));//
	    
	    //equals(), equalIgnoreCase() --> Compare Strings
	    
	    String s2="Welcome";
	    String s4="Welcome";
	    
	    System.out.println(s2==s4);//true
	    
	    System.out.println(s2.equals(s4));//true
	    
	    System.out.println(s2.equals("wlcome"));// false
	    
	    System.out.println(s2.equalsIgnoreCase("welcomw")); //true
	    
	    
		//replace() --> signle/multiple (sequence) of characters in a String 
	    
	    s="Welcom to java selenium python selenium ";
	    
	    System.out.println(s.replace('e', 'x'));
	    
	    System.out.println(s.replace("selenium", "plywright"));
	    
	    //substring() --> extract substring from main string 
	    //starting index
	    //ending index
	    
	    s="selenium";
	    
	    System.out.println(s.substring(1,5)); //elen
	    
	    
	    //toUppercase toLowverCase 
	    
	    System.out.println(s.toUpperCase());
	    
	    System.out.println(s.toLowerCase());
	    
	    
	    //split() --> Split the string into multiple part based on delimeter
	    
	    s="abc@gmail.com";
	    String a[]=s.split("@");
	    System.out.println(a[0]); //abc
	    
	    System.out.println(a[1]); //gmail.com
	    
	    
	    

	}

}
