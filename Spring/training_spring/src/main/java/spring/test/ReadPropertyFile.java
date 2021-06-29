package spring.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public class ReadPropertyFile {


	private Properties properties;
	public ReadPropertyFile(String propertyFileName) {

		properties= new Properties();
		try {
			properties.load(new FileReader(propertyFileName));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public String getPropertyFor(String key) {

		String value = properties.getProperty(key);
		if(value == null) {
			try {
				throw new Exception(key + " not found!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value;
	}

	public void checkPropertyValue(String key,String value) {

		try {
			if(Objects.equals(getPropertyFor(key), value)){
				System.out.println(key + ":" + getPropertyFor(key)+ "==" + value);
			}else {
				throw new Exception(key + ":" + getPropertyFor(key)+ "!=" + value); 
				
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}