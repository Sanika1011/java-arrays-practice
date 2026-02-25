package Array;

import java.util.Scanner;

public class even_odd_ele {

	public static void main(String[] args) 
	{
		int arr[]=new int[5];
		int even_sum=0;
		int odd_sum=0;
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter array elements: ");
			arr[i]=sc.nextInt();
		}
		
		int odd_max=arr[0];
		int even_max=arr[0];
		
		System.out.println("Odd numbers are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
				odd_sum=odd_sum+arr[i];
				if(arr[i]>odd_max)
				{
					odd_max=arr[i];
				}
			}
			
			
		}
		
		System.out.println();
		System.out.println("Even numbers are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
				even_sum=even_sum+arr[i];
				if(arr[i]>even_max)
				{
					even_max=arr[i];
				}
			
			}
		}
		
		System.out.println();
		System.out.println("odd num sum: "+odd_sum);
		System.out.println("even num sum: "+even_sum);
		System.out.println("Odd max:"+odd_max);
		System.out.println("Even max:"+even_max);
	}

}
