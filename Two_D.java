package Array;

import java.util.Scanner;

public class Two_D {

	public static void main(String[] args) 
	{
//		int arr[][] = {{1,2},{3,4}};
		
//		for(int i=0;i<arr.length;i++) //row
//		{
//			for(int j=0;j<arr.length;j++) //col
//			{
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
//		int arr1[][] = {{1,2,3},{4,5,6}}; //2 rows 3 cols
//		
//		for(int i=0;i<arr1.length;i++) //row<2
//		{
//			for(int j=0;j<arr1[0].length;j++) //col<3
//			{
//				System.out.print(arr1[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		Scanner sc = new Scanner(System.in);
		
		int arr2[][] = new int[2][2];
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				arr2[i][j]=sc.nextInt();
			}
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
}
