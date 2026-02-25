package Array;

import java.util.Scanner;

public class arr_eg {

	public static void main(String[] args) 
	{
//		int arr[] = {1,2,3};
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);
//		
//		System.out.println("using for loop");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println(arr[i]);
//		}
//		
//		System.out.println("using new keyword");
//		System.out.println("using scanner");
//		int arr1[]=new int[5];
//		Scanner sc = new Scanner(System.in);
//		for(int i=0;i<arr1.length;i++)
//		{
//			System.out.println("Enter number: ");
//			arr1[i]=sc.nextInt();
//		}
//		
//		for(int i=0;i<arr1.length;i++)
//		{
//			System.out.print(arr1[i]+" ");
//		}
		
		
		
		float arr[]= {2.3f,4.5f};
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		System.out.println("using for loop");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("using new keyword");
		float arr1[] = new float[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("enter number: ");
			arr1[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		
	}

}
