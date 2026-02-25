package Array;

public class Common_elements {

	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		int[] b = {3,4,5,6,7};
		
		System.out.println("Common elements from both arrays.");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+" ");
					break;
				}
			}
		}
			
	}

}
