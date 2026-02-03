package day9.part2;

import java.util.LinkedHashSet;

interface ITestA
{
	int num1=10;
	void add();
	default void hello()
	{
		System.out.println("hello");
	}
}
interface ITestB
{
	int num1=20;
	void add();
	
}
class TestE implements ITestA,ITestB
{
	public void add()
	{
		System.out.println(num1);
	}
	public void bye()
	{
		
	}
}
public class Program2_MultipleInheritance {
	public static void main(String[] args) {
		

	}

}
