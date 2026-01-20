package day8;
class Test
{
	void hello()
	{
		System.out.println("hello");
	}
}
class TestA extends Test
{
	void hello()
	{
		System.out.println("bye");
	}
}
public class Program2_Overriding {
	public static void main(String[] args) {
		TestA obj=new TestA();
		obj.hello();

	}

}
