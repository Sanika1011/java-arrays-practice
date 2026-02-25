package Array;

public class Jagged_arr {

	//array with different row and col size
	public static void main(String[] args) 
	{
		//declaring array with the different col size.
		int arr[][] = new int[][]
				{
					new int[] {21,22,23,24},
					new int[] {25,26},
					new int[] {22,23,43,52},
					new int[] {21,31,41,51,61,71}
				};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
