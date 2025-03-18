package arraysLearn;

public class TwoDArrays {

	public static void main(String[] args) {

		int abc[][]=new int[5][5];
		
		
		
		for(int i=0;i<abc.length;i++)
		{
			int count=1;
			
				for(int k=0;k<abc[2].length;k++)
				{
					abc[i][k]=count++;
				}	
			
			
			
		}
		
		
		for(int i=0;i<abc.length;i++)
		{
			
				for(int k=0;k<abc[2].length;k++)
				{
					
					System.out.print(abc[i][k]+"\t");
				}	
			
			System.out.println();
			
		}
		
		
		

	}

}
