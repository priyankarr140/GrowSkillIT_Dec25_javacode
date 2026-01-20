package day9;

class TestA 
{
	int numA;
	void  bye()
	{
		
	}
	TestA(int numA)
	{
		this.numA=numA;
		System.out.println("Parent Called");
	}	
}
class TestB extends TestA
{
	int numB;
	TestB(int numA,int numB)
	{
		super(numA);
		this.numB=numB;
		int num=10;
		System.out.println("Child Called");
	}
	void hello()
	{
		super.bye();
	}
}
public class Program1_Super {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestB obj=new TestB(10);

	}

}
