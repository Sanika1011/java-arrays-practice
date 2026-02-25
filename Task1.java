package Array;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		int i=1;
		int age;
//		System.out.println("Enter age of a person: ");
//		int age=sc.nextInt();
		while(i<arr.length)
		{
			System.out.println("Enter age of a person: ");
//			age=sc.nextInt();
			arr[i]=sc.nextInt();
			i++;
		}
		
		int baby_age;
		int school_age;
		int adult_age;
		while(i<arr.length)
		{

			System.out.println("Enter age of a person: ");
			age=sc.nextInt();
			if(age>=0 && age<5)
			{
				System.out.println("Baby age");
				
			}
			else if(age>=6 && age<=17)
			{
				System.out.println("school age");
			}
			else if(age>=18)
			{
				System.out.println("adult");
			}
			else
			{
				System.out.println("invalid age");
			}
			i++;
		}
		
		
	}

}
