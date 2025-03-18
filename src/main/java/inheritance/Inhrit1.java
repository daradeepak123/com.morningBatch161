package inheritance;

public class Inhrit1 {
	
	int a =100;
	static int b=5000;
	protected static String address="address";
	public void hello()
	{
		int a=500;
		System.out.println(this.a);
		
		
		System.out.println("this is hello method");
	}
	
	public static void hi()
	{
		
		int b=1;
		System.out.println(Inhrit1.b);
		
		
		System.out.println("this is hello hi and static method");
	}
	
}
