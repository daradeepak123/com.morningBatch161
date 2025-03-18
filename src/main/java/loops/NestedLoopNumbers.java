package loops;

public class NestedLoopNumbers {

	public static void main(String[] args) {


		int ocount=0;
		int icount=0;
		for(int i=1;i<=3;i++)  // 1
		{
			ocount++;  //1
			for(int j=1;j<=3;j++)
			{
				icount++;      //3
			}

		}
		System.out.println(ocount);
		System.out.println(icount);




	}

}
