package loops;

public class OddEvenRange {

	public static void main(String[] args) {
		int even=0;
		int odd=0;



		for(int i=699;i<=1799;i++)
		{
			if(i%2==0)
			{
				//System.out.println(i+ "is a even number");
				even++;
			}
			else
			{
				//System.out.println(i+ "is a odd number");
				odd++;
			}
		}

		System.out.println("total even numbers are "+even);
		System.out.println("total odd numbers are "+odd);
	}

}
