package day14;

import java.io.File;
import java.io.*;

public class Program_Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Priyanka Arora\\Desktop\\testFile.txt");
		try(FileWriter fr=new FileWriter(file,true)) {
			
		fr.write("\nfive");
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}

	}

}
