package testcases;

import java.util.Properties;
import java.io.*;

public class ReadFile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		prop.load(new FileInputStream
				("D:\\eclipse-workspace2\\growskillit\\src\\testcases\\data.properties"));
		System.out.println(prop.getProperty("url"));
		
		

	}

}
