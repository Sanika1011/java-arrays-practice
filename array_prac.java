package array;

public class array_prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	//Q1.create an array of 5 floats and calculate their sum
		/*float [] marks = {34.4f, 56.6f, 67.5f, 65.9f, 26.8f};
		
		float sum = 0;
		
		for(float element:marks) {
			sum = sum + element;
		}
		
		System.out.println("sum is :" + sum);
	}*/

		
		//Q2.check if the given value is present in the array
		/*float [] marks = {34.4f, 56.6f, 67.5f, 65.9f, 26.8f};
		
		float num = 30.4f;
		boolean isInArray = false;
		for(float element:marks) {
			if(num==element) {
				isInArray = true;
				break;
			}
		}
		
		if(isInArray) {
			System.out.println("The value is present in the array");
		}
		else {
			System.out.println("The value is not present in the array");
		}*/
		
		
		//Q3.find avrage of total marks
		
		/*float [] marks = {34.4f, 56.6f, 67.5f, 65.9f, 26.8f};
		
		float sum = 0;
		
		for(float element:marks) {
			sum = sum + element;
		}
		
		System.out.println("avg is :" + sum/marks.length);*/
		
		//Q4.add two matrices of size 2*3
		
		int [][] mat1 =  {{1,2,3},
						{4,5,6}};
						
		int [][] mat2 = {{2,6,13},
						{3,7,1}};
		
		int [][] result = {{0,0,0},
						  {0,0,0}};
		
		for(int i = 0; i<mat1.length; i++) { //row number of lines
			for(int j = 0; j<mat1[i].length; j++) { //column number of lines
				result[i][j] = mat1[i][j] + mat2[i][j];
				System.out.print(result[i][j] + " " );
			}
			System.out.println("");
		}
		
		
		//Q5.reverse array
		
		/*int [] marks = {2,3,4,5,6};
		
		for(int i = marks.length-1; i <= 0; i--) {
			System.out.println(marks[i]);
		}*/
		
		/*int [] arr = {1, 2, 3, 4, 5,10,34};
		
		int l = arr.length;
		int n = Math.floorDiv(l, 2);
		int temp;
		
		for(int i = 0; i < n; i++) {
			//swap a[i] and a[l-i-1]
			//a b temp
			
			temp = arr[i];
			arr[i] = arr[l-i-1];
			arr[l-i-1] = temp;
		}
		
		for(int element : arr) {
			System.out.print(element + " ");
		}*/
		
		
		//Q6.find max elemnt in element
		
		/*int [] arr = {1, 2, 3, 4, 455,5,10,34};
		int max = Integer.MIN_VALUE;
		int max = 0;
		for(int element : arr) {
			if(element > max) {
				max = element;
			}
		}
		
		System.out.println("max element is:" + max);*/
		
		
		//Q7.find min elemnt in element
		/*int [] arr = {1, 2, 3, 4, -455,5,10,34};
		int min = Integer.MAX_VALUE;
		
		for(int element : arr) {
			if(element < min) {
				min = element;
			}
		}
		System.out.println("min element is:" + min);*/
		
		/*System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);*/
		
		
		
		//Q8.check if the array is sorted or not
//		boolean isSorted = true;
//		int [] arr = {1, 2, 3, 4, 5, 10, 34};
//		for(int i=0; i<arr.length-1; i++ ) {
//			if(arr[i] > arr[i+1]) {
//				isSorted = false;
//				break;
//			}
//		}
//		if(isSorted) {
//			System.out.println("the array is sorted");
//		}
//		else {
//			System.out.println("not sorted");
//		}

		
	}
}