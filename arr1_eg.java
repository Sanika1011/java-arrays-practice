package Array;

import java.util.Scanner;

public class arr1_eg {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array: ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		//second-half
		for(int i=arr.length/2;i<arr.length;i++)
		{
			System.out.println("Enter number: ");
			arr[i]=sc.nextInt();
		}
		
		//first-half
		for(int i=0;i<arr.length/2;i++)
		{
			System.out.println("Enter number: ");
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
}
