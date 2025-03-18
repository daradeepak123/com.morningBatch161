package inherit1;

public class Inhirit3 extends Inhirit2{
	
	
	public void hello()
	{
		System.out.println("Simple hello");
	}
	
	public static void hi()
	{
		System.out.println("another hi method");
	}
	
	public static void main(String args[])
	{
		Inhirit3 o=new Inhirit3();
		
		System.out.println(o.xz);
		
		o.hello();
		
		
		Inhirit2.hi();
	}
	
	

}
