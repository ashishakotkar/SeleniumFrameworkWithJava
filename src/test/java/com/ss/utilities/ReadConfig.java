package com.ss.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	Properties prop;
	
	public ReadConfig() throws IOException {
		File file = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getBrowserName() {
		return prop.getProperty("browser");
	}
	
	public String getBaseUrl() {
		return prop.getProperty("baseurl");
	}
	
	public String getAssertMessage() {
		return prop.getProperty("assertmessage");
	}

}
