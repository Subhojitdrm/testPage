package com.test.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestUtils {
	
	
	//read Properties 
	
	
	public static String readPropety(String propertyName) {
		Properties prop=new Properties();
		FileInputStream fis=null;
		String propPath=System.getProperty("user.dir")+"\\src\\main\\java\\com\\test\\utils\\config.properties";
		try {
			fis = new FileInputStream(propPath);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		return prop.getProperty("propertyName");
	
	}
	
	public static Object[][] getExcelData(String sheetName) throws FileNotFoundException{
		
		FileInputStream fis=new FileInputStream("00");
		
		
		return null;
	}

}
