package Array;

public class neg_pos {

	public static void main(String[] args) 
	{
		int a[]={1,-1,2,-2,3,-3,4,-4,5,-5};
		int b[]=new int[a.length];
		int index=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				System.out.println(a[i]+" "+i);
				b[index]=a[i];
				index++;
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>0)
			{
				System.out.println(a[i]+" "+i);
				b[index]=a[i];
				index++;
			}
		}
		
		
		System.out.println("b array:");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" "+i);
		}
	}

}
