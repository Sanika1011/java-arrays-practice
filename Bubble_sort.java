package Array;

public class Bubble_sort {

	public static void main(String[] args) 
	{
		int a[]={5,4,3,2,1};
		
		for(int i=0;i<a.length;i++) //i=0 0<5 //i=1 1<5
		{
			for(int j=i+1;j<a.length;j++) //j=1 1<5 //j=2 2<5 //j=3 3<5 //j=4 4<5 //j=5 5<5f
										  //j=2 2<5 //j=3 3<5 
			{
				if(a[i]>a[j]) //5>4 //5>3 //5>2 //5>4
							  //4>3 //
				{
					int temp = a[i]; //temp=5 a[i]=4 a[j]=5  //temp=5 a[i]=3 a[j]=5 //temp=5 a[i]=2 a[j]=5 //temp=5 a[i]=4 a[j]=5 
					a[i] = a[j];	 //temp=4 a[i]=3 a[j]=4 //temp=4 a[i]=3 a[j]=4
					a[j] = temp;
				}
			
			}
			System.out.println(a[i]);
		}
	}
}