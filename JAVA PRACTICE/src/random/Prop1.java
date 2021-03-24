package random;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("propex.properties");
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
	}

}
