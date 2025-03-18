package stringsLearn;

public class ArrayFunctions {

	public static void main(String[] args) {
		
		String s="welcome to Java program";
		
		
		char c[]=s.toCharArray();
	
		
		
		
		for(char cc:c)
		{
			System.out.println(cc);
		}
		
		String sArray[]=s.split(" ");
		for(String ss:sArray)
		{
			System.out.println(ss);
		}

	}

}
