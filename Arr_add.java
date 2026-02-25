package Array;

import java.util.Scanner;

public class Arr_add {

	public static void main(String[] args) 
	{
		int arr1[] = new int[3];
		int arr2[] = new int[3];
		int arr3[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter num1: ");
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("Enter num2: ");
			arr2[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr3.length;i++)
		{
			arr3[i]=arr1[i]+arr2[i];
		}
		
		System.out.print("The sum of arr1 and arr2: ");
		for(int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
	}

}
