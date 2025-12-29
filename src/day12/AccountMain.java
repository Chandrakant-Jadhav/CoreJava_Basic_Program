package day12;

public class AccountMain {

	public static void main(String[] args) {
		Account acc=new Account();
		acc.setAccno(101);
		
		acc.setAmount(23.45);
		
		acc.setName("Chandu QA");
		
		acc.getAccno();
		
		System.out.println("Account number is: "+acc.getAccno());
		
	    System.out.println(acc.getAmount());
	    
	    System.out.println(acc.getName());

	}

}
