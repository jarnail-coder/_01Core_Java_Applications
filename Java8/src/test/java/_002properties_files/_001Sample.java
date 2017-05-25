package _002properties_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class _001Sample {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("prop.properties");
			Properties properties = new Properties();
			properties.setProperty("name", "Jarnail Singh");
			properties.setProperty("address", "#3341,Sec 21D,CHD");
			properties.setProperty("school", "diana");
			properties.store(fos, "This is my prop.properties file");
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		main1(args);
	}

	public static void main1(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("prop.properties");
			Properties properties = new Properties();
			properties.load(fis);
			System.out.println("name=" + properties.getProperty("name"));
			System.out.println("address=" + properties.getProperty("address"));
			System.out.println("school=" + properties.getProperty("school"));
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
