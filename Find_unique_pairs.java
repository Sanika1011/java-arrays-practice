package Array;

public class Find_unique_pairs {

	public static void main(String[] args) 
	{
		int a[]= {1,2,2,4,5,3,1,2};
		int c1=0;
		for(int i=0;i<a.length;i++)//i=0 0<3 i=1 1<3 i=2 2<3 i=3 3<3f
		{
			int count=0;
			for(int j=0;j<i;j++)//j=0 0<0f
			{				   //j=0 0<1t 1<1f
							   //j=0 0<2t 1<2t 2<2f
				if(a[i]==a[j])//11==4f //4==4t //11==4f
				{
					count++; //count=1
				}
			}
			
			if(count==0) //0==0 //0==0 //0==1
			{
				c1++;
				System.out.println(a[i]+" "+i); //4 11
				//System.out.println(c1);
			}
		}
		System.out.println("count of org: "+c1);
		int b[]=new int[c1];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<i;j++)
			{				   
				if(a[i]==a[j])
				{
					count++; 
				}
			}
			
			if(count==0) 
			{
				b[index]=a[i];
				index++;
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+" "+i);
		}
		
		System.out.println("pairs of unique elements");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				System.out.println(b[i]+" "+b[j]);
			}
		}
	}
}