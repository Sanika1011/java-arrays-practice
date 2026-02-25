package Array;

public class Remove_ele {

	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5};
		int ele=35;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				count++;
			}

		}

		if(count==0)
		{
			System.out.println("element not present");
		}
		else
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]!=ele)
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
