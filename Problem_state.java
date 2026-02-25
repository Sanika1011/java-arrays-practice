package Array;

import java.util.Scanner;

public class Problem_state {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name[] = new String[6];
		
		String FR[][] = new String[3][2];
		int k=0;
		for(int i=0;i<6;i++)
		{
			System.out.println("Enter name:");
			name[i]=sc.next();
		}
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				FR[i][j]=name[k];
				k++;
			}
		}
		
		System.out.println("Name  "+"Floor  "+"Room  ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.println(FR[i][j]+" "+i+" "+j);
			}
		}
	}

}
