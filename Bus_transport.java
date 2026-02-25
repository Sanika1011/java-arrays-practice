package Array_of_object;

import java.util.Scanner;

class PMT_Bus
{
	int bus_id;
	String bus_route;
	int km;
	int fare;
	
	PMT_Bus(int bus_id,String bus_route,int km)
	{
		this.bus_id=bus_id;
		this.bus_route=bus_route;
		this.km=km;
		this.fare=km*10;
	}
	
	void display()
	{
		System.out.println("Bus ID:"+bus_id+"\nBus route:"+bus_route+"\nKm:"+km+"\nfare:"+fare);
	}
}

public class Bus_transport {

//	final Bus_transport()
//	{
//		
//	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		PMT_Bus[] ob = new PMT_Bus[3];
		
		for(int i=0;i<ob.length;i++)
		{
			System.out.println("Enter bus id:");
			int b_id=sc.nextInt();
			System.out.println("Enter bus route:");
			String b_rout=sc.next();
			System.out.println("Enter km:");
			int km=sc.nextInt();
			//System.out.println("Enter fare:");
			//int fare=sc.nextInt();
			ob[i]=new PMT_Bus(b_id,b_rout,km);
		}
		
		for(int i=0;i<ob.length;i++)
		{
			ob[i].display();
		}
	}

}
