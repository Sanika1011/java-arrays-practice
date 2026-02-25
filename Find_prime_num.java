package Array;

public class Find_prime_num {

	public static void main(String[] args) 
	{
		int a[]={1,3,7,25,13};
		
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			int c=0;
			for(int j=1;j<=num;j++) 
			{
				if(num%j==0)
				{
					c++;
				}
			}
			if(c==2)
			{
				System.out.println(num);
			}
		}
	}

}
