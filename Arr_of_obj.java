package Array_of_object;

import java.util.Scanner;

class Student
{
	int rno;
	String name;
	float fees;
	
	Student()
	{
		
	}
	
//	Student()
//	{
//		
//	}
	
	void display()
	{
		System.out.println("Rno:"+rno+"\nName:"+name+"\nFees:"+fees);
	}
}

public class Arr_of_obj {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Student[] st=new Student[3];
		
		for(int i=0;i<st.length;i++)
		{
			st[i]=new Student();
			System.out.println("Enter roll_no: ");
			st[i].rno=sc.nextInt();
			System.out.println("Enter name: ");
			st[i].name=sc.next();
			System.out.println("Enter fees: ");
			st[i].fees=sc.nextFloat();
			//st[i].display();
		}
		
		for(int i=0;i<st.length;i++)
		{
			st[i].display();
		}
	}

}
