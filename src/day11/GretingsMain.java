package day11;

public class GretingsMain {
	public static void main(String[] args) {
		
		
		Greetings gr=new Greetings();
		gr.m1();//1
		
		String s= gr.m2();   //2
		System.out.println(s);
		
		
		gr.m3("Chandu");   //3 
		
		
		String var =gr.m4("QA CJ");  //4
		System.out.println(var);
		
	}

}
