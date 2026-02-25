package Array;

public class Search_element {

	public static void main(String[] args) 
	{
		int arr[]={1,2,31,1,1,1};
		int ele=1;
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ele)
			{
				count++;
			}
		}
		
		System.out.println(count);
		if(count==0)
		{
			System.out.println("Not found");
		}
		else
		{
			System.out.println("Found");
		}
	}

}
