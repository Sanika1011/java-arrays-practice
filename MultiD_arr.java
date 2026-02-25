package Array;

import java.util.Scanner;

public class MultiD_arr {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of arrays: ");
		int no_Arr = sc.nextInt();
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter number of cols: ");
		int cols = sc.nextInt();
		int a[][][]=new int[no_Arr][rows][cols];
		
		//for(int k=0;k<3;k++)
		for(int k=0;k<a.length;k++)
		{
			//for(int i=0;i<2;i++)
			for(int i=0;i<a[k].length;i++)
			{
				//for(int j=0;j<2;j++)
				for(int j=0;j<a[k][i].length;j++)
				{
					System.out.println("Enter number: ");
					a[k][i][j]=sc.nextInt();
				}
			}
		}
		
		//for(int k=0;k<3;k++)
		for(int k=0;k<a.length;k++)
		{
			//for(int i=0;i<2;i++)
			for(int i=0;i<a[k].length;i++)
			{
				//for(int j=0;j<2;j++)
				for(int j=0;j<a[k][i].length;j++)
				{
					System.out.print(a[k][i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
