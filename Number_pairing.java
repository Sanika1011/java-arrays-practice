package Array;

import java.util.Scanner;

public class Number_pairing {

	public static void main(String[] args) 
	{
		int a[] = {1,2,3,4,5,6};
				//i
			      //j
					//k
		
		//1st way
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				for(int k=j+1;k<a.length;k++)
//				{
//					System.out.println(a[i]+" "+a[j]+" "+a[k]);
//				}
//			}
//		}
		
		//2nd way
//		for(int i=0;i<a.length-2;i++)
//		{
//			System.out.println(a[i]+" "+a[i+1]+" "+a[i+2]);
//		}
		
		
		//3rd way
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter number of pairs to form: ");
//		int k=sc.nextInt(); 
//		if(a.length>k)
//		{
//		for(int i=0;i<a.length-(k-1);i++)
//		{
//			for(int j=i;j<i+k;j++)
//			{
//				System.out.print(a[j]+" ");
//			}
//			System.out.println();
//		}
//		}
//		else
//		{
//			System.out.println("The value of K out of array's length");
//		}
		
		//pairing of two numbers
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.println(a[i]+" "+a[j]);
			}
		}
	}
}