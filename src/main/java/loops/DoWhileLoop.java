package loops;

public class DoWhileLoop {

	public static void main(String[] args) {


		int i=10;
		
//		while(i<10)
//		{
//			System.out.println(i++);
//			
//		}
		
		
		do
		{
			System.out.println(i--);
			if(i==0)
			{
				break;
			}
		}while(i<10);
		
		
		
		

	}

}
