package object;

public class RecapObject {
	
	int a=100;
	static int x=300;
	static RecapObject oo=new RecapObject();
	public static void met()
	{
		RecapObject o=new RecapObject();
		o.a=6000;
		
		System.out.println(o.a);
		
		x=500;
		System.out.println(x);
		
		System.out.println(o.x  +"xx");
		System.out.println(x);
		
	}
	
	public void hello()
	{
		System.out.println(a);
		System.out.println(x);
	}

	public static void main(String[] args) {
		System.out.println(x);   
		met();
		x=1000;
		System.out.println(x);
		
		
		RecapObject o=new RecapObject();
		System.out.println(o.a);
		
		o.hello();
		
		
	}

}
