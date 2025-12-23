package day7;

public class SearchingElementInArray {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50};
		
		int search_elements=3000;
		boolean status=false;   //false - not found
		
		for(int i=0; i<a.length; i++)
		{
			if (a[i]==search_elements)
			{
				System.out.println("element Found = "+ a[i]);
				status=true;
				break;
			}
		}
		if(status==false)
		{
		System.out.println("Element is not matching");
		}

	}

}
