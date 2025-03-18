package loops;

public class NestedLoopStar {

	public static void main(String[] args) {
		for(int x=1;x<=2;x++) {
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=1;i<=2;i++)
		{
			System.out.println("*");
		}
		
		
		}
		

	}

}
