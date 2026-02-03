package day9.part2;

public interface ITest {	
		//final //public //static
		 int num=10;
		abstract void hello();
		 default void bye()
		 {
			System.out.println("BYE"); 
		 }
		 static void hello2()
		 {
			 
		 }
}
class TestM implements ITest
{
	public void hello()
	{
		
	}
	public void bye()
	{
		
	}
	
}
