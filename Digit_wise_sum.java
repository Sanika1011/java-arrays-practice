package Array;

public class Digit_wise_sum {
	
	public static void main(String[] args) 
	{
		int a[]={2, 15, 7, 34, 9, 81, 5};
		int oneDigitSum=0;
		int twoDigitSum=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=0 && a[i]<=9)
			{
				oneDigitSum = oneDigitSum + a[i];
			}
			else if(a[i]>9 && a[i]<100)
			{
				twoDigitSum = twoDigitSum + a[i];
			}
		}
		
		System.out.println("oneDigitSum:"+oneDigitSum);
		System.out.println("twoDigitSum:"+twoDigitSum);
	}
}