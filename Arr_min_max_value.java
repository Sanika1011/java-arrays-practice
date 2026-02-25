package Array;

import java.util.Scanner;

public class Arr_min_max_value {

	public static void main(String[] args) 
	{
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter array elements: ");
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max) 
			{
				max=arr[i];
			}
			
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		
		System.out.println("max: "+max);
		System.out.println("min: "+min);
		
	}

}
