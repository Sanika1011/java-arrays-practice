package Array;

public class Print_even_b4_odd {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b[]=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]+" "+i);
				b[index]=a[i];
				index++;
			}
		}
		
		System.out.println();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]+" "+i);
				b[index]=a[i];
				index++;
			}
		}
		
		System.out.println("b array");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" "+i);
		}
		
	}

}