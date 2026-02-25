package Array;

public class quize {

	public static void main(String[] args) 
	{
		String[][] quiz = {
				{"1.What is HTML?","Hypertext Markup Language."},
				{"2.45+5","50"},
				{"3.Capital of India?","delhi"}
		};
		
		for(int i=0;i<quiz.length;i++)
		{
			System.out.println("Question: "+quiz[i][0]);
			System.out.println("Answer: "+quiz[i][1]);
			System.out.println();
		}
	}

}
