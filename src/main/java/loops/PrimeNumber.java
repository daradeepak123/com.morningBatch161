package loops;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=7;
		boolean bool=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				bool=false;
			}
		}
		
		if(bool)
		{
			System.out.println(num+"  is a prime");
		}
		else
		{
			System.out.println(num+"  is not a prime");
		}

	}

}
