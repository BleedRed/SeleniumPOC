package practice.ecoomerceAutomation.Utils;

import java.io.*;
import java.util.*;

public class ReadPropertiesFile {

	private static String propertiesData;

	public static String readPropertiesFile(String inputData) throws IOException {
		FileInputStream fis = null;
		Properties prop = null;
		try {
			fis = new FileInputStream(
					"C:\\Users\\shuva\\Downloads\\ecoomerceAutomation\\src\\test\\java\\TestResources\\dataFile.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			fis.close();
		}
		propertiesData = prop.getProperty(inputData);
		return propertiesData;
		
	}
}