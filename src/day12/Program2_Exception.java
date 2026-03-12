package day12;
import java.io.*;
public class Program2_Exception {
	public static void main(String[] args) {
		try {
			System.out.println("hello");
			int num2=10/10;
			int num[]= {10,20,30};
			System.out.println(num[1]);
			System.out.println("bye");
			System.exit(1);			
		}		
		catch(ArithmeticException ex)
		{
			
			System.out.println("SPECIFIC EXCEPTION");
		}
		catch(Exception ex)
		{
			System.out.println("GENERIC EXCEPTION");			
		}
		finally
		{
			System.out.println("i will always execute");
		}
		
		
		
	

	}

}
