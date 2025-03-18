package typesOfVariables;

public class VariablesTypes {

	static boolean b=true;
	char ch='@';
	static short z=5000;
	
	public void hello()
	{
		int x=100;
		System.out.println(b);
		System.out.println(ch);
		
	}
	
	
	public static void hi()
	{
		int y=300;
		System.out.println(y);
		System.out.println(b);
	
	}
	
	public static void main(String[] args) {
	int z=400;
	System.out.println(z);
	System.out.println(b);
	System.out.println(VariablesTypes.z);
	hi();

	}

}
