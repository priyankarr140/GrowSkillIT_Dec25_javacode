package day8;
class ExamA
{
	final int examCodeA=101;
}
final class ExamB
{
	
}
class ExamC extends ExamB
{
	
}
class ExamD
{
	final void hello()
	{
		System.out.println("hello");
	}
}
class ExamE extends ExamD
{
	void hello()
	{
		
	}
}
public class Program3_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamA exam=new ExamA();
		System.out.println(exam.examCodeA);
		

	}

}
