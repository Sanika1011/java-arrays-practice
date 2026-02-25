package Array;

public class Inner_elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
		int sum=0;
		int avg=0;
		for(int i=1;i<a.length-1;i++)
		{
			for(int j=1;j<a.length-1;j++)
			{
				
				sum=sum+a[i][j];
				//System.out.print(a[i][j]+" ");	
			}
		}
		System.out.println(sum);

		avg=sum/4;
		System.out.println(avg);

	}

}
