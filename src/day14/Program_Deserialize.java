package day14;

import java.io.File;
import java.io.FileInputStream;
import java.io.*;
import java.io.ObjectOutputStream;

public class Program_Deserialize {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		File file=new File("C:\\Users\\Priyanka Arora\\Desktop\\testFile.txt");

		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		User obj=(User)ois.readObject();
		System.out.println(obj.usernam+":"+obj.password);

	}

}
