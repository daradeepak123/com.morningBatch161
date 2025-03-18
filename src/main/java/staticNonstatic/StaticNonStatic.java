package staticNonstatic;

public class StaticNonStatic {
	
	static int abc=100;
	int xyz=3000;

	public static void main(String[] args) {
		
		System.out.println(abc);
		
		
	}
	
	
	
	public void hello()
	{
		System.out.println(abc);
		System.out.println(xyz);
	}

}
