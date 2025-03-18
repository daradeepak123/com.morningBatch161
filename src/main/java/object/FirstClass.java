package object;

public class FirstClass {
	
	public int a=100;
	static int b=1000;
	
	public static void greet()
	{
		System.out.println("Namaste");
		FirstClass o=new FirstClass();
		System.out.println(o.a);
	}
	
	public void wish()
	{
		System.out.println("Hello");
		System.out.println(a);
		
		
	}
	
	

}
