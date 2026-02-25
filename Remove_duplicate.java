package Array;

public class Remove_duplicate {

	public static void main(String[] args) 
	{
		//1st way
		int a[]= {1,3,3,1};

		for(int i=0;i<a.length;i++) //i=0 //i=1 //i=2 //i=3
		{
			int count = 0; //c=0
			for(int j=i+1;j<a.length;j++) //j=1 j=2 j=3
			{							 //j=2 //j=3
										//j=3 //j=4F
										//j=4F
				if(a[i]==a[j]) //1==3 1==3 1==1
				{			   //3==3 3==1
							   //3==1 
					count++; //1c=1 //3c==1
				}
			}
			
			if(count==0) //3c==0 //1c==0
			{
				//System.out.print(a[i]+" "); //3 //1
				
				//****find frequency of original elements****
				int count1=0;
				for(int k=0;k<a.length;k++)
				{
					if(a[k]==a[i])
					{
						count1++;
					}
				}
				System.out.println(a[i]+" Count:"+count1);
			}
		}
	}
}