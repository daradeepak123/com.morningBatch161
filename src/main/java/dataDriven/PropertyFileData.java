package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileData {
	
	
	public static String retriveProperty(String  path,String property) throws Exception
	{
		File file = new File(System.getProperty("user.dir") + path);

		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
				
		return prop.getProperty(property);
	}

}
