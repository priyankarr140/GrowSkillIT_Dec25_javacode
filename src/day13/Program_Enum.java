package day13;
enum Courses
{
	Java,
	Python,
	C,
	Selenium
};
class StudentRecord
{
	int rollNo;
	String name;
	Courses course;
	public StudentRecord(int rollNo, String name, Courses course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}	
}
public class Program_Enum {
	public static void main(String[] args) {
		StudentRecord obj=
				new StudentRecord(101,"Rahul",Courses.Java);
		System.out.println(obj.name+":"+obj.course);
		

	}

}
