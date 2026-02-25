package Array;

public class MultiD_literal {

	public static void main(String[] args) 
	{
		int a[][][]= {
						{{1,2},{3,4}},
						{{5,6},{7,8}},
						{{10,20}},
						{{200}},
						{{5,6},{7,8},{6,7}}
					 };
		
		
		for(int k=0;k<a.length;k++)
		{
			for(int i=0;i<a[k].length;i++)
			{
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