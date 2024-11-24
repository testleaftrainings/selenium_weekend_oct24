package week7.day2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFIle {

	
	public static void main(String[] args) throws IOException {
		
//		1. Set the file path into FileInputStream constructor
		FileInputStream fis = new FileInputStream("./src/main/resources/Credentials.properties");
//	    2. Create object reference for properties class
		Properties prop = new Properties();
//	    3. load the FileInputStream into the properties by load()
		prop.load(fis);
//	    4. Read the value by using key , use method getProperty(String key)
		String uname = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		System.out.println("The username is "+uname);
		System.out.println("The password is "+pwd);
		prop.setProperty("username2", "democsr");
		String uname2 = prop.getProperty("username2");
		System.out.println("The username2 is "+uname2);
	}
	
}
