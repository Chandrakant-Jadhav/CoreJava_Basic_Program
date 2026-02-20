package day16;

import java.util.Arrays;

public class MutableVsImutable {

	public static void main(String[] args) {
		//Mutable exmaple 
		int a[]= {20,10,40,50,30};
		 System.out.println(Arrays.toString(a));
		 
		 Arrays.sort(a);  //Mutable
		 
		 System.out.println(Arrays.toString(a));
		 
		 
		 //immutable example 
		 String x="Welcome";
		 
		 String conactString = x.concat(" To Java");
		 
		 System.out.println(x); // Welcome 
		 
		 System.out.println(conactString); // 

	}

}
