package propertyFIleLearn;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;


public class RetrivePropertyData {

	public static void main(String[] args) throws Exception {


		File file = new File(System.getProperty("user.dir") + "/src/data/config.properties");

		FileInputStream fis=new FileInputStream(file);
		
		Properties prop=new Properties();
		prop.load(fis);
		
		System.out.println(prop.getProperty("browser"));

	}

}
