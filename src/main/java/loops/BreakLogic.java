package loops;

public class BreakLogic {

	public static void main(String[] args) {

		int c=0;
		for(int i=1440;i<3000;i++)
		{

		if(i%2==0)
		{
		c++;
		}

		if(c==20)
		{
		System.out.println(i);
		break;
		}

		}

System.out.println(c);

	}

}
