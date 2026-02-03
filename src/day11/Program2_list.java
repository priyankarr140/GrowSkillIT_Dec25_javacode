package day11;
import java.util.*;
class Student
{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
	
		this.rollNo = rollNo;
		this.name = name;
	}
}
public class Program2_list {
	public static void main(String[] args) {
		ArrayList<Student>list=new ArrayList<Student>();
		Student s1=new Student(101,"Rahul");
		Student s2=new Student(102,"Rajat");
		Student s3=new Student(103,"Shreya");
		list.add(s1);list.add(s2);list.add(s3);
		for(Student s:list)
		{
			System.out.println(s.rollNo+":"+s.name);
		}
		Stack<Integer>stack=new Stack<Integer>();

	}

}
