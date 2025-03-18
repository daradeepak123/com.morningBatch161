package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionsLearn {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		int a=10,b=50,c=0,d;
		
		d=a+b;
		System.out.println(d);
		
		
		d=a-b;
		System.out.println(d);
		
		
		try {
		d=a/c;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println(d);
		
		d=a*b;
		System.out.println(d);
		
		
		
		
		
		File file=new File("");
		FileInputStream fis=new FileInputStream(file);
		

	}

}
