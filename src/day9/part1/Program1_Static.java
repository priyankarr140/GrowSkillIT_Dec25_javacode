package day9.part1;
import day9.part2.*;
class Student
{
	String name;
	int age;
	final static String batchName="GSIDEC25";
}
public class Program1_Static {
	static void sum()
	{
		
	}
	public static void main(String[] args) {
		//Program1_Static obj=new Program1_Static();
		//obj.sum();
		sum();
		//Student.batchName="GSIDEC25";
		Student s1=new Student();
		//s1.batchName="GSIDEC26";
		System.out.println(Student.batchName);
		//UserTest.

	}

}
