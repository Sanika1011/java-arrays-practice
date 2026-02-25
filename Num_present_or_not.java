package Array;

public class Num_present_or_not {

	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,50};
		int num=40;
		
		boolean x = false;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				x=true;
				break;
			}
		}
		
		if(x)
		{
			System.out.println("Element "+num+" is present in array.");
		}
		else
		{
			System.out.println("Element " + num+" not present in array.");
		}
	}

}
