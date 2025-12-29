package day13;

public class ThisKeyword {
	
	int x,y;   //Class variables/Instance variables
	
	/*ThisKeyword(int x, int y)  //Local variables
	{
		this.x=x;
		this.y=y;
	}
	*/
	
	void setData(int x, int y)  //Local variables
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {	
		
		//ThisKeyword th = new ThisKeyword(100,200);
		ThisKeyword th = new ThisKeyword();
		th.setData(500, 100);
		th.display();

	}

}
