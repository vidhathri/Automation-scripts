package automationFramework;


	
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Enumeration;
	import java.util.Properties;

	public class Login  {
		
		public static void main(String[] args) {
			
				File file = new File ("/Users/vidhathri/Documents/workspace1/Happy-Test/bin/dataFile.properties");
				FileInputStream fileInput = null;
				try {
					fileInput = new FileInputStream(file);
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				Properties prop = new Properties();
				try {
					prop.load(fileInput);
				} catch (IOException e) {
					e.printStackTrace();
				}

				Enumeration KeyValues = prop.keys();
				while (KeyValues.hasMoreElements()) {
					String key = (String) KeyValues.nextElement();
					String value = prop.getProperty(key);
					System.out.println(key + ":- " + value);
				}
		}
	}
