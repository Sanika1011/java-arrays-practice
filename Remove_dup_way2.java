package Array;

public class Remove_dup_way2 {

	public static void main(String[] args) 
	{
		int a[]= {4,11,4};
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
				System.out.println(a[i]); //4 11
			}
		}
	}

}
