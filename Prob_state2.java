package Array;

import java.util.Scanner;

public class Prob_state2 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String days[]=new String[7];
		String temp[][]=new String[7][2];
		
		for(int i=0;i<7;i++)
		{
			System.out.println("Enter day:");
			days[i]=sc.nextLine();
		}

		for(int i=0;i<7;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println("enter temprature:");
				temp[i][j]=sc.nextLine();
				//System.out.println(days[i]+" "+temp[i][j]);
			}
		}
		
		for(int i=0;i<7;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(days[i]+" "+temp[i][j]);
			}
		}
 	}
}
